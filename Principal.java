import java.util.Scanner;
public class Principal{
    public static void main(String[] args){
        Scanner entrada= new Scanner(System.in);

        Principal.mostrarMenu();

    }

    public static void mostrarMenu(){
        Scanner entrada= new Scanner(System.in);
        boolean programa= true;
        while(programa){
            System.out.println("-- Ingresa un numero --");
            System.out.println("- 0 para detener el programa.");
            System.out.println("- 1 para crear un vehiculo.");
            System.out.println("- 2 si desea ver la informacion de todos los vehiculos.");
            System.out.println("- 3 se desea ver el numero de vehiculos almacenados.");
            System.out.println("- 4 si desea ver la informacion de todos los vehiculos de color verde.");
            System.out.println("- 5 si desea ver la informacion de los vehiculos modelos entre 2000 y 2021.");
            System.out.println("- 6 para crear un nuevo sensor.");
            System.out.println("- 7 si desea ver la informacion de todos los sensores.");
            System.out.println("- 8 si desea ver el numero de sensores almacenados.");
            System.out.println("- 9 si desea ver la informacion de todos los sensores de tipo temperatura.");
            System.out.println("- 666 si desea ver los sensores tipo temperatura ordenados.");
            int opcion= entrada.nextInt();

            switch(opcion){
                case 0:{
                        programa= false;
                        break;
                    }
                
                case 1:{
                        int cantidadVehiculos= Vehiculo.cantidadVehiculos();
                        if(cantidadVehiculos<10){
                            System.out.println("Ingresa el modelo del vehiculo:");
                            int modelo= entrada.nextInt();

                            System.out.println("Ingresa la marca del vehiculo:");
                            String marca= entrada.next();

                            System.out.println("Ingresa el valor comercial del vehiculo:");
                            double valorComercial= entrada.nextDouble();

                            System.out.println("Ingresa el color del vehiculo:");
                            String color= entrada.next();

                            Vehiculo carro= new Vehiculo(modelo, marca, valorComercial, color);
                        }
                        else{
                            System.out.println("Error base de datos llena");
                        }
                        break;
                    }
                
                case 2:{
                        System.out.println(Vehiculo.toStringVehiculos());
                        break;
                    }
                
                case 3:{
                        System.out.println(Vehiculo.cantidadVehiculos());
                        break;
                    }
                
                case 4:{
                        for(int i= 0; i<Vehiculo.posAnadir; i++){
                            String color= Vehiculo.vehiculos[i].getColor();
                            if(color.equals("verde")){
                                System.out.println(Vehiculo.vehiculos[i].toString());
                            }
                            else{
                                continue;
                            }
                        }
                        break;
                    }
                
                case 5:{
                        for(int i= 0; i<Vehiculo.posAnadir; i++){
                            int modelo= Vehiculo.vehiculos[i].getModelo();
                            if(modelo>=2000 && modelo<=2021){
                                System.out.println(Vehiculo.vehiculos[i].toString());
                            }
                            else{
                                continue;
                            }
                        }
                        break;
                    }
                
                case 6:{
                        int cantidadSensores= Sensor.cantidadSensores();
                        if(cantidadSensores<8){
                            System.out.println("Ingresa el tipo de sensor:");
                            String tipo= entrada.next();

                            System.out.println("Ingresa el valor del sensor:");
                            double valor= entrada.nextDouble();
                            Sensor s= new Sensor(tipo, valor);
                        }
                        else{
                            System.out.println("Error base de datos llena");
                        }
                        break;
                    }
                
                case 7:{
                        System.out.println(Sensor.toStringSensores());
                        break;
                    }
                
                case 8:{
                        System.out.println(Sensor.cantidadSensores());
                        break;
                    }
                
                case 9:{
                        for(int j= 0; j<Sensor.posAnadir; j++){
                            String tipo= Sensor.sensores[j].getTipo();
                            if(tipo.equals("temperatura")){
                                System.out.println(Sensor.sensores[j].toString());
                            }
                            else{
                                continue;
                            }
                        }
                        break;
                    }
                
                case 666:{
                        Sensor[] sensoresTemp= Sensor.sensoresTipoTemperatura();
                        System.out.println(Sensor.toStringSensores(sensoresTemp));
                        break;
                    }
            }
        }
    }
}
