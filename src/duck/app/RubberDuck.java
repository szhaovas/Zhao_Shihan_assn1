package duck.app;

public class RubberDuck extends BasicDuck{
    
    public RubberDuck(String name) {
        super(name, "RubberDuck");
        System.out.printf("I am a RubberDuck, my name is %s\n", name);
    }
    
    public void quack() {
        System.out.printf("Quack! Quack! says %s of the %s class of ducks\n", name, type);
    }
    
}
