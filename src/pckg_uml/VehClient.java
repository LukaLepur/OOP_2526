package pckg_uml;

public class VehClient {
    private static Vehicle veh;
    private static SportsCar sc1;
    private static SportsCar sc2;
    public static void main(String[] args) {
        veh=new Vehicle("X4", "BMW");
        sc1=new SportsCar("Carrera", "Porsche");
        sc2=new SportsCar("Spider", "Ferrari");
        veh.startVehicle();
        veh.setDate("23-11-2008.");
        veh.vehInfo();

        sc1.setDate("09-04-2017.");
        sc1.vehInfo();

        sc2.setDate("10-1-2023.");
        sc2.startVehicle();
        sc2.vehInfo();

    }
}
