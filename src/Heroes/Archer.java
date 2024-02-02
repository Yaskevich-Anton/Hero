package Heroes;

import Weapon.RangeWeapon;

public class Archer<T extends RangeWeapon> extends Hero<T> {

    private Wolf wolf;

    public Archer(String name, int damage) {
        super(name, damage);
        this.wolf = new Wolf("Wolf", 7);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " Shot an arrow at " + enemy.getName());
        wolf.attackEnemy(enemy);
    }

    public class Wolf {

        private String name;
        private int damage;

        public Wolf(String name, int damage) {
            this.name = name;
            this.damage = damage;
        }

        public void attackEnemy(Enemy enemy) {
            System.out.println(name + " and " + Archer.this.getName() + " They deal joint damage");
            enemy.takeDamage(damage + Archer.this.getDamage());
        }
    }
}
