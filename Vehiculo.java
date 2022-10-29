public class Vehiculo{
    public static Vehiculo[] vehiculos= new Vehiculo[10];
    public final static int tamano= 10;
    public static int posAnadir= 0;
    private int modelo;
    private String marca;
    private double valorComercial;
    private String color;

    public static int vehiculosVerdes= 0; //contador de vehiculos verdes
    public static int modelosVehiculos= 0; // contador de vehiculos modelos 2000-2021

    public Vehiculo(){
        this.vehiculos[posAnadir] = this;
        posAnadir++;
    }
    public Vehiculo(int mo, String ma, double va){
        this(mo, ma, va, "verde");
        vehiculosVerdes++;
    }
    public Vehiculo(int mo, String ma, double va, String co){
        this();
        this.modelo= mo;
        this.marca= ma;
        this.valorComercial= va;
        this.color= co;
        if(co.equals("verde")){
            vehiculosVerdes++;
        }
    }
    public void setModelo(int mo){
        this.modelo= mo;
    }
    public int getModelo(){
        return this.modelo;
    }
    public void setMarca(String ma){
        this.marca= ma;
    }
    public String getMarca(){
        return this.marca;
    }
    public void setValorComercial(double va){
        this.valorComercial= va;
    }
    public double getValorComercial(){
        return this.valorComercial;
    }
    public void setColor(String co){
        this.color= co;
    }
    public String getColor(){
        return this.color;
    }
    public String toString(){
        String texto= "Vehiculo { Modelo= "+this.getModelo()+"; Marca= "+this.getMarca();
        texto= texto+"; Valor comercial= "+this.getValorComercial()+"; Color= "+this.getColor()+"} ";
        return texto;
    }
    public static String toStringVehiculos(){
        String texto= "";
        for(int i=0; i<posAnadir; i++){
            texto= texto+vehiculos[i].toString();
        }
        return texto;
    }
    public static int cantidadVehiculos(){
        return posAnadir;
    }
}
