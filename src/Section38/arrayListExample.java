package Section38;

import java.util.ArrayList;

public class arrayListExample {
    //List can accept duplicate values
    //ArrayList, LinkedList, Vector - implementing List interface
    //array have fixed size whereas arrayList can grow dynamically
    //you can access and insert any value at any index

    public static void main(String[] args) {

        ArrayList<String> a = new ArrayList<String>();
        a.add("Pradish");
        a.add("Swapnil");
        System.out.println(a);

        a.add(0,"Susmit");
        a.add("Java");
        a.add("Java");
        System.out.println(a);

        a.remove(1);
        a.remove("Java");
        System.out.println(a);

        a.getFirst();
        a.getLast();
        System.out.println(a.get(1));

        System.out.println(a.contains("Test"));

        System.out.println(a.indexOf("Swapnil"));
        System.out.println("Is array empty?: " + a.isEmpty());
        System.out.println("size of the arrayList is: " + a.size());




    }
}
