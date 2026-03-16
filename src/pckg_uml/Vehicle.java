package pckg_uml;

public class Vehicle {
    protected String model;
    protected String brand;
    protected String date;
    protected int vehID;
    protected static int autoInc=10;

    public Vehicle(){

    }

    public Vehicle(String mode, String brand){
        this.model=mode;
        this.brand=brand;
        this.vehID=autoInc++;
    }

    public void setDate(String stringDate){
        this.date=stringDate;
    }

    public void startVehicle(){
        System.out.println("Starting: "+this.getClass().getSimpleName());
    }
    public void stopVehicle(){
        System.out.println("Stop: "+this.getClass().getSimpleName());
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", date=" + date +
                ", vehID=" + vehID +
                '}';
    }

    public void vehInfo(){
        System.out.println(this.toString());
    }
}
