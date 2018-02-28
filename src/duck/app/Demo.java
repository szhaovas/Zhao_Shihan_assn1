package duck.app;
import java.util.*;
import java.lang.*;

public class Demo {
    
    public static void main(String[] args) {
        
        BasicDuck duck = null;
        System.out.println("Please type in class name to initialize a duck (MallardDuck/RedheadDuck/RubberDuck/DecoyDuck/ModelDuck)");
        Scanner cl = new Scanner(System.in);
        String classname = cl.next();
        System.out.println("Please type in the name of the duck");
        Scanner n = new Scanner(System.in);
        String name = n.next();
        
        if (classname.equals("MallardDuck")) {
            duck = new MallardDuck(name);
        }
        else if (classname.equals("RedheadDuck")) {
            duck = new RedheadDuck(name);
        }
        else if (classname.equals("RubberDuck")) {
            duck = new RubberDuck(name);
        }
        else if (classname.equals("DecoyDuck")) {
            duck = new DecoyDuck(name);
        }
        else if (classname.equals("ModelDuck")) {
            duck = new ModelDuck(name);
        }
        else {
            System.out.println("Wrong class name! Please type exit");
        }
        while (true) {
            System.out.println("What would you like the duck do? (swim/quack/fly/exit)");
            Scanner in = new Scanner(System.in);
            String instruction = in.next();
            try {
                if (instruction.equals("swim")) {
                    duck.swim();
                } else if (instruction.equals("quack")) {
                    duck.quack();
                    //My theory:
                    //I believe the error is because I didn't cast duck to MallardDuck
                    //So JAVA is not sure if duck is an instance of MallardDuck
                } else if (instruction.equals("fly")) {
                    duck.fly();
                } else if (instruction.equals("exit")) {
                    break;
                } else {
                    System.out.println("Wrong instruction, please try again!");
                }
            }
            catch (InputMismatchException e) {
                System.out.println("I don't know how to do it...");
            }
        }
        
        /*
        //I was trying to use reflection to automatically cast duck to its lowest subclass
        //or at least get access to its methods
        //didn't work out...
        BasicDuck duck;
        duck = new MallardDuck("Mr.Qua");
        Class cls = duck.getClass();
        cls.getMethod("fly").invoke(duck, null);
        /*
    }
}
