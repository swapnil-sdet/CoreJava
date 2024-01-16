package Section34Arrays;

/* Find smallest number across the matrix
2 4 5
3 4 7
1 2 9
For smallest number - if (arr[row][col] < min) at line number 26
For largest number - if (arr[row][col] > min) at line number 26
 */

public class InterviewMinNumber {

    public static void main(String[] args) {

        //Initialize an array
        int arr[][] = {{2, 4, 5}, {3, 4, 7}, {1, 2, 9}};

        int min = arr[0][0];

        //Traverse through the array
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {

                //System.out.print(arr[row][col] + "  ");

                if (arr[row][col] < min) {
                    min = arr[row][col];
                }
            }
            //System.out.println();
        }
        System.out.println(min);
    }
}
