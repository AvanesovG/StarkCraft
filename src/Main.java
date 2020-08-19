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

    }


}
