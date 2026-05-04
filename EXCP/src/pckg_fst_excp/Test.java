package pckg_fst_excp;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        ArrayList<String> stringList=null;
        System.out.println(stringList);
        String filePath="./EXCP/src/pckg_fst_excp/podaci.csv";
        try {
            Scanner scanner=new Scanner(new File(filePath));
        } catch (FileNotFoundException fnfe) {
            System.out.println("File not found");
            fnfe.printStackTrace();
        }


    }

}
