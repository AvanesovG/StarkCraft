package army.infantry.heroes;

import army.Unit;
import army.unitInterface.AttackEarthAir;
import army.unitInterface.AttackEarthEarth;
import army.unitInterface.MoveUnits;

public class Officer extends Unit implements MoveUnits, AttackEarthEarth, AttackEarthAir {


    @Override
    public void attackEarthAir() {
        System.out.println("Атакует воздушные цели ");
    }

    @Override
    public void attackEarthEarth() {
        System.out.println("Атакует наземные цели");


    }

    @Override
    public void move() {
        System.out.println("Передвигается");

    }
}
