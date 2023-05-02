package ch_02;

public class _01_operator_1 {
    public static void main(String[] args) {
        // 산술 연산
        int i = 1;
        System.out.println(String.format("i = %d",i));
        System.out.println(--i);
        System.out.println(String.format("i = %d",i));
        System.out.println(++i);
        System.out.println(String.format("i = %d",i));
        System.out.println(i++);
        System.out.println(String.format("i = %d",i));
        System.out.println(5/2); // 몫
        System.out.println(5%2); // 나머지

        int num = 10;
        System.out.println("num+=2 : " + (num+=2));
        System.out.println("num-=2 : " + (num-=2));
        System.out.println("num*=2 : " + (num*=2));
        System.out.println("num%=2 : " + (num%=2));

        // 비교 연산
        System.out.println("3 > 2 : " + (3>2));
        System.out.println("3 >= 2 : " + (3>=2));
        System.out.println("3 < 2 : " + (3<2));
        System.out.println("3 <= 2 : " + (3<=2));
        System.out.println("3 == 2 : " + (3==2));
        System.out.println("3 != 2 : " + (3!=2));

        // 논리 연산
        // or == ||
        // and == &&
        // !true  == false
        // !false == true

        //삼항 연산
        int x = 2;
        int y = 3;
        int max = (x >= y) ? x : y; // 3
        x = 5;
        y = 3;
        max = (x >= y) ? x : y; // 5
        System.out.println(max);
    }
}
