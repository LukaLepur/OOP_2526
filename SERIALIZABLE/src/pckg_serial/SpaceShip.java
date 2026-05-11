package pckg_serial;

import java.time.LocalDate;
import java.util.concurrent.ThreadLocalRandom;

public class SpaceShip {

    private String spaceShipName;
    private int id;
    private static int cntID=1;
    private LocalDate firstMissionsDate;
    public SpaceShip(String name){
        this.spaceShipName=name;
        this.id=cntID++;
        this.firstMissionsDate=genRandomFisrtMissonDate();
    }

    private LocalDate genRandomFisrtMissonDate() {
        LocalDate startDate=LocalDate.of(2020, 12, 27);
        long longStartDate=startDate.toEpochDay();
        LocalDate endDate=LocalDate.of(2090, 12, 27);
        long longEndDate=endDate.toEpochDay();
        long randomDateBetween= ThreadLocalRandom.current().nextLong(longStartDate,longEndDate);
        LocalDate randomDate=LocalDate.ofEpochDay(randomDateBetween);
        return randomDate;
    }

    @Override
    public String toString() {
        return "SpaceShip{" +
                "spaceShipName='" + spaceShipName + '\'' +
                ", id=" + id +
                ", firstMissionsDate=" + firstMissionsDate +
                '}';
    }
}
