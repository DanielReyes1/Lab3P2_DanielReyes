
package lab3p2_danielreyes;

import java.util.ArrayList;


public class Concesionaria {
    
    private String nombre;
    private int id;
    private String direccion;
    private ArrayList<Vehiculo> auto = new ArrayList();
    private ArrayList<Cliente> persona = new ArrayList();
    private int saldo;

    public Concesionaria() {
    }

    public Concesionaria(String nombre, int id, String direccion, int saldo) {
        this.nombre = nombre;
        this.id = id;
        this.direccion = direccion;
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public ArrayList<Vehiculo> getAuto() {
        return auto;
    }

    public void setAuto(ArrayList<Vehiculo> auto) {
        this.auto = auto;
    }

    public ArrayList<Cliente> getPersona() {
        return persona;
    }

    public void setPersona(ArrayList<Cliente> persona) {
        this.persona = persona;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Concesionaria{" + "nombre=" + nombre + ", id=" + id + ", direccion=" + direccion + ", auto=" + auto + ", persona=" + persona + ", saldo=" + saldo + '}';
    }
    
    
}
