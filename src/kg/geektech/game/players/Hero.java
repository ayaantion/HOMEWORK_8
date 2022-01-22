package kg.geektech.game.players;

public abstract class Hero extends GameEntity
        implements HavingSuperAbility {
    private SuperAbility superAbility;
    private String name;

    public Hero(int health, int damage,
                SuperAbility superAbility, String name) {
        super(health, damage);
        this.superAbility = superAbility;
        this.name = name;
    }

    public SuperAbility getSuperAbility() {
        return superAbility;
    }

    public void setSuperAbility(SuperAbility superAbility) {
        this.superAbility = superAbility;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
