
package lab3p2_danielreyes;

import java.awt.Color;


public class Bus extends Vehiculo{
    private int pasajeros;
    private String tipo;

    public Bus(){
        super();
    }
    public Bus(int pasajeros, String tipo, String color, String modelo, String marca, int fecha, double precio, int llanta) {
        super(color, modelo, marca, fecha, precio, llanta);
        this.pasajeros = pasajeros;
        this.tipo = tipo;
        if(pasajeros > 50){
            this.tipo = "De ruta";
        }else{
            this.tipo = "Rapidito";
        }
    }

    public int getPasajeros() {
        return pasajeros;
    }

    public void setPasajeros(int pasajeros) {
        this.pasajeros = pasajeros;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return super.toString()+"Bus{" + "pasajeros=" + pasajeros + ", tipo=" + tipo + '}';
    }
    
}
