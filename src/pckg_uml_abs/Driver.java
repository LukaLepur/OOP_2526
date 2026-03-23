package pckg_uml_abs;

public class Driver {
    private String driverName;
    public Driver(String name) {
        this.driverName = name;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "driverName='" + driverName + '\'' +
                '}';
    }
}
