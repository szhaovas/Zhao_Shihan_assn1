package duck.app;

public class DecoyDuck extends BasicDuck {
    
    public DecoyDuck(String name) {
        super(name, "DecoyDuck");
        System.out.printf("I am a DecoyDuck, my name is %s\n", name);
    }
    
}
