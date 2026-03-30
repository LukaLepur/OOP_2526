package pckg_interfaces;

public class Arrow extends Man implements Fly, RunFast {
    public Arrow(String name) {
        super(name);
    }

    @Override
    public void flyingAbility() {
        System.out.println("Can't fly!");
    }

    @Override
    public void superSpeed() {
        System.out.println("Not superfast");
    }
}
