import cl.CuentaBancaria.clases.Cliente;

public class Main {
    public static void main(String[] args) {

        Cliente cliente = Cliente.crearClienteDesdeConsola();
        cliente.getCuentaCliente().mostrarInformacionCuentaCorriente();
    }
}
