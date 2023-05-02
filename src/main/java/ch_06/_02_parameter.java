package ch_06;

public class _02_parameter {
    public static void main(String[] args) {

        int result = getPow(2);
        System.out.println(result);
        System.out.println(getPow(3));
    }
    public static int getPow(int num){
        return num * num;
    }
}
