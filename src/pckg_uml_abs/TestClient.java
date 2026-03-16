package pckg_uml_abs;

public class TestClient {
    public static void main(String[] args) {
        SportGPUMotor mot1=new SportGPUMotor("Ducati", "H1000");
        SportsCar spc=new SportsCar("Mercedes", "SLK");
        mot1.startVeh();
        mot1.stopVeh();
        mot1.vehInfo();

        spc.startVeh();
        spc.stopVeh();
        spc.vehInfo();

    }
}
