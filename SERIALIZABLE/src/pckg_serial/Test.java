package pckg_serial;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        SpaceShip sp1=new SpaceShip("Millenium Falcon");
        SpaceShip sp2=new SpaceShip("Ghost");
        SpaceShip sp3=new SpaceShip("Slave-1");
        List<SpaceShip> spaceShipList=List.of(sp1, sp2, sp3);
        System.out.println(spaceShipList);
        String filePath="SERIALIZABLE/src/pckg_serial/SpaceShipData.bin";
        saveSpaceShips(spaceShipList,filePath);
        SpaceShip sp4=new SpaceShip("TIE Fighter");
        SpaceShip sp5=new SpaceShip("Mandship idk");
        List<SpaceShip> spsl=new ArrayList<>(spaceShipList);
        spsl.add(sp4);
        spsl.add(sp5);
        saveSpaceShips(spsl,filePath);
        SpaceShip sp6=new SpaceShip("Star Destroyer");
        SpaceShip sp7=new SpaceShip("Vader tie fighter");
        String filePath2="SERIALIZABLE/src/pckg_serial/SpaceShipDataFile.data";
        addSpaceShip(sp6,filePath2);
        addSpaceShip(sp7,filePath2);
        List<SpaceShip> newSpaceShipList=new ArrayList<>();
        newSpaceShipList.add(sp7);
    }
    private static void ListAllSpaceShips(List<SpaceShip> spl){
        for(SpaceShip sp : spl){
            System.out.println(sp);
        }
    }

    private static void saveSpaceShips(List<SpaceShip> ships, String filePath){
        try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(new File(filePath)))){
            oos.writeObject(ships);
            System.out.println("Finished writing to a file");
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
            System.out.println("Error writing to a file!");
        }
    }

    private static void addSpaceShip(SpaceShip spaceShip, String filePath){
        try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(new File(filePath)))){
            oos.writeObject(spaceShip);
            System.out.println("Finished writing one spaceship to a file");
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
            System.out.println("Error writing to a file!");
        }

    }

    private static List<SpaceShip> readSpaceShipData(String filePath){
        List<SpaceShip> spaceShipList=new ArrayList<>();
        try(FileInputStream fis=new FileInputStream(new File(filePath))){
            ObjectInputStream ois=new ObjectInputStream(fis);
            while (fis.available()>0){
                SpaceShip sp=(SpaceShip) ois.readObject() ;
                spaceShipList.add(sp);
                System.out.println("Finished writing one spaceship to a file");
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        return spaceShipList;
    }
}
