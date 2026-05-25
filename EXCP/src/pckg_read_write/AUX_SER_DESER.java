package pckg_read_write;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class AUX_SER_DESER {

    public static void saveSpaceShipOne(SpaceShip spaceShip, String filePath){
        try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(filePath, true))){
            oos.writeObject(spaceShip);
            System.out.println("SpaceShip added to the file!");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static List<SpaceShip> readOneByOneSpaceShip(String filePath){
        List<SpaceShip> SpaceSjiplist=new ArrayList<>();
        try (FileInputStream fis=new FileInputStream(filePath)){
            ObjectInputStream

        }
    }

    public static void saveShips(List<SpaceShip> ships, String filePath) {

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeObject(ships);
            System.out.println("Spaceships data written in the file!");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }



    public static List<SpaceShip> readSpaceShipData(String filePath){
        List<SpaceShip> spaceShipList=new ArrayList<>();
        try (ObjectInputStream ois=new ObjectInputStream(new FileInputStream(filePath))) {
            spaceShipList=(List<SpaceShip> ois.readObject());

        }catch (FileNotFoundException fnfe){
            System.out.println("File not found");
            fnfe.printStackTrace();
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
        return spaceShipList;
    }

    public static List<String[]> readLinesFromFile(String filePath){
        Stream<String[]> content=new ArrayList<>();
        try(BufferedReader br=new BufferedReader(new FileReader(new File(filePath)))){
            String line=null;
            while ((line=br.readLine())!=null){
                String[] data=line.split(",");
                System.out.println(Arrays.toString(data));
                content.add(data);
            }
            System.out.println("All content read from the txt file!");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return content;
    }

    public static List<SpaceShip> createSpaceShipsFromCSVData(List<String[]> data){
        List<SpaceShip> spaceShipList=new ArrayList<>();
        for (String[] partData:data){
            int id=Integer.parseInt(partData[0].trim());
            String name=partData[1].trim();
            SpaceShip spaceShip=new SpaceShip(id, name);
            spaceShipList.add(spaceShip);
            System.out.println("Space ship added to a list!");
        }
        return spaceShipList;
    }
}
