public class Mage extends Hero {
    public Mage(String name, int damage) {
        super(name, damage);
    }
@Override
    public void attackEnemy(Enemy enemy, Hero hero) {
        System.out.println("Conjures a book and blows up the enemy");
        enemy.setHealthy(enemy.getHealthy()-hero.getDamage());
    }
}
