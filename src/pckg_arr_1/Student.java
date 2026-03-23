package pckg_arr_1;

public class Student {
    private String name;
    private int id;
    private static int cntID=0;
    public Student(String name){
        this.name=name;
        this.id=cntID++;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
