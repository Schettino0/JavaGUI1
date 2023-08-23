package Modelo;

public class Cliente {
    private String nombre;
    private int edad;
    private Cuenta cuenta;

    public Cliente(String nombre) {
        this.nombre = nombre;
        this.edad = 18;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

    public void asociarCuenta(Cuenta cuenta){
        setCuenta(cuenta);

    }
}
