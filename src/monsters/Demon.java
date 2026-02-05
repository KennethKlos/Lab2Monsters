package monsters;

public class Demon extends Monster{

    public Demon(String name) {
        super(name);
    }

    @Override
    public void specialPowers(){
        System.out.println("slashes");


    }
}
