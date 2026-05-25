package fst_gui;

import java.io.*;

public class AUX_IO {

    public static void saveTXTDataFromArea(String data, String filePath){
        try(BufferedWriter bw=new BufferedWriter(new FileWriter(filePath))){
            bw.write(data);
            System.out.println("Txt Data written in the file: "+filePath);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String loadTxtDataFromFile(String filePath){
        StringBuilder stringBuilder=new StringBuilder();
        String line=null;

        try (BufferedReader br=new BufferedReader(new FileReader(filePath))){
            while((line=br.readLine())!=null){
                stringBuilder.append(line+"\n");
            }
            System.out.println("Txt read from the file: "+filePath);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return stringBuilder.toString();
    }

}
