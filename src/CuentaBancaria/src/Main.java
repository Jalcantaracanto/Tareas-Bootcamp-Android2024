import cl.CuentaBancaria.Clases.Cliente;
import cl.CuentaBancaria.Clases.Cuenta;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Cliente cliente = Cliente.crearClienteDesdeConsola();
        cliente.getCuentaCliente().mostrarInformacionCuentaCorriente();


    }
}

