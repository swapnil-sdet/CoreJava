package Section35;

public class staticVar {

    //Instance/Global variables
    String name; // Instance variable
    String address;
    static String city; //Class Variables
    // When the variable is declared as Static, then the copy of the same is used by all the objects

    static int i;

    static {
        city = "Navi Mumbai";
        i=0;
    }

    staticVar(String name, String address){ //Local variables

        this.name = name;
        this.address = address;
        //this.city = city;
        i++;
        System.out.println(i);
    }

    public void getAddress(){
        System.out.println(address+" "+city);;
    }

    public static void getcity(){
        System.out.println(city);
        //Static methods can access only static variables
    }


    public static void main(String[] args) {

        staticVar obj = new staticVar("Swapnil","Pune");
        staticVar obj1 = new staticVar("Snehal","Badlapur");
        obj.getAddress();
        obj1.getAddress();
        staticVar.getcity(); // To access static methods - className.methodName
        staticVar.i=5; //Runtime value assignment to a static variable
        obj.address="ABC"; //Runtime value assignment to a non-static variable
    }
}
