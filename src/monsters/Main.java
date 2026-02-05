package monsters;

public class Main {

    public static void main(String[] args){
        Monster m1 = new Demon("Baal");
        Monster m2 = new Alien("Martian");
        Monster m3 = new Skeleton("Skeleton Archer");


        System.out.println(m1.getName());
        System.out.println(m2.getName());
        System.out.println(m3.getName());

        m1.specialPowers();
        m2.specialPowers();
        m3.specialPowers();
    }
}
