package Heroes;

import Weapon.MeleeWeapon;

public class Warrior<T extends MeleeWeapon> extends Hero<T> {
    public Warrior(String name, int damage) {
        super(name, damage);
    }
@Override
   public void attackEnemy(Enemy enemy){
        System.out.println(getName() + "pulls out his sword and makes a dash at the"+ enemy.getName());
        enemy.takeDamage(getDamage());
    }
}
