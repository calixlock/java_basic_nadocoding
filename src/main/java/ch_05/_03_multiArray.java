package ch_05;

public class _03_multiArray {
    public static void main(String[] args) {
        String[] s_A = {"a1","a2","a3"};
        String[] s_B = {"b1","b2","b3"};
        String[] s_C = {"c1","C2","c3"};
        String[][] seats = new String[][]{
                s_A,
                s_B,
                s_C
        };
        System.out.println(seats[1][2]); // [x] * [y] 행렬
        // x : column
        // y : row
        String[][] seats2 = new String[10][10];
        char ch = 'A';
        for (int i = 0; i <seats2.length ; i++) {
            for (int j = 0; j < seats2[i].length; j++) {
                seats2[i][j] = String.valueOf(ch) + (j+1);
                System.out.printf(seats2[i][j] + " ");
            }ch++;
            System.out.println();

        }
    }
}
