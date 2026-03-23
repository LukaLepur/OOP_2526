package pckg_arr_1;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class AUX_CLS {

    private static final int ORIGIN=0;
    private static final int BOUND=250;

    public static int[] genIntArray(int numElements){
        int[] array=new int[numElements];
        for(int k=0;k<numElements; k++){
            array[k]= ThreadLocalRandom.current().nextInt(ORIGIN,BOUND);
        }
        return array;
    }

    public static Student[] genStudentFromName(String[] names){
        Student[] studenti=new Student[names.length];
        for(int k=0;k<names.length;k++){
            studenti[k]=new Student(names[k]);
        }
        return studenti;
    }

    public static Profesor[] genProfsFromName(String[] names){
        Profesor[] profs=new Profesor[names.length];
        for(int k=0;k<names.length;k++){
            profs[k]=new Profesor(names[k]);
        }
        return profs;
    }

    public static <E> E[] genObjectsFromNames(String[] names){
        E[] elements=new E[names.length];
    }

    public static String concatanateArrElements(String[] elem) {
    }

    public static String[] userInputArr(Scanner scanner, int i) {
    }

    public static void printElementsFromArr(String[] elms) {

    }
}
