package exception;

public class FlyingRobot extends Robot {


    protected FlyingRobot(String name) {
        super(name);
    }

    @Override
    protected void changeState() {
        System.out.println("Starting flight"+this.getClass().getSimpleName());
    }

    @Override
    protected void chargeRobot() {
        System.out.println("Charging in the air"+this.getClass().getSimpleName());
    }
}
