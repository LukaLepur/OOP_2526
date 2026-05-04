package pckg_end_excp;

import java.util.Scanner;

public class TestAgeApp {

    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        System.out.println("Neka proizvoljna int vrijednos - unesi:\n");
        int exampleInt=scanner.nextInt();
        System.out.println(exampleInt);
//        scanner.close();
        Scanner scnr=new Scanner(System.in);
        AUX_CLS_YEARS.enterAge(scanner);
    }
}
