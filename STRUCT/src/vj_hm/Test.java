package vj_hm;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Test {
    public static void main(String[] args) {
        HashMap<Integer,String> podaci = new HashMap<>();
        Integer[] ocj={2,3, 4, 5, 5};
        HashMap<Student, Integer[]> studentiPodaci = new HashMap<>();
        studentiPodaci.put(new Student("Miro"), ocj);
        studentiPodaci.put(new Student("Olga"), ocj);
        studentiPodaci.put(new Student("Mira"), ocj);
        listMapElements(studentiPodaci);
        TreeMap<Student, Integer[]> tmStudenti=new TreeMap<>(studentiPodaci);
        System.out.println(tmStudenti);
        podaci.put(21, "Stipe");
        podaci.put(159, "Divna");
        podaci.put(985, "Etna");
        podaci.put(455, "Petar");
        podaci.put(5788, "Vlatka");
        System.out.println(podaci);
        listHMElements(podaci);
        TreeMap<Integer, String> tmPodaci=new TreeMap<>(podaci);
        System.out.println(tmPodaci);
        listTMElements(tmPodaci);
    }

    private static void listHMElements(HashMap<Integer, String> podaci){
        Set<Map.Entry<Integer, String>> entries = podaci.entrySet();
        for (Map.Entry<Integer, String> es:entries){
            System.out.println(es.getKey()+" - "+es.getValue());
        }
    }

    private static void listTMElements(TreeMap<Integer, String> tmPodaci){
        Set<Map.Entry<Integer, String>> entries = tmPodaci.entrySet();
        for (Map.Entry<Integer, String> es:entries){
            System.out.println(es.getKey()+" - "+es.getValue());
        }
    }

    private static void listMapElementsNew(Map<Student, Integer[]> podaci){
        Set<Map.Entry<Student, Integer[]>> entries = podaci.entrySet();
        for (Map.Entry<Student, Integer[]> es:entries){
            System.out.println(es.getKey()+" - "+es.getValue());
        }
    }

    private static <K, V> void listMapElements(Map<K, V> podaci){
        Set<Map.Entry<K, V>> entries = podaci.entrySet();
        for (Map.Entry<K, V> es:entries){
            System.out.println(es.getKey()+" - "+es.getValue());
        }
    }
}
