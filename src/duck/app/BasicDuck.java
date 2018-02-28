package duck.app;

//This is the top superclass BasicDuck
//Since some functions are not shared by all ducks, I created this BasicDuck
//class including only swim, which is the only function shared by all ducks
//RubberDuck, DecoyDuck, and Duck will extend this class
//BasicDuck class is declared as abstract because it is not expected to be
//instantiated
public abstract class BasicDuck {
    
    protected final String name;
    protected final String type;
    
    //This constructor is not expected to be called by classes other than its
    //subclasses, so declare as protected
    protected BasicDuck(String name, String type) {
        this.name = name;
        this.type = type;
    }
    
    public void swim() {
        System.out.printf("I am %s of the %s class of ducks and I am swimming\n", name, type);
    }
    
}