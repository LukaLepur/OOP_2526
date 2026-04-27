package vj_hm;

import java.util.Map;
import java.util.TreeMap;

public class Test {
    public static void main(String[] args) {
        TreeMap<Student, Integer[]> studenti=new TreeMap<Student, Integer[]>();
        Student s1=new Student("Lovre", 19);
        Student s2=new Student("Kristijan", 22);
        Student s3=new Student("Lucija", 20);
        Student s4=new Student("Božena", 23);
        Student s5=new Student("Luka", 25);
        Student s6=new Student("Iva", 29);
        studenti.put(s1,new Integer[]{2,3,3,3});
        studenti.put(s2,new Integer[]{2,4,3,2});
        studenti.put(s3,new Integer[]{4,4,4,4});
        studenti.put(s4,new Integer[]{5,4,3,3});
        studenti.put(s5,new Integer[]{5,4,5,5});
        studenti.put(s6,new Integer[]{2,2,2,2});
        System.out.println("\n---------------Studenti---------------");
        System.out.println(studenti);

        System.out.println("\n---------------Studenti Duljina imena---------------");
        TreeMap<Student, Integer[]> studentiImena=new TreeMap<>(new NameLengthComparator());
        studentiImena.putAll(studenti);
        System.out.println(studentiImena);

        System.out.println("\n---------------Studenti Dob---------------");
        TreeMap<Student, Integer[]> studentiDob=new TreeMap<>(new AgeComparator());
        studentiDob.putAll(studenti);
        System.out.println(studentiDob);
        System.out.println("\n---------------Studenti Dob(obrnuto)---------------");
        System.out.println(studentiDob.reversed());
        System.out.println("\n---------------Studenti HashCode---------------");
        TreeMap<Student, Integer[]> studentiHash=new TreeMap<>(new HashComparator());
        studentiHash.putAll(studenti);
        System.out.println(studentiHash);

    }

    private static <K, V> void listAllElements(TreeMap<K,V> tMap){
        for (Map.Entry<K, V> elem : tMap.entrySet()) {
            System.out.println("Key: "+elem.getKey());
            System.out.println("Value: "+elem.getValue());
        }
    }

}
