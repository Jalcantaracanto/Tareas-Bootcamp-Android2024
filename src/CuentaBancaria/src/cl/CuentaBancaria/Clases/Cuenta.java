package cl.CuentaBancaria.Clases;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Cuenta {
    /*
    1) Atributos de una clase
     */
    // modificadores de Acceso

    private int numeroCuenta;
    private String titularCuenta;
    private double saldoCuenta;

    /*
    2) Constructor
     */
    public Cuenta() {

    }

    /**
     * Constructor con parametro
     *
     * @param numeroCuenta  número de cuenta Bancaria
     * @param titularCuenta Titular de cuenta Bancaria
     * @param saldoCuenta   Saldo disponible en su cuenta
     */
//    public Cuenta(int numeroCuenta, String titularCuenta, double saldoCuenta) {
//        this.numeroCuenta = numeroCuenta;
//        this.titularCuenta = titularCuenta;
//        this.saldoCuenta = saldoCuenta;
//    }

    /*
    3) Métodos de accesos
     */
    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getTitularCuenta() {
        return titularCuenta;
    }

    public void setTitularCuenta(String titularCuenta) {
        this.titularCuenta = titularCuenta;
    }

    public double getSaldoCuenta() {
        return saldoCuenta;
    }

    public void setSaldoCuenta(double saldoCuenta) {
        this.saldoCuenta = saldoCuenta;
    }

    /*
        4) Métodos de comportamiento
         */
    public void mostrarInformacionCuentaCoriente() {
        String formatocuenta;
        System.out.println("Número de cuenta:" + numeroCuenta);
        System.out.println(" Titular:" + titularCuenta);
        System.out.println("Saldo: $ " + saldoCuenta);
    }

    public void IngresarDinero(double nuevoSaldo) {
        this.saldoCuenta += nuevoSaldo;
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
