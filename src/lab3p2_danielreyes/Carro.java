
package lab3p2_danielreyes;

import java.awt.Color;


public class Carro extends Vehiculo{
    
    private int puertas;
    private String motor;
    private int velocidad;

    public Carro(){
        super();
    }
    public Carro(int puertas, String motor, int velocidad, String color, String modelo, String marca, int fecha, double precio, int llanta) {
        super(color, modelo, marca, fecha, precio, llanta);
        this.puertas = puertas;
        this.motor = motor;
        this.velocidad = velocidad;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return super.toString()+"Carro{" + "puertas=" + puertas + ", motor=" + motor + ", velocidad=" + velocidad + '}';
    }
    
    
}
