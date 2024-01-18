package Section35;

public class constructorDemo {
    /*
    1. Constructor executes a block of code whenever an object is created.
    2. Constructor will not return anything.
    3. Constructor should have the same name as of the classname.
     */

    //Default Constructor
    public constructorDemo(){
        System.out.println("I am in constructorDemo.");
    }

    //Parameterised Constructor
    public constructorDemo(int a, int b){
        System.out.println("I am in the Parameterised constructorDemo.");

        int c = a + b;
        System.out.println(c);
    }

    public constructorDemo(String str){
        System.out.println(str);
    }


    public void getData(){
        System.out.println("I am in getData.");
    }

    public static void main(String[] args) {

        constructorDemo cd1 = new constructorDemo();
        /* This will print - I am in constructorDemo.
        This is because whenever an object of a constructor is defined, constructor is invoked.
        Though you don't call compiler will call its default/implicit constructor. */

        constructorDemo cd2 = new constructorDemo(3,5);

        constructorDemo cd3 = new constructorDemo("Hello");
    }
}
