package Section35;

public class thisDemo {
    int a =2; //Global variable

    public void getData(){
        int a =3;//local variable for the block
        System.out.println(a);
        System.out.println(this.a);//this refers to current object - object scope lies in class level
        System.out.println(a+this.a);
    }

    public static void main(String[] args) {

        thisDemo td = new thisDemo();
        td.getData();
    }
}
