<div align="center" >
  <h1>Alke Wallet 🏦</h1>
  <p align="justify">
    Segundo trabajo realizado para bootcamp fullstack android. La segunda etapa consiste en realizar la base de datos para Alke Wallet.
  </p>
  <img src="https://github.com/Jalcantaracanto/Tareas-Bootcamp-Android2024/blob/master/Modulo_3/E_Integradora/Assets/MySQL.png" width="200" />
</div>

# Descripción
<div>
  <p align="justify">
    Han solicitado crear la Base de datos para Alke Wallet. La problematica a resolver es realizar el diseño de una base de datos relacional para gestionar un sistema de una Wallet, la cual permitiria almacenar,       gestionar fondos, realizar transacciones y ver el historial de transacciones.
  </p>
  <strong>Requerimientos Generales:</strong>
 <ul>
    <li>
    💰 Coherencia de los datos
    </li>
    <li>
     💵 Integridad de los datos
   </li>
 </ul>
</div>

 # Modelo Relacional
 <div align="center">
    <p align="justify">
      El modelo fue el siguiente:
    </p>
   <img src="https://github.com/Jalcantaracanto/Tareas-Bootcamp-Android2024/blob/master/Modulo_3/E_Integradora/Modelo Relacional.png" width="500" />
   
   <div align="justify">
     <p>
      He realizado 4 tablas que consisten en lo siguiente:
     </p>
     <ul>
       <li>
         CheckingAccounts (Cuenta Corriente)
       </li>
       <li>
         Coins (Moneda)
       </li>
       <li>
         Users (Usuarios)
       </li>
       <li>
         Transactions (Transacciones)
       </li>
     </ul>
     <p>
        Si bien el enunciado solicitaba la creación de tres tablas he realizado una adicional, ya que si bien un Usuario podría realizar una transacción, la realidad es que el usuario debiese manipular distintos tipos de cuentas bancarias y con estas realizar las transacciones que se estimen conveniente para un mejor manejo de los balances de cada cuenta y sus respectivas transacciones. Junto con esto, asocié un tipo de moneda a las cuentas corrientes, ya que se espera el manejo de distintas monedas en la base de datos, por consecuencia las transacciones deberían poder realizarse solo entre cuentas del mismo tipo de moneda.
     </p>
   </div>
 </div>

# Estado del Proyecto
<p align="justify">
Actualmente, la creación de la base de datos se encuentra finalizada en su primera etapa. Es posible que a futuro requieran cambios cuando se implemente Android y Kotlin.
</p>

# Tecnologias Utilizadas
 <ul>
    <li>
    📓 MySQL
    </li>
    <li>
     🟩 SQL
   </li>
 </ul>

# Conclusión

<p align="justify">
En conclusión, "Alke Wallet Data Base" garantiza la coherencia e integridad de datos, la cual proporciona flexibilidad en la gestión de transacciones y cuentas. El agregado de una tabla adicional y la asociación de tipos de moneda a las cuentas aseguran un manejo preciso y eficientes para las operaciones. Gracias a esto se sientan las bases para futuras integraciones con Android, Java u Kotlin, pudiendo haber posibles ajustes. 
</p>
<!--
*[Acceso al proyecto](#acceso-proyecto)
s
*[Conclusión](#conclusión)
 -->
