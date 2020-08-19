package army.technics.lightnMachinery;

import army.Unit;
import army.unitInterface.AttackEarthEarth;
import army.unitInterface.MoveUnits;

/**
 * SmallTank
 */
public class SmallTank extends Unit implements MoveUnits, AttackEarthEarth {

    public SmallTank() {

    }

    @Override
    public void attackEarthEarth() {
        System.out.println("Strelaet");
    }

    @Override
    public void move() {
        System.out.println("Двигается");

    }
}
