
package lab3p2_danielreyes;

import java.util.ArrayList;
import java.util.Scanner;


public class Lab3P2_DanielReyes {

   static Scanner leer = new Scanner(System.in); 
    static ArrayList<Concesionaria> empresa = new ArrayList();
    static ArrayList<Vehiculo> vehiculo = new ArrayList();
    static ArrayList<Cliente> cliente = new ArrayList();
   
   
   
    public static void main(String[] args) {
        int opcion;
        
        do{
            System.out.println("---------MENU----------");
            System.out.println("1- CRUD Concesionaria");
            System.out.println("2- CRUD Clientes");
            System.out.println("3- CRUD Vehículos");
            System.out.println("4- Compra/Venta");
            System.out.println("5- Salir");
            System.out.println("Eliga una opción: ");
            opcion = leer.nextInt();
            
            switch(opcion){
                case 1:{
                    int resp;
                    do{
                        System.out.println("--------CRUD Concesionaria---------");
                        System.out.println("1- Agregar concesionaria");
                        System.out.println("2- Modificar concesionaria");
                        System.out.println("3- Eliminar concesionaria");
                        System.out.println("4- Menu");
                        System.out.println("Ingrese una opción: ");
                        resp = leer.nextInt();
                        
                        switch(resp){
                            case 1:
                                crearC();
                                System.out.println("Se ha agregado exitosamente");
                                break;
                            case 2:
                                System.out.println("----Modificar------");
                                for (Object c : empresa) {
                                    if(c instanceof Concesionaria){
                                        System.out.println(""+empresa.indexOf(c)+"- "+empresa);
                                    }
                                }
                                System.out.println("Ingrese una opción para modificar la dirección: ");
                                int respuesta = leer.nextInt();
                                System.out.println("Ingrese una nueva dirección: ");
                                String dire = leer.nextLine();
                                dire = leer.nextLine();
                                empresa.get(respuesta).setDireccion(dire);
                                break;
                            case 3:
                                System.out.println("----Eliminar------");
                                for (Object c : empresa) {
                                    if(c instanceof Concesionaria){
                                        System.out.println(""+empresa.indexOf(c)+"- "+empresa);
                                    }
                                }
                                System.out.println("Ingrese una opción para eliminar concesionaria: ");
                                int answer= leer.nextInt();
                                empresa.remove(answer);
                                break;
                        }
                    }while(resp != 4);
                    }break;
                case 2:{
                    int resp;
                    do{
                        System.out.println("--------CRUD Clientes---------");
                        System.out.println("1- Agregar Cliente");
                        System.out.println("2- Eliminar Cliente");
                        System.out.println("3- Menu");
                        System.out.println("Ingrese una opción: ");
                        resp = leer.nextInt();
                        
                        switch(resp){
                            case 1:
                                crearCliente();
                                System.out.println("Se ha agregado exitosamente");
                                break;
                            case 2:
                                System.out.println("----Eliminar------");
                                for (Object cl : cliente) {
                                    if(cl instanceof Cliente){
                                        System.out.println(""+cliente.indexOf(cl)+"- "+cliente);
                                    }
                                }
                                System.out.println("Ingrese una opción para eliminar cliente: ");
                                int answer= leer.nextInt();
                                cliente.remove(answer);
                                break;
                        }
                    }while(resp != 3);
                    }break;
                case 3:{
                    int resp;
                    do{
                        System.out.println("--------CRUD Vehiculo---------");
                        System.out.println("1- Agregar vehiculo");
                        System.out.println("2- Modificar vehiculo");
                        System.out.println("3- Eliminar vehiculo");
                        System.out.println("4- Menu");
                        System.out.println("Ingrese una opción: ");
                        resp = leer.nextInt();
                        
                        switch(resp){
                            case 1:
                                crearV();
                                System.out.println("Se ha agregado exitosamente");
                                break;
                            case 2:
                                System.out.println("----Modificar------");
                                for (Object v : vehiculo) {
                                    if(v instanceof Vehiculo){
                                        System.out.println(""+vehiculo.indexOf(v)+"- "+vehiculo);
                                    }
                                }
                                System.out.println("Ingrese una opción para modificar: ");
                                int respuesta = leer.nextInt();
                                vehiculo.remove(respuesta);
                                vehiculo.add(crearV());
                                break;
                            case 3:
                                System.out.println("----Eliminar------");
                                for (Object v : empresa) {
                                    if(v instanceof Vehiculo){
                                        System.out.println(""+vehiculo.indexOf(v)+"- "+vehiculo);
                                    }
                                }
                                System.out.println("Ingrese una opción para eliminar vehiculo: ");
                                int answer= leer.nextInt();
                                vehiculo.remove(answer);
                                break;
                        }
                    }while(resp != 4);
                    }break;
                case 4:{
                    
                    }break;
            }
        }while(opcion != 5);
        
        
    }
    static Concesionaria crearC(){
        System.out.println("Ingrese el nombre de la empresa: ");
        String name = leer.nextLine();
        name = leer.nextLine();
        int id = empresa.size()+1;
        System.out.println("Dirección de la empresa: ");
        String direccion = leer.nextLine();
        direccion = leer.next();
        System.out.println("Saldo disponible: ");
        int saldo = leer.nextInt();
        Concesionaria temp;
        temp = new Concesionaria(name, id, direccion, saldo);
        empresa.add(temp);
        return temp;
    }
    static Cliente crearCliente(){
        int id = cliente.size()+1;
        System.out.println("Nombre del cliente: ");
        String nom = leer.nextLine();
        nom = leer.next();
        System.out.println("Dinero del cliente: ");
        double dinero = leer.nextDouble();
        Cliente nuevo;
        nuevo = new Cliente(id,nom,dinero);
        cliente.add(nuevo);
        return nuevo;
                
    }
    static Vehiculo crearV(){
        System.out.println("Ingrese un color: ");
        String color = leer.nextLine();
        color = leer.next();
        System.out.println("Ingrese un modelo: ");
        String modelo = leer.nextLine();
        modelo = leer.next();
        System.out.println("Ingrese una marca: ");
        String marca = leer.nextLine();
        marca = leer.next();
        System.out.println("Ingrese un año: ");
        int fecha = leer.nextInt();
        System.out.println("Precio del vehiculo: ");
        double precio = leer.nextDouble();
        System.out.println("Llantas del vehiculo: ");
        int llanta = leer.nextInt();
        

        boolean b = false;
        do{
            if(llanta == 2 || llanta == 4){
                b = true;
            }else{
                System.out.println("Llantas del vehiculo: ");
                llanta = leer.nextInt();
                b = false;
            }
        }while(b != true);
        
        if(llanta == 2){
            System.out.println("1- Motocicleta \n2- Bicicleta \n Ingrese un número: ");
            int op = leer.nextInt();
            switch(op){
                case 1:{
                    boolean e = false;
                    System.out.println("Desplazamiento de su motor: ");
                    int desp = leer.nextInt();
                    System.out.println("Es eléctrica\n 1- Si \n2- No");
                    int electrica = leer.nextInt();
                    if (electrica == 1){
                        e = true;
                    }else{
                        e = false;
                    }
                    Moticicleta moto;
                    moto = new Moticicleta(desp, e, color, modelo, marca, fecha, precio, llanta);
                    vehiculo.add(moto);
                    return moto;
                    }
                case 2:{
                    }break;
            }
        }
        
        return new Vehiculo();
    }
    
}
