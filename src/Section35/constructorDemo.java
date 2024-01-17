package Section35;

public class constructorDemo {
    /*
    1. Constructor executes a block of code whenever an object is created.
    2. Constructor will not return anything.
    3. Constructor should have the same name as of the classname.
     */

    public constructorDemo(){
        System.out.println("I am in constructorDemo.");

    }

    public void getData(){
        System.out.println("I am in getData.");
    }

    public static void main(String[] args) {

        constructorDemo cd = new constructorDemo();
        /* This will print - I am in constructorDemo.
        This is because whenever an object of a constructor is defined, constructor is invoked.
        Though you don't call compiler will call its default/implicit constructor. */



    }
}
