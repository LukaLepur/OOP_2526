package pckg_arr_1;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] arrInt= AUX_CLS.genIntArray(10);
        System.out.println(Arrays.toString(arrInt));
        String[] someStrings={"String1", "Novi", "Treći", "Tako dalje", "Finalni"};
        String[] anotherStr;
        String[] newString=new String[7];
        anotherStr=newString;
        System.out.println(someStrings);
        System.out.println("---------------------------");
        System.out.println(anotherStr);
        anotherStr=someStrings;
        System.out.println(anotherStr);
        anotherStr=newString;
        System.out.println(newString);
        System.out.println(newString.length);
        Student[] student1=new Student[10];
        Student[] student2={new Student("Marko"), new Student("Ivana"), new Student("Petra")};
    }

    private static void printStringArrayElements(String[] arr){
        for(String el: arr){
            System.out.println(arr.toString());
        }
    }
}
