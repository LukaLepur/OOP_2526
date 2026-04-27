package vj_hm;

public class Student implements Comparable<Student> {
    private String name;
    private int id;
    private int age;
    private static int cntID=10;
    public Student(String name, int age){
        this.id=cntID++;
        this.age=age;
        this.name=name;
    }
    public String getName() {
        return this.name;
    }

    public int getId() {
        return this.id;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "\n" + "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hash=" + this.hashCode() +
                ", id=" + id +
                '}';
    }

    @Override
    public int compareTo(Student other) {
       /* if (this.id>other.id){
            return 1;
        } else if (this.id<other.id){
            return -1;
        } else{
            return 0;
        }*/
        return Integer.compare(this.id,other.id);
    }
}
