
package lab3p2_danielreyes;


public class Moticicleta extends Vehiculo {
    private int desplazamiento;
    private boolean electrica;

    public Moticicleta(){
        super();
    }
    public Moticicleta(int desplazamiento, boolean electrica, String color, String modelo, String marca, int fecha, double precio, int llanta) {
        super(color, modelo, marca, fecha, precio, llanta);
        this.desplazamiento = desplazamiento;
        this.electrica = electrica;
    }

    public int getDesplazamiento() {
        return desplazamiento;
    }

    public void setDesplazamiento(int desplazamiento) {
        this.desplazamiento = desplazamiento;
    }

    public boolean isElectrica() {
        return electrica;
    }

    public void setElectrica(boolean electrica) {
        this.electrica = electrica;
    }

    @Override
    public String toString() {
        return super.toString()+"Moticicleta{" + "desplazamiento=" + desplazamiento + ", electrica=" + electrica + '}';
    }
    
}
