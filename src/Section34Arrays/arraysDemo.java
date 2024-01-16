package Section34Arrays;

public class arraysDemo {
    public static void main(String[] args) {

        //A container which stores multiple values of the same datatype
        int a[] = new int[5]; //Arrays initialisation & memory allocation

        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        a[4] = 5;

        int b[] = {9, 8, 7, 6, 5};

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }

    }

}
