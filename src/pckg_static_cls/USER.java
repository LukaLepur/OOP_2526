package pckg_static_cls;

public class USER {
    protected String name;
    protected String email;
    private static int cntID=100;
    protected int id;

    private static final int MAX_VAL=200;

    public USER(String name, String email) {
        this.name = name;
        this.email = email;
        this.id=cntID++;

    }

    public void performSomeStudyAction(){
        System.out.println(name + " performing some study action!");
    }

    @Override
    public String toString() {
        return "USER{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", id=" + id +
                '}';
    }
}
