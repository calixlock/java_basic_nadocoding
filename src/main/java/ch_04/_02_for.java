package ch_04;

public class _02_for {
    public static void main(String[] args) {
        for(int i=0; i<5; i++){
            System.out.println(i);
        }
        for (int k = 0; k < 5; k++) {

            for (int j = 0; j < 4-k; j++) {
                System.out.printf(" ");
            }
            for (int i = 0; i <= k; i++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
