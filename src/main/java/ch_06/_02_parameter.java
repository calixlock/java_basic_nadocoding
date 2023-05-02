package ch_06;

public class _02_parameter {
    // main
    public static void main(String[] args) {

        int result = getPow(2);
        System.out.println(result);
        System.out.println(getPow(3));
        System.out.println(getPow("4"));
        System.out.println(getPow(2,5));
    }

    // method
    public static int getPow(int num){
        return getPow(num,2);
    }
    // method overloading
    public static int getPow(String strNum){
       int num = Integer.parseInt(strNum);
        return getPow(num,2);
    }
    public static int getPow(int num, int exp){
        int result = 1;
        for (int i = 0; i < exp; i++) {
            result *= num;
        }return result;
    }
}
