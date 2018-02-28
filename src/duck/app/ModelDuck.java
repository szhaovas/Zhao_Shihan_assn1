package duck.app;

public class ModelDuck extends Duck {
    
    //need a field to record state for fly
    private String state;
    
    public ModelDuck(String name) {
        super(name, "ModelDuck");
        state = "rocket";
        System.out.printf("I am a ModelDuck, my name is %s\n", name);
    }
    
    //Overwrite the original fly function because of the updated requirements
    public void fly() {
        super.fly();
        if (state.equals("rocket")) {
            System.out.print(" like a rocket!\n");
        } else if (state.equals("wing")) {
            System.out.print(" with my wings!\n");
        }
    }
    
    public void setState(String st) {
        state = st;
    }
    
}
