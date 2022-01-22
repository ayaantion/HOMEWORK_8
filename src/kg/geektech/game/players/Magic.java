package kg.geektech.game.players;

public class Magic extends Hero{
    private int booster;

    public Magic(int health, int damage, int booster, String name) {
        super(health, damage,
                SuperAbility.BOOST, name);
        this.booster = booster;
    }

    public int getBooster() {
        return booster;
    }

    public void setBooster(int booster) {
        this.booster = booster;
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (heroes[i].getHealth() > 0) {
                heroes[i].setDamage(heroes[i].getDamage() + booster);
                if (this == heroes[i]) {
                    System.out.println(heroes[i].getName() + " boosted everyone " + booster + " damage");
                }
            }
        }
    }
}

