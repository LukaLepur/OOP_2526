package pckg_interfaces;

public class SpiderMan extends Man implements Fly, RunFast {
    public SpiderMan(String name) {
        super(name);
    }

    @Override
    public void flyingAbility() {
        System.out.println("He flies with webs ig.");
    }

    @Override
    public void superSpeed() {
        System.out.println("Fast, but not SUPERfast");
    }
}
