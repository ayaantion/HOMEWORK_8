package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class Hacker extends Hero {

    private int hackHealth;
    private boolean hack = false;
    private int choise;

    public Hacker(int health, int damage, int hackHealth, String name) {
        super(health, damage, SuperAbility.HACKING, name);
        this.hackHealth = hackHealth;
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        if (hack){
            boss.setHealth(boss.getHealth() - hackHealth);
            for (int i = 0; i < heroes.length; i++) {
                choise = RPG_Game.random.nextInt(heroes.length);
                if (heroes[choise].getHealth() > 0 && heroes[choise] != this) {
                    heroes[choise].setHealth(heroes[choise].getHealth() + hackHealth);
                    System.out.println("Hacker healed " + heroes[choise].getName());
                    break;
                }
            }
            hack = false;
        }
        else {
            hack = true;
        }

    }
}
