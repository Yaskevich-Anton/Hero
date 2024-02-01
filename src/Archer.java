import javax.swing.text.html.StyleSheet;

public class Archer extends Hero{


    public Archer(String name, int damage) {
        super(name,damage);

    }
@Override
   public void attackEnemy(Enemy enemy, Hero hero){
        System.out.println("Pulls the bowstring and shoots at the enemy");
       enemy.setHealthy(enemy.getHealthy()-hero.getDamage());
    }
}
