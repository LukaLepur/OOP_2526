package pckg_interfaces;

public class Superman extends Man implements Fly, RunFast {
    public Superman(String name) {
        super(name);
    }

    @Override
    public void flyingAbility() {
        System.out.println("Up, up, and away!");
    }

    @Override
    public void superSpeed() {
        System.out.println("Has superspeed");
    }
}
