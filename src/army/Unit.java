package army;

/**
 * Общий кдас для всех войск
 */
public class Unit {

    private String race;
    private String name;
    private int pointsCount;
    private int pointsArmor;
    private int pointsAttack;
    private int pointsSpeed;
    private int attackRange;


    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPointsCount() {
        return pointsCount;
    }

    public void setPointsCount(int pointsCount) {
        this.pointsCount = pointsCount;
    }

    public int getPointsArmor() {
        return pointsArmor;
    }

    public void setPointsArmor(int pointsArmor) {
        this.pointsArmor = pointsArmor;
    }

    public int getPointsAttack() {
        return pointsAttack;
    }

    public void setPointsAttack(int pointsAttack) {
        this.pointsAttack = pointsAttack;
    }

    public int getPointsSpeed() {
        return pointsSpeed;
    }

    public void setPointsSpeed(int pointsSpeed) {
        this.pointsSpeed = pointsSpeed;
    }

    public int getAttackRange() {
        return attackRange;
    }

    public void setAttackRange(int attackRange) {
        this.attackRange = attackRange;
    }
}
