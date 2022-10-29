import java.util.ArrayList;
public class Sensor{
    public static Sensor[] sensores= new Sensor[8];
    public final static int tamano= 8;
    public static int posAnadir= 0;
    private String tipo;
    private double valor;
    
    public static int contadorTemperatura= 0;
    
    public Sensor(){
        this.sensores[posAnadir] = this;
        posAnadir++;
    }
  
    public Sensor(String t, double v){
        this();
        this.tipo= t;
        this.valor= v;
        if(t.equals("temperatura")){
            contadorTemperatura++;
        }
    }
  
    public void setTipo(String t){
        this.tipo= t;
    }
  
    public String getTipo(){
        return tipo;
    }
  
    public void setValor(double v){
        this.valor= v;
    }
  
    public double getValor(){
        return valor;
    }
  
    public String toString(){
        String texto= "Sensor {Tipo= "+this.getTipo()+"; Valor= "+this.getValor()+"} ";
        return texto;    
    }
  
    public static String toStringSensores(){
         String texto= "";
         for(int i=0; i<posAnadir; i++){
             texto= texto+sensores[i].toString();
         }
         return texto;
    }
  
    public static int cantidadSensores(){
        return posAnadir;
    }
  
    public static Sensor[] sensoresTipoTemperatura(){
        Sensor[] sensorTemperatura= new Sensor[contadorTemperatura];
        for(int i=0; i<posAnadir; i++){
            String temperatura= sensores[i].getTipo();
            Sensor s= sensores[i];
            int j= 0;
            if(temperatura.equals("temperatura")){
                sensorTemperatura[j]= s;
                j++;
            }
        }
        for(int j=1; j<sensorTemperatura.length; j++){
            for(int h=0; h<sensorTemperatura.length-j; h++){
                if(sensorTemperatura[h].getValor()>sensorTemperatura[h+1].getValor()){
                    Sensor temp= sensorTemperatura[h+1];
                    sensorTemperatura[h+1]= sensorTemperatura[h];
                    sensorTemperatura[h]= temp;
                }
            }
        }
        return sensorTemperatura;
    }
  
    public static String toStringSensores(Sensor[] s){
         String texto= "";
         for(int i=0; i<s.length; i++){
             texto= texto+s[i].toString();
         }
         return texto;
    }
}
