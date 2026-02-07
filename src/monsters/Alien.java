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

public class Alien extends Monster {

    //Constructor that sets monsters name

    public Alien(String name) {
        super(name);
    }

    // Constructor that sets all stats

    public Alien(String name, int health, int attack, int defense, SpecialPower specialPower) {
        super(name, health, attack, defense, specialPower);
    }
// special power
    @Override
    public void specialPowers() {
        System.out.println("Abducts Target");
    }
}


