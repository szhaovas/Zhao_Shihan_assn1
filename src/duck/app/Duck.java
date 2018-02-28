package duck.app;
    
//This is the most commonly used model for a duck, including quack, fly, and
//of course swim
//Therefore I created this class as a mid-level superclass to be extended by
//MallardDuck, RedheadDuck, and ModelDuck
//This is also declared to be abstract because it is not expected to be
//instantiated
public abstract class Duck extends BasicDuck {
  
    //This constructor is not expected to be called by classes other than its
    //subclasses, so declare as protected
    protected Duck(String name, String type) {
        super(name, type);
    }
    
    public void quack() {
        System.out.printf("Quack! Quack! says %s of the %s class of ducks\n", name, type);
    }
    
    public void fly() {
        System.out.printf("I am %s of class %s and I can Fly!", name, type);
    }
    
}