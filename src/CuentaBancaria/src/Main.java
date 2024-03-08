import cl.CuentaBancaria.Clases.Cuenta;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Esto es un objeto // 2 formas

        Scanner scanner = new Scanner(System.in);
        Cuenta cuenta = new Cuenta();
        Cuenta cuenta2 = new Cuenta(127863, "Nicole Chavez", 10000);

        //Llenando la clase

        cuenta.numeroCuenta = 654321;
        cuenta.titularCuenta = "Javier Alcántara";
        cuenta.saldoCuenta = 10000;

        cuenta.mostrarInformacionCuentaCoriente();
        cuenta2.mostrarInformacionCuentaCoriente();
    }
}

