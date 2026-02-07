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

public class Demon extends Monster {

    // Constructor sets name

    public Demon(String name) {
        super(name);
    }
// Constructor sets stats

    public Demon(String name, int health, int attack, int defense, SpecialPower specialPower) {
        super(name, health, attack, defense, specialPower);
    }
// special power
    @Override
    public void specialPowers() {
        System.out.println("Slashes Target");
    }
}
