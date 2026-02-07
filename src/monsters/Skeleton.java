/**
 * Project: Lab 2 Monsters
 * Purpose Details: Create a sealed abstract Monster class and 3 concrete monster types.
 * Course: IST 242
 * Author: Ken Klos
 * Date Developed:
 * Last Date Changed:
 * Rev:
 */

package monsters;

public class Skeleton extends Monster {

    //Constructor that sets monsters name

    public Skeleton(String name) {
        super(name);

        // Constructor that sets all stats
    }
     public Skeleton(String name, int health, int attack, int defense, SpecialPower specialPower) {
        super(name, health, attack, defense, specialPower);
    }
 // special ability

    @Override
    public void specialPowers() {
        System.out.println("Shoots Fireball");
    }
}

