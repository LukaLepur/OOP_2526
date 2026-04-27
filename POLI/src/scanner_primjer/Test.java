package scanner_primjer;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Test {
    private static Scanner scanner;

    public static void main(String[] args) {
        try{
            scanner = new Scanner(System.in);
            double num;
            System.out.println("Enter some real number!!!\t");
            num = scanner.nextDouble();
            System.out.println(num);
        }catch(InputMismatchException e){
            System.out.println("Neočekivani input, triba double, unija si nešto skroz deseto!");
        }
        readTxtFile("POLI/src/scanner_primjer/primjer.txt", scanner);
    }

    public static void readTxtFile(String filePath, Scanner scanner){
        try{
            scanner=new Scanner(new File(filePath));
            while(scanner.hasNextLine()){
                System.out.println(scanner.nextLine());
            }
            System.out.println("Finished reading file!");
        }catch (FileNotFoundException fnfe){
            System.out.println("File not found!");
            System.out.println(fnfe.getMessage());
        }
    }

}
