package pckg_cls_object;

public class AppTest {
    public static void main(String[] args) {
        Student s1=new Student("Crnja", "Crnjić", 22);
        Student s2=new Student("Stipe", "Stipić", 255);
        s1.subscribeToStudentService();
        s2.subscribeToStudentService();

    }
}
