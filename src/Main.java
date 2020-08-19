import army.infantry.heroes.Officer;
import army.technics.heavyMachinery.Helicopter;
import army.technics.lightnMachinery.SmallTank;

public class Main {

    public static void main(String[] args) {
        /**
         *   SmallTank
         */
        SmallTank smallTank = new SmallTank();
        smallTank.setName("T18");
        smallTank.setRace("People");
        smallTank.setAttackRange(3);
        smallTank.setPointsArmor(15);
        smallTank.setPointsAttack(2);
        smallTank.setPointsCount(35);
        smallTank.setPointsSpeed(15);
        smallTank.move();
        smallTank.attackEarthEarth();

        /**
         * Helicopter
         */
        Helicopter helicopter = new Helicopter();
        helicopter.setName("Акула");
        helicopter.setRace("People");
        helicopter.setAttackRange(15);
        helicopter.setPointsArmor(40);
        helicopter.setPointsAttack(25);
        helicopter.setPointsCount(78);
        helicopter.setPointsSpeed(118);
        helicopter.fly();
        helicopter.attackAirEarth();

        /**
         * Heroes
         */
        Officer officer = new Officer();
        officer.setName("Офицер");
        officer.setRace("People");
        officer.setAttackRange(55);
        officer.setPointsArmor(33);
        officer.setPointsAttack(25);
        officer.setPointsCount(78);
        officer.setPointsSpeed(118);
        officer.setAttackLevel(5);
        officer.move();
        officer.attackEarthAir();
        officer.attackEarthEarth();
    }
}
