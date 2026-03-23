package pckg_arr_1;

import java.util.Scanner;

public class App {

    private static Scanner scanner;

    public static void main(String[] args) {
        String[] elem={"Vasa", "Vana plurana", "-------"};
        String res=AUX_CLS.concatanateArrElements(elem);
        System.out.println(res);
        scanner=new Scanner(System.in);
        String[] elms=AUX_CLS.userInputArr(scanner, 4);
        System.out.println(elms);
        AUX_CLS.printElementsFromArr(elms);
    }
}
