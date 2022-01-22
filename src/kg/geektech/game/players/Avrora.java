package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class Avrora extends Hero{

    private int itsTimeInt;
    private boolean itsTime = false;
    private int abilityUsedTimes = 0;
    private int mana = 0;

    public Avrora(int health, int damage, String name) {
        super(health, damage,
                SuperAbility.INVIS, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        itsTimeInt = RPG_Game.random.nextInt(4);

        if(itsTimeInt == 1){
            itsTime = true;
        }
        if(itsTime && abilityUsedTimes < 2) {
            abilityUsedTimes++;
            this.setHealth(this.getHealth() + boss.getDamage());
            mana = mana + boss.getDamage();
            System.out.println("Avrora's mana: " + mana);
        }
        else if(itsTime && abilityUsedTimes == 2){
            boss.setHealth(boss.getHealth() - mana);
            System.out.println("Avrora damaged Boss " + mana + " hp");
            abilityUsedTimes = 3;
            mana = 0;
        }
    }
}
