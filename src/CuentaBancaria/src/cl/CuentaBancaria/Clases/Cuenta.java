package cl.CuentaBancaria.Clases;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Cuenta {
    /*
    1) Atributos de una clase
     */
    // modificadores de Acceso

    public int numeroCuenta;
    public String titularCuenta;
    public double saldoCuenta;

    /*
    2) Constructor
     */
    public Cuenta() {

    }

    public Cuenta(int numeroCuenta, String titularCuenta, double saldoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.titularCuenta = titularCuenta;
        this.saldoCuenta = saldoCuenta;
    }

    /*
    3) Métodos de accesos
     */



    /*
    4) Métodos de comportamiento
     */
    public void mostrarInformacionCuentaCoriente() {
        String formatocuenta;
        System.out.println("Número de cuenta:" + numeroCuenta);
        System.out.println(" Titular:" + titularCuenta);
        System.out.println("Saldo: $ " + saldoCuenta);
    }
    // CrearCuenta
    // AgregarSaldo
    // RestarSaldo
    // MostrarInformacion
    // VerSaldo
    // ConversorMoneda
    // Menu


    /*
    Opcional
    5) Métodos utilitarios o de lógica
     */
    private String formatoSaldo(double saldo) {
        DecimalFormat formatoSaldo = new DecimalFormat("#.###");
        return formatoSaldo.format(saldo);

    }
}
