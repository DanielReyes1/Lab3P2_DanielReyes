
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
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                        }
                    }while(resp != 4);
                    }break;
                case 2:{
                    
                    }break;
                case 3:{
                    
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
        System.out.println("Ingrese el id de la empresa: ");
        int id = empresa.size()+1;
        System.out.println("Dirección de la empresa: ");
        String direccion = leer.nextLine();
        direccion = leer.nextLine();
        System.out.println("Saldo disponible: ");
        int saldo = leer.nextInt();
        Concesionaria temp;
        temp = new Concesionaria(name, id, direccion, saldo);
        empresa.add(temp);
        return temp;
    }
}
