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

public class Main {

    public static void main(String[] args) {

        // 1) Create 5 Monster objects
        Monster m1 = new Demon("Baal");
        Monster m2 = new Alien("Martian");
        Monster m3 = new Skeleton("Skeleton Mage");
        Monster m4 = new Demon("Azrael");
        Monster m5 = new Alien("ET");

        // 2) Use SETTERS to set characteristics for monsters

        // Monster 1
        m1.setHealth(120);
        m1.setAttack(25);
        m1.setDefense(10);
        m1.setSpecialPower(SpecialPower.SLASH);

        // Monster 2
        m2.setHealth(100);
        m2.setAttack(20);
        m2.setDefense(12);
        m2.setSpecialPower(SpecialPower.ABDUCT);

        // Monster 3
        m3.setHealth(100);
        m3.setAttack(20);
        m3.setDefense(15);
        m3.setSpecialPower(SpecialPower.FIREBALL);

        // Monster 4
        m4.setHealth(130);
        m4.setAttack(28);
        m4.setDefense(12);
        m4.setSpecialPower(SpecialPower.SLASH);

        // Monster 5
        m5.setHealth(90);
        m5.setAttack(18);
        m5.setDefense(8);
        m5.setSpecialPower(SpecialPower.ABDUCT);

        // 3) Print monsters and characteristics using GETTERS
        System.out.println(m1.getName() + " " + m1.getHealth() + " " + m1.getAttack() + " " + m1.getDefense() + " " + m1.getSpecialPower());
        System.out.println(m2.getName() + " " + m2.getHealth() + " " + m2.getAttack() + " " + m2.getDefense() + " " + m2.getSpecialPower());
        System.out.println(m3.getName() + " " + m3.getHealth() + " " + m3.getAttack() + " " + m3.getDefense() + " " + m3.getSpecialPower());
        System.out.println(m4.getName() + " " + m4.getHealth() + " " + m4.getAttack() + " " + m4.getDefense() + " " + m4.getSpecialPower());
        System.out.println(m5.getName() + " " + m5.getHealth() + " " + m5.getAttack() + " " + m5.getDefense() + " " + m5.getSpecialPower());

        // 4)polymorphism
        m1.specialPowers();
        m2.specialPowers();
        m3.specialPowers();
        m4.specialPowers();
        m5.specialPowers();
    }
}
