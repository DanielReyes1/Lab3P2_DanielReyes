
package lab3p2_danielreyes;




public class Vehiculo {
    protected String color;
    protected String marca;
    protected String modelo;
    protected int fecha;
    protected double precio;
    protected int llanta;

    public Vehiculo() {
    }

    public Vehiculo(String color,String modelo, String marca, int fecha, double precio, int llanta) {
        this.color = color;
        this.marca = marca;
        this.fecha = fecha;
        this.precio = precio;
        this.llanta = llanta;
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getLlanta() {
        return llanta;
    }

    public void setLlanta(int llanta) {
        this.llanta = llanta;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "color=" + color + ", marca=" + marca + ", fecha=" + fecha + ", precio=" + precio + ", llanta=" + llanta + '}';
    }
    
    
}
