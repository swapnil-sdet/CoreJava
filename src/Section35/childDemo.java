package Section35;

public class childDemo extends parentDemo {

    String name = "QAClickAcademy";

    public childDemo(){
        super(); //To call parent class constructor, always be on the first line
        System.out.println("I am on child class constructor");
    }
    public void getStringData(){

        System.out.println(name);
        System.out.println(super.name); // The use of Super keyword while accessing object
        
    }
    public void getData(){
        super.getData(); //To call parent class method
        System.out.println("I am in Child Class.");
    }

    public static void main(String[] args) {

        childDemo cd = new childDemo();
        cd.getStringData();
        cd.getData();
    }
}
