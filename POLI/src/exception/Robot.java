package exception;

public abstract class Robot {
    protected String name;
    protected int id;
    private static int cntID=100;

    protected Robot(String name) {
        this.name = name;
        this.id = cntID++;
    }

    private void turnON() {
        System.out.println(this.getClass().getSimpleName()+"Turning on");
    }

    private void turnOff() {
        System.out.println(this.getClass().getSimpleName()+"Turning off");
    }

    protected abstract void changeState();
    protected abstract void chargeRobot();
}
