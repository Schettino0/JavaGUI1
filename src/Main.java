import Controlador.Controlador;
import GUI.Vista;
import Modelo.Cliente;
import Modelo.Cuenta;

import javax.swing.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Cliente> listaClientes = new ArrayList<>();
        Cliente cliente1 = new Cliente("Eduardo");
        Cliente cliente2 = new Cliente("Carolina");
        cliente1.asociarCuenta(new Cuenta(cliente1));
        cliente2.asociarCuenta(new Cuenta(cliente2));
        listaClientes.add(cliente1);
        listaClientes.add(cliente2);
       cliente2.getCuenta().setSaldo(30000);

        Vista vista = new Vista();
        Controlador controlador = new Controlador(vista, listaClientes);
        vista.setVisible(true);


    }
}