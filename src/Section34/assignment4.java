package Section34;

/*
 * 1
 * 1 2
 * 1 2 3
 * 1 2 3 4
 * */
public class assignment4 {
    public static void main(String[] args) {

        int count = 1;

        for (int row = 1; row <= 4; row++) {

            for (int col = 1; col <= row; col++) {

                System.out.print((col) + "  ");

            }
            System.out.println();
        }
    }
}
