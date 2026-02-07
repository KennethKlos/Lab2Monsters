
/*
 * Project: Lab 2 Monsters
 * Purpose Details: Create a sealed abstract Monster class and 3 concrete monster types.
 * Course: IST 242
 * Author: Ken Klos
 * Date Developed: 2/4/2026
 * Last Date Changed:2/7/2026
 * Rev:
 */

package monsters;

public abstract class Monster {

    public Monster(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public abstract void specialPowers();
}
private int health;


public int getHealth() {
    return health;
}

public void setHealth(int health) {
    this.health = health;
}

