package kg.geektech.game.players;

import kg.geektech.game.general.RPG_Game;

public class Thor extends Hero {

    private int chanse;
    private int saveBossDamage;

    public Thor(int health, int damage, String name) {
        super(health, damage, SuperAbility.STUN, name);
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        if (boss.getDamage() != 0){
            saveBossDamage = boss.getDamage();
        }
        boss.setDamage(saveBossDamage);
        chanse = RPG_Game.random.nextInt(7);
        //Представим что слабый тор не может ультануть станом Босса

        if(chanse == 1 && this.getHealth() > saveBossDamage*2){
            boss.setDamage(0);
            System.out.println("THOR STUNNED BOSS FOR NEXT ROUND");
        }
    }
}
