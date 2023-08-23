package GUI;

import Modelo.Cliente;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class Vista extends JFrame {
    private JTextField saldo;
    private JTextField montoExtraer;
    private JButton extraerButton;
    private JTextField montoDepositar;
    private JButton depositarButton;
    private JPanel vistaMain;
    private JComboBox clientes;
    private JTextField nombreCliente;


    public Vista() {
        setTitle("Cuenta de banco");
        setContentPane(getVistaMain());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        pack();

    }

    public void mostrarClientes(ArrayList<Cliente> listaClientes){
        clientes.removeAllItems();
        for (Cliente cliente :
                listaClientes) {
            clientes.addItem(cliente.getNombre());
        }
    }
    public JTextField getSaldo() {
        return saldo;
    }

    public void setSaldo(JTextField saldo) {
        this.saldo = saldo;
    }

    public JTextField getMontoExtraer() {
        return montoExtraer;
    }

    public void setMontoExtraer(JTextField montoExtraer) {
        this.montoExtraer = montoExtraer;
    }

    public JButton getExtraerButton() {
        return extraerButton;
    }

    public void setExtraerButton(JButton extraerButton) {
        this.extraerButton = extraerButton;
    }

    public JTextField getMontoDepositar() {
        return montoDepositar;
    }

    public void setMontoDepositar(JTextField montoDepositar) {
        this.montoDepositar = montoDepositar;
    }

    public JButton getDepositarButton() {
        return depositarButton;
    }

    public void setDepositarButton(JButton depositarButton) {
        this.depositarButton = depositarButton;
    }

    public JPanel getVistaMain() {
        return vistaMain;
    }

    public void setVistaMain(JPanel vistaMain) {
        this.vistaMain = vistaMain;
    }

    public JComboBox getClientes() {
        return clientes;
    }

    public void setClientes(JComboBox clientes) {
        this.clientes = clientes;
    }

    public JTextField getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(JTextField nombreCliente) {
        this.nombreCliente = nombreCliente;
    }
}