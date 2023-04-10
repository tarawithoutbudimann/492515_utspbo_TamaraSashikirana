public class enemy {
    private String name;
    private int hp, attackDamage;
    public enemy(String name, int hp, int attackDamage) {
        this.name = name;
        this.hp = hp;
        this.attackDamage = attackDamage;
    }
    public void attack() {
        System.out.println("Attack");
    }
}