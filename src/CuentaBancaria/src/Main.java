import cl.CuentaBancaria.Clases.Cuenta;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Esto es un objeto // 2 formas

        Scanner scanner = new Scanner(System.in);
        Cuenta cuenta = new Cuenta();
//        Cuenta cuenta2 = new Cuenta(127863, "Javier", 10000);

        //Llenando la clase

        cuenta.setNumeroCuenta(123213);
        cuenta.setTitularCuenta("Javier Alcántara");
        cuenta.setSaldoCuenta(10000);

        cuenta.mostrarInformacionCuentaCoriente();


//        cuenta2.mostrarInformacionCuentaCoriente();

//        System.out.println("Ingrese saldo: ");
//        double saldoNuevo = scanner.nextDouble();
//        cuenta2.IngresarDinero(saldoNuevo);
//        cuenta2.mostrarInformacionCuentaCoriente();
    }
}

