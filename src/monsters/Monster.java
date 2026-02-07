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

public abstract class Monster {

        private String name;
        private int health;
        private int attack;
        private int defense;
        private SpecialPower specialPower;

        public Monster(String name) {
            this.name = name;
        }

        //constructor that sets all attributes

    public Monster(String name, int health, int attack, int defense, SpecialPower specialPower) {
            this.name = name;
            this.health = health;
            this.attack = attack;
            this.defense = defense;
            this.specialPower = specialPower;
        }

        // sets getters

        public String getName() { return name; }
        public void setName(String name) { this.name = name; }

        public int getHealth() { return health; }
        public void setHealth(int health) { this.health = health; }

        public int getAttack() { return attack; }
        public void setAttack(int attack) { this.attack = attack; }

        public int getDefense() { return defense; }
        public void setDefense(int defense) { this.defense = defense; }

        public SpecialPower getSpecialPower() { return specialPower; }
        public void setSpecialPower(SpecialPower specialPower) { this.specialPower = specialPower; }

        public abstract void specialPowers();
    }

// ^ forces subclasses to define their own special power behavior





