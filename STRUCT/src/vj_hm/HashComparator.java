package vj_hm;



import java.util.Comparator;

public class HashComparator implements Comparator<Student> {
    @Override
    public int compare(Student st1, Student st2) {

        return Integer.compare(st1.hashCode(),st2.hashCode());
    }
}
