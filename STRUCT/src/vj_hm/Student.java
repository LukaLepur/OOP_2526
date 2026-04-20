package vj_hm;

import java.util.Comparator;

public class Student implements Comparator<Integer> {
    private String name;
    private int id;
    private static int cntID=10;
    public Student(String name){
        this.id=cntID++;
        this.name=name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public String getName() {
        return this.name;
    }

    public int getId() {
        return this.id;
    }



    @Override
    public int compare(Integer o1, Integer o2) {
        return o1.compareTo(o2);
    }
}
