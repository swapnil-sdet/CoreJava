package Section34Arrays;

/*
2 4 5
3 4 7
1 2 9
Find smallest number from the row & from the same column extract the largest number
e.g. Smallest number - 1 & from the same column extract the largest number - 3
 */

public class InterviewMaxNumber {

    public static void main(String[] args) {

        //Initialize an array
        int abc[][] = {{2, 4, 5}, {3, 4, 7}, {1, 2, 9}};

        int min = abc[0][0];
        int mincoloumn = 0;


        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (abc[i][j] < min)//2
                {
                    min = abc[i][j];
                    mincoloumn = j;
                }
            }
        }
//=1
        int max = abc[0][mincoloumn];
        int k = 0;
        while (k < 3) {
            if (abc[k][mincoloumn] > max) {
                max = abc[k][mincoloumn];
            }
            k++;
        }

        System.out.println(max);

    }
}
