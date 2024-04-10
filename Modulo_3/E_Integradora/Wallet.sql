-- Creación de Base de Datos
CREATE DATABASE IF NOT EXISTS Wallet;

-- Usar está base de datos
USE wallet;

-- Tabla Monedas
CREATE TABLE IF NOT EXISTS Coins (
	coin_id INT PRIMARY KEY AUTO_INCREMENT,
    coin_name VARCHAR(50) NOT NULL,
    coin_symbol VARCHAR(5)
);

-- Tabla Usuarios
CREATE TABLE IF NOT EXISTS Users(
	user_id INT PRIMARY KEY AUTO_INCREMENT,
	tax_identification VARCHAR(50) NOT NULL,
    firstName VARCHAR(100) NOT NULL,
    lastName VARCHAR(100) NOT NULL,
    email VARCHAR (80) NOT NULL,
    user_password VARCHAR (100) NOT NULL
);

-- Tabla Cuentas Corrientes 
CREATE TABLE IF NOT EXISTS CheckingAccounts(
	checking_account_id INT PRIMARY KEY AUTO_INCREMENT,
    account_type VARCHAR(50),
    balance DECIMAL (10,2) DEFAULT 0,
	creation_date DATE NOT NULL,
    coin_id INT,
    user_id INT,
    FOREIGN KEY (user_id) REFERENCES Users(user_id) ON DELETE CASCADE,
    FOREIGN KEY (coin_id) REFERENCES Coins(coin_id)
);

-- Tabla Transacciones
CREATE TABLE IF NOT EXISTS Transactions(
	transaction_id INT PRIMARY KEY AUTO_INCREMENT,
    amount DECIMAL(10,2) NOT NULL,
    transaction_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    sender_user_id INT NOT NULL,
    receiver_user_id INT NOT NULL,
    coin_id INT NOT NULL,
    checking_account_id INT NOT NULL,
    FOREIGN KEY (sender_user_id) REFERENCES Users(user_id) ON DELETE CASCADE,
    FOREIGN KEY (receiver_user_id) REFERENCES Users(user_id) ON DELETE CASCADE,
    FOREIGN KEY (coin_id) REFERENCES Coins(coin_id),
    FOREIGN KEY (checking_account_id) REFERENCES checkingAccounts(checking_account_id) ON DELETE CASCADE
);

-- Llenado de Datos
INSERT INTO coins (coin_name, coin_symbol)
VALUES	('Peso','$'),
		('Dolar','$'),
		('Euro','Є'),
        ('Yen','¥'),
        ('Libra','£');
        
INSERT INTO Users ( tax_identification, firstName, lastName, email, user_password)
VALUES ('18.888.888-8', 'Javier', 'Alcántara', 'javier.alcantara.canto@gmail.com', sha2('12345',256)),
	   ('17.777.777-7', 'Nicole', 'Chavez', 'nicole@gmail.com', sha2('54321',256)),
       ('11.111.111-1', 'Maite', 'Escobar', 'maite@gmail.com', sha2('45678',256));
       
INSERT INTO checkingAccounts( account_type, balance, creation_date , coin_id , user_id)
VALUES ('Cuenta Vista',  100000, '2020-03-14', 1 , 1),
	   ('Cuenta Corriente',  1000000, '2021-01-01', 2 , 1),
	   ('Cuenta Vista',  50000, '2020-03-14', 1 , 2),
	   ('Cuenta Corriente',  2000000, '2020-03-14', 2 , 2),
	   ('Cuenta Vista',  10000, '2020-03-14', 1 , 3),
	   ('Cuenta Vista',  10000, '2020-03-14', 1 , 3),
	   ('Cuenta Vista',  10000, '2020-03-14', 1 , 3),
	   ('Cuenta Vista',  10000, '2020-03-14', 1 , 3),
	   ('Cuenta Vista',  10000, '2020-03-14', 1 , 3);
       
INSERT INTO Transactions( amount , sender_user_id, receiver_user_id, coin_id, checking_account_id)
VALUES (10000,1,2,1,1),
       (20000,2,3,2,2),
       (50000,3,2,1,3),
       (10,3,2,1,3);

-- Consulta para obtener el nombre de la moneda elegida por un usuario específico
SELECT c.coin_name
FROM Transactions t
JOIN Coins c ON t.coin_id = c.coin_id
JOIN Users u ON t.sender_user_id = u.user_id
WHERE u.user_id = 1;

SELECT a.checking_account_id AS 'Nro Cuenta', a.account_type AS 'Tipo Cuenta', c.coin_name AS 'Moneda'
FROM CheckingAccounts a
JOIN Coins c ON a.coin_id = c.coin_id
WHERE a.user_id = 1;

-- Consulta para obtener las transacciones realizadas por un usuario específico
SELECT *
FROM Transactions
WHERE sender_user_id = 2 or receiver_user_id = 2;

-- Consulta para obtener todos los usuarios registrados
SELECT * FROM Users;

-- Consulta para obtener todas las monedas registradas
SELECT * FROM Coins;

-- Consulta para obtener todas las transacciones registradas
SELECT * FROM Transactions;

-- Consulta para obtener todas las transacciones realizadas por un usuario específico
SELECT * FROM Transactions
WHERE sender_user_id = 1;

-- Consulta para obtener todas las transacciones recibidas por un usuario específico
SELECT * FROM Transactions
WHERE receiver_user_id = 2;

-- Sentencia DML para modificar el campo correo electrónico de un usuario específico
SET SQL_SAFE_UPDATES = 0;
UPDATE Users
SET email = 'javier@gmail.com'
WHERE tax_identification = '18.888.888-8';
SET SQL_SAFE_UPDATES = 1;

SELECT * FROM Users;

-- Sentencia para eliminar los datos de una transacción (eliminado de la fila completa)
DELETE FROM Transactions
WHERE transaction_id = 4;

-- Sentencia para DDL modificar el nombre de la columna correo_electronico por email
ALTER TABLE Users
CHANGE COLUMN email electronic_mail VARCHAR(80) NOT NULL;


/*
	1. ¿Qué tipo de relación existe entre las entidades Usuario y Transacción?
    
	Primero que todo tienen una relacion de uno a muchos donde un usuario puede tener muchas transacciones.
    Además tiene 2 relaciones, las cuales serian sender_user_id y receiver_user_id.
    sender_user_id -> es el usuario que realiza la transaccion
    receiver_user_id -> es el usuario que recibe la transaccion
*/

/* 
	2. ¿Cómo podemos asegurarnos de que cada transacción está asociada al usuario emisor y receptor correctos?
    Para esto podemos utilizar el principio ACID.
    A continuación realice un procedimiento almacenado para una transaccion segura, que verifica la existencia de los usuarios para realizar la transaccion.
*/
DELIMITER //
CREATE PROCEDURE Secure_Transaction(checking_account_id_sender INT, checking_account_id_receiver INT)
BEGIN
    DECLARE sender_coin_id INT;
    DECLARE receiver_coin_id INT;    
    DECLARE sender_user_id INT;
    DECLARE receiver_user_id INT;

    SELECT coin_id INTO sender_coin_id FROM CheckingAccounts WHERE checking_account_id = checking_account_id_sender;
    SELECT coin_id INTO receiver_coin_id FROM CheckingAccounts WHERE checking_account_id = checking_account_id_receiver;
    SELECT user_id INTO sender_user_id FROM checkingAccounts WHERE checking_account_id = checking_account_id_sender;
    SELECT user_id INTO receiver_user_id FROM checkingAccounts WHERE checking_account_id = checking_account_id_receiver;

    IF sender_coin_id IS NOT NULL AND receiver_coin_id IS NOT NULL THEN
        IF sender_coin_id = receiver_coin_id THEN
            START TRANSACTION;
            INSERT INTO Transactions (amount, sender_user_id, receiver_user_id, coin_id, checking_account_id)
            VALUES (100, sender_user_id, receiver_user_id, sender_coin_id, checking_account_id_sender);
            COMMIT;
            SELECT 'Transferencia realizada con éxito' AS Mensaje;
        ELSE
            SELECT 'Las cuentas no tienen el mismo tipo de moneda. Transferencia cancelada' AS Mensaje;
        END IF;
    ELSE
        SELECT 'Al menos una de las cuentas no existe. Transferencia cancelada' AS Mensaje;
    END IF;
END //
DELIMITER ;
CALL Secure_Transaction(1,3);
CALL Secure_Transaction(1,2);
SELECT * FROM transactions;

/*
	3. ¿Cómo manejaremos la relación entre la entidad Transacción y la entidad Moneda?
    
    La relacion es de uno a muchos, donde una moneda puede estar en muchas transacciones.
    Esto debido a que cada transacción se puede realizar en distintos tipos de moneda.
*/

/*
	4. ¿Cuál debería ser la clave primaria de cada entidad para garantizar la unicidad?
     
	Para todo he utilizado un ID auto incremental, esto hara que cada entidad tenga un ID unico.
    A demás en Usuarios tambien es posible manejar la unicidad con el TAX IDENTIFICATION (RUT), ya que este número de identidad es unico para cada individuo.
*/

/*
	5. ¿Qué restricciones debemos aplicar para mantener la integridad de los datos?
    
    Primero las claves tanto primarias como foraneas, para no dejar datos inconsistentes entre tablas, tambien podemos definir
    el tipo de cada atributo, como por ejemplo INT, VARCHAR y si esté puede o no estar nulo, con esto aseguramos que los valores ingresados sean correctos.
    Podemos realizar a demás procedimientos almacenados o triggers para ayudar.
*/

