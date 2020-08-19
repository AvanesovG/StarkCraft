package army.technics.heavyMachinery;

import army.Unit;
import army.unitInterface.AttackAirEarth;
import army.unitInterface.FlyUnit;

/**
 * Helicopter
 */
public class Helicopter extends Unit implements FlyUnit, AttackAirEarth {

    @Override
    public void fly() {
        System.out.println("Летит");
    }

    @Override
    public void attackAirEarth() {
        System.out.println("Атакует наземные цели");

    }
}
