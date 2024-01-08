package Section34;

/*
3
6  9
12  15  18
21  24  27  30 */

public class assignment3 {

    public static void main(String[] args) {

        int count = 1;

        for (int row = 1; row <= 4; row++) {

            for (int col = 1; col <= row; col++) {

                System.out.print((count*3) + "  ");
                count++;

            }
            System.out.println();

        }
    }
}
