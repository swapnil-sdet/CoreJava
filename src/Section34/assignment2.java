package Section34;

/*
 * 1
 * 2 3
 * 4 5 6
 * 7 8 9 10
 * */

public class assignment2 {

    public static void main(String[] args) {

        int count = 1;

        for (int row = 1; row <= 4; row++) {

            for (int col = 1; col <= row; col++) {

                System.out.print(count + "  ");
                count++;

            }
            System.out.println();

        }
    }
}