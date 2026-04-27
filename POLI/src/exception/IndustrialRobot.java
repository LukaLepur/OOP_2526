package exception;

public class IndustrialRobot extends Robot {


    protected IndustrialRobot(String name) {
        super(name);
    }

    @Override
    protected void changeState() {
        System.out.println(this.getClass().getSimpleName()+" entering work mode.");

    }

    @Override
    protected void chargeRobot() {
        System.out.println(this.getClass().getSimpleName()+" charging at charger");
    }
}
