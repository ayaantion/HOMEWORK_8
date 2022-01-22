package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class Witcher extends Hero {

    public Witcher(int health, int damage, String name) {
        super(health, damage,
                SuperAbility.RESCUE, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length; i++) {
            if (this != heroes[i]) {
                if (heroes[i].getHealth() <= 0) {
                    System.out.println("Witch rescued " + heroes[i].getName()
                            + " live with " + this.getHealth() + " hp");
                    heroes[i].setHealth(this.getHealth());
                    this.setHealth(0);
                }
            }
        }
    }
}
