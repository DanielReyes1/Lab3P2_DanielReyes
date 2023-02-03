
package lab3p2_danielreyes;

import java.awt.Color;


public class Camion extends Vehiculo{
    
    private int volumen;
    private int altura;
    private boolean retroexcavadora;

    public Camion() {
        super();
    }

    public Camion(int volumen, int altura, boolean retroexcavadora, String color, String modelo, String marca, int fecha, double precio, int llanta) {
        super(color, modelo, marca, fecha, precio, llanta);
        this.volumen = volumen;
        this.altura = altura;
        this.retroexcavadora = retroexcavadora;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public boolean isRetroexcavadora() {
        return retroexcavadora;
    }

    public void setRetroexcavadora(boolean retroexcavadora) {
        this.retroexcavadora = retroexcavadora;
    }

    @Override
    public String toString() {
        return super.toString()+"Camion{" + "volumen=" + volumen + ", altura=" + altura + ", retroexcavadora=" + retroexcavadora + '}';
    }
    
    
    
}
