public class Warrior extends Hero {
    public Warrior(String name, int damage) {
        super(name, damage);
    }
@Override
   public void attackEnemy(Enemy enemy, Hero hero){
        System.out.println("He pulls out his sword and makes a dash at the enemy");
        enemy.setHealthy(enemy.getHealthy()-hero.getDamage());
    }
}
