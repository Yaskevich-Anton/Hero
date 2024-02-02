package Weapon;

import Heroes.Archer;
import Heroes.Warrior;


public class WeaponRunner {

        Archer<Bow> archer = new Archer<Bow>("Band",15);
        archer.setWeapon(new Bow());

    Warrior<Sword> warrior = new Warrior<>("Boromir", 10);
        warrior.setWeapon(new Sword());

}
