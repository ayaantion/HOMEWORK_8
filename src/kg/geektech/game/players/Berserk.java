package kg.geektech.game.players;

public class Berserk extends Hero{
    private int divide;
    private int spike;
    public Berserk(int health, int damage, int divide, String name) {
        super(health, damage,
                SuperAbility.SAVE_DAMAGE_AND_REVERT, name);
        this.divide = divide;
    }

    @Override
    public void applySuperPower(Boss boss, Hero[] heroes) {
        spike = boss.getDamage()/divide;
        boss.setHealth(boss.getHealth() - spike);
    }
}
