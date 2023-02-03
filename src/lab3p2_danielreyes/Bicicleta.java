/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3p2_danielreyes;

/**
 *
 * @author alema
 */
public class Bicicleta extends Vehiculo {
    
    private String descripcion;
    private int radio;
    private boolean BMX;

    public Bicicleta(){
        super();
    }
    public Bicicleta(String descripcion, int radio, boolean BMX, String color, String modelo, String marca, int fecha, double precio, int llanta) {
        super(color, modelo, marca, fecha, precio, llanta);
        this.descripcion = descripcion;
        this.radio = radio;
        this.BMX = BMX;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getRadio() {
        return radio;
    }

    public void setRadio(int radio) {
        this.radio = radio;
    }

    public boolean isBMX() {
        return BMX;
    }

    public void setBMX(boolean BMX) {
        this.BMX = BMX;
    }

    @Override
    public String toString() {
        return super.toString()+"Bicicleta{" + "descripcion=" + descripcion + ", radio=" + radio + ", BMX=" + BMX + '}';
    }
    
    
}
