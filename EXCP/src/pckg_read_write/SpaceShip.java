package pckg_read_write;

import java.io.Serializable;
import java.util.Objects;

public class SpaceShip implements Serializable {

    private String name;
    private int id;
    private static int cntID=1;

    public SpaceShip(int id, String name) {
        this.name = name;
        this.id = id;
    }

    SpaceShip(String name){
    this.name=name;
    this.id=cntID++;
    }

    @Override
    public String toString() {
        return "SpaceShip{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode();
    }
}

