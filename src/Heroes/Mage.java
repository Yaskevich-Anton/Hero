package Heroes;

import Weapon.MagicWeapon;

public class Mage<T extends MagicWeapon> extends Hero<T> {
    public Mage(String name, int damage) {
        super(name, damage);
    }
@Override
    public void attackEnemy(Enemy enemy) {
        System.out.println("Conjures a book and blows up the enemy");
        enemy.takeDamage(getDamage());
    }
}
