package practice.algo.array;

public class AntiClockWise2DArrayTraverse {

    public static void main(String[] args) {

        // not working if m or n is odd
        int a[][] = {{1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
        };

        /*int a[][] = {{1,  2,  3,  4},
                    {5,   6,  7,  8},
                    {9,  10,  11, 12},
                    {13, 14,  15, 16}
        };*/

        traverse(a, a.length, a[0].length);
    }

    public static void traverse(int[][] a, int rows, int columns) {

        int leftDown = 0;
        int bottomRight = 0;
        int rightUp = rows - 1;
        int topLeft = columns - 1;

        while (leftDown <= rightUp && bottomRight <= topLeft) {

            for (int i = leftDown; i <= rightUp - 1; i++) {
                System.out.print(a[i][bottomRight] + " ");
            }

            for (int i = bottomRight; i <= topLeft - 1; i++) {
                System.out.print(a[rightUp][i] + " ");
            }

            for (int i = rightUp; i > leftDown; i--) {
                System.out.print(a[i][topLeft] + " ");
            }

            for (int i = topLeft; i > bottomRight; i--) {
                System.out.print(a[bottomRight][i] + " ");
            }

            leftDown++;
            bottomRight++;
            rightUp--;
            topLeft--;
        }
    }
}