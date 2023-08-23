package Controlador;

import GUI.Vista;
import Modelo.Cliente;
import Modelo.Cuenta;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Controlador {
    private Vista vista;
    private ArrayList<Cliente> listaClientes;

    public Controlador(Vista vista, ArrayList<Cliente> listaClientes) {
        this.vista = vista;
        this.listaClientes = listaClientes;
        vista.mostrarClientes(listaClientes);
        int selectedIndex = vista.getClientes().getSelectedIndex();
        Cliente clienteSeleccionado = listaClientes.get(selectedIndex);
        vista.getSaldo().setText(String.valueOf(clienteSeleccionado.getCuenta().getSaldo()));


        vista.getClientes().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = vista.getClientes().getSelectedIndex();
                Cliente clienteSeleccionado = listaClientes.get(selectedIndex);
                vista.getSaldo().setText(String.valueOf(clienteSeleccionado.getCuenta().getSaldo()));
            }
        });

        vista.getExtraerButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = vista.getClientes().getSelectedIndex();
                Cliente clienteSeleccionado = listaClientes.get(selectedIndex);
                clienteSeleccionado.getCuenta().extraer(Integer.parseInt(vista.getMontoExtraer().getText()));
                vista.getSaldo().setText(String.valueOf(clienteSeleccionado.getCuenta().getSaldo()));
                vista.getMontoExtraer().setText("0");
            }
        });

        vista.getDepositarButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = vista.getClientes().getSelectedIndex();
                Cliente clienteSeleccionado = listaClientes.get(selectedIndex);
                clienteSeleccionado.getCuenta().depositar(Integer.parseInt(vista.getMontoDepositar().getText()));
                vista.getSaldo().setText(String.valueOf(clienteSeleccionado.getCuenta().getSaldo()));
                vista.getMontoDepositar().setText("0");

            }
        });

    }


    public Vista getVista() {
        return vista;
    }

    public void setVista(Vista vista) {
        this.vista = vista;
    }

    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(ArrayList<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }
}
