package Section34;

/*
 * 1 2 3 4
 * 5 6 7
 * 8 9
 * 10
 * */

public class assignment1 {

    public static void main(String[] args) {

        int count = 1;

        for (int row = 0; row < 4; row++) {

            for (int col = 1; col <= 4 - row; col++) {

                System.out.print(count + "  ");
                count++;

            }
            System.out.println();

        }

    }

}
