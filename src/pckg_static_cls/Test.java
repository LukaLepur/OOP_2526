package pckg_static_cls;

public class Test {
    public static void main(String[] args) {
        USER us1=new USER("Ivana", "ivana123@gmail.com");
        System.out.println(us1);
        us1.performSomeStudyAction();
        AUX_CLS.printSomeMSG("This is some msg!!!");
        SuperUser sup1=new SuperUser("Petar", "angoidaog");
        System.out.println(sup1);
    }
}
