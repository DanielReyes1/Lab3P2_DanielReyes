
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
                    if(!empresa.isEmpty()){
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
                                for (Object v : vehiculo) {
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
                    }else{
                        System.out.println("Ocupa minimo una concesionaria");
                    }break;
                    }
                    
                case 4:{
                    
                    
                    
                    System.out.println("Compra y Venta");
                    System.out.println("Quien esta comprando: \n1- Concension     \n2- Cliente");
                    int respuesta = leer.nextInt();
                    if(respuesta == 1){
                        for (Object c : empresa) {
                                    if(c instanceof Concesionaria){
                                        System.out.println(""+empresa.indexOf(c)+"- "+empresa);
                                    }
                                }
                        System.out.println("Ingrese su concesion: ");
                        int consencion = leer.nextInt();
                        for (Vehiculo v : vehiculo) {
                            if(v instanceof Vehiculo){
                                System.out.println(""+vehiculo.indexOf(v)+"- "+vehiculo);
                            }
                        }
                        System.out.println("Cual vehiculo desea comprar: ");
                        int veh = leer.nextInt();
                        if( ((Concesionaria)empresa.get(consencion)).getSaldo() >= vehiculo.get(veh).getPrecio()  ){
                            ((Concesionaria)empresa.get(consencion)).getAuto().add(vehiculo.get(veh));
                            double temporal=((Concesionaria)empresa.get(consencion)).getSaldo();
                            double temporal2 = ((Vehiculo)vehiculo.get(veh)).getPrecio();
                            double temporal3 = temporal-temporal2;
                            ((Concesionaria)empresa.get(consencion)).setSaldo(temporal3);
                            System.out.println("COMPRA EXITOSA");
                        }
                        
                    }else if(respuesta == 2){
                        for (Object cl : cliente) {
                                    if(cl instanceof Cliente){
                                        System.out.println(""+cliente.indexOf(cl)+"- "+cliente);
                                    }
                                }
                        System.out.println("Ingrese su cuenta: ");
                        int cuenta = leer.nextInt();
                        for (Vehiculo v : vehiculo) {
                            if(v instanceof Vehiculo){
                                System.out.println(""+vehiculo.indexOf(v)+"- "+vehiculo);
                            }
                        }
                        System.out.println("Cual vehiculo desea comprar: ");
                        int veh = leer.nextInt();
                        if( ((Cliente)cliente.get(cuenta)).getSaldo() >= vehiculo.get(veh) .getPrecio()   ){
                            ((Cliente)cliente.get(cuenta)).getVehiculo().add(vehiculo.get(veh));
                            double temporal= ((Cliente)cliente.get(cuenta)).getSaldo();
                            double temporal2 = ((Vehiculo)vehiculo.get(veh)).getPrecio();
                            double temporal3 = temporal - temporal2;
                            ((Cliente)cliente.get(cuenta)).setSaldo(temporal3);
                            
                            System.out.println("COMPRA EXITOSA");
                        }else{
                            System.out.println("Saldo insuficiente");
                        }
                    }
                    
                    
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
        String direccion = leer.next();
        direccion = leer.nextLine();
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
        String nom = leer.next();
        nom = leer.nextLine();
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
        String marca = leer.next();
        marca = leer.nextLine();
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
                    for (Object c : empresa) {
                                    if(c instanceof Concesionaria){
                                        System.out.println(""+empresa.indexOf(c)+"- "+empresa);
                                    }
                    }
                    System.out.println("Cual concension desea ingresar el carro: ");
                    int pos = leer.nextInt();
                    vehiculo.add(moto);
                    empresa.get(pos).getAuto().add(moto);
                    return moto;
                    }
                case 2:{
                    boolean t = false;
                    System.out.println("Descripción de la bicicleta: ");
                    String descr = leer.next();
                    descr = leer.nextLine();
                    System.out.println("Radio de rueda: ");
                    int radio = leer.nextInt();
                    System.out.println("Tipo de la bicicleta: \n1- BMX \n2- De calle ");
                    int tipo = leer.nextInt();
                    if(tipo == 1){
                        t = true;
                    }else{
                        t = false;
                    }
                    Bicicleta bici;
                    bici = new Bicicleta(descr, radio, t, color, modelo, marca, fecha,precio, llanta);
                    vehiculo.add(bici);
                    for (Object c : empresa) {
                                    if(c instanceof Concesionaria){
                                        System.out.println(""+empresa.indexOf(c)+"- "+empresa);
                                    }
                    }
                    System.out.println("Cual concension desea ingresar el carro: ");
                    int pos = leer.nextInt();
                    empresa.get(pos).getAuto().add(bici);
                    return bici;
                    }
            }
        }else{
            System.out.println("1- Carro \n2- Camión de carga\n3- Bus\n Ingrese una opción: ");
            int respuesta = leer.nextInt();
            switch(respuesta){
                case 1:{
                    System.out.println("Cantidad de puertas: ");
                    int puerta = leer.nextInt();
                    System.out.println("Descripción de motor: ");
                    String descr = leer.next();
                    descr = leer.nextLine();
                    System.out.println("Velocidad máxima del carro: ");
                    int velo = leer.nextInt();
                    Carro carro;
                    carro = new Carro(puerta, descr, velo, color, modelo, marca,fecha, precio, llanta);
                    vehiculo.add(carro);
                    for (Object c : empresa) {
                                    if(c instanceof Concesionaria){
                                        System.out.println(""+empresa.indexOf(c)+"- "+empresa);
                                    }
                    }
                    System.out.println("Cual concension desea ingresar el carro: ");
                    int pos = leer.nextInt();
                    empresa.get(pos).getAuto().add(carro);
                    return carro;
                }
                case 2:{
                    boolean r = false;
                    System.out.println("Volumen máximo de carga: ");
                    int vol= leer.nextInt();
                    System.out.println("Altura del camión: {metros}");
                    int altu = leer.nextInt();
                    System.out.println("Contiene reotroexcavadora: \n1-Si\n2-No\nIngrese una opción: ");
                    int opci = leer.nextInt();
                    if(opci == 1){
                        r = true;
                    }else{
                        r = false;
                    }
                    Camion camion;
                    camion = new Camion(vol,altu, r, color, modelo, marca,fecha, precio, llanta);
                    vehiculo.add(camion);
                    for (Object c : empresa) {
                                    if(c instanceof Concesionaria){
                                        System.out.println(""+empresa.indexOf(c)+"- "+empresa);
                                    }
                    }
                    System.out.println("Cual concension desea ingresar el carro: ");
                    int pos = leer.nextInt();
                    empresa.get(pos).getAuto().add(camion);
                    return camion;
                }
                    
                case 3: {
                    System.out.println("Cantidad de pasajeros: ");
                    int pasajero = leer.nextInt();
                    String t = "";
                    Bus bus;
                    bus = new Bus(pasajero, t, color, modelo, marca, fecha, precio, llanta);
                    vehiculo.add(bus);
                    for (Object c : empresa) {
                                    if(c instanceof Concesionaria){
                                        System.out.println(""+empresa.indexOf(c)+"- "+empresa);
                                    }
                    }
                    System.out.println("Cual concension desea ingresar el carro: ");
                    int pos = leer.nextInt();
                    empresa.get(pos).getAuto().add(bus);
                    return bus;
                    
                }
                    
                    
            }
        }
        
        return new Vehiculo();
    }
    
}
