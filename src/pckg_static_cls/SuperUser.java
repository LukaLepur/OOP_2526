package pckg_static_cls;

public class SuperUser extends USER{
    public SuperUser(String name, String email) {
        super(name, email);
        this.id=id;
    }
    @Override
    public void performSomeStudyAction(){
        System.out.println(name + " performing some study action!");
    }


}
