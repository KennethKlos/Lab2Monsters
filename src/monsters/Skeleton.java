package monsters;

public class Skeleton extends Monster {
    public Skeleton(String name) {
        super(name);
    }

    @Override
    public void specialPowers() {
        System.out.println("shoots bow");
    }
}

