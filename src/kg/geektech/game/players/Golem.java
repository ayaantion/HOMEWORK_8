package kg.geektech.game.players;

public class Golem extends Hero {
    private int defense;
    private int aliveHeroes;

    public Golem(int health, int damage, String name) {
        super(health, damage, SuperAbility.DEFENSE
                , name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        defense = boss.getDamage() / 5;
        for (int i = 0; i < heroes.length; i++) {
            if (this != heroes[i]) {
                if (heroes[i].getHealth() > 0) {
                    aliveHeroes++;
                    heroes[i].setHealth(
                            heroes[i].getHealth() + defense);
                }
            }
            else {
                this.setHealth(this.getHealth() - defense * aliveHeroes);
            }
        }
        System.out.println("Golem took: " + aliveHeroes*defense + " damage");
        aliveHeroes = 0;
    }
}
