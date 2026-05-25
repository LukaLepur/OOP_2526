package pckg_read_write;

import java.util.List;
import java.util.stream.Stream;

public class TestSND {
    public static void main(String[] args) {
        List<String[]> content=AUX_SER_DESER.readLinesFromFile("EXCP/src/pckg_read_write/TestSND.java");
        System.out.println(content);
        List<SpaceShip> spaceShipList=AUX_SER_DESER.createSpaceShipsFromCSVData(content);
        System.out.println(spaceShipList);
    }
}
