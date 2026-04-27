package exception;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Robot> robots = new ArrayList<>(5);
        robots.add(new IndustrialRobot("R456"));
        robots.add(new FlyingRobot("Fly300"));
        robots.add(new IndustrialRobot("GG23R"));
        robots.add(new IndustrialRobot("SPEC6454"));
        robots.add(new FlyingRobot("Fly34"));

    }

    private static void performAction(List<Robot> robots) {

    }
}
