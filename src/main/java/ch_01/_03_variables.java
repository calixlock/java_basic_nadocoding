package ch_01;

public class _03_variables {
    public static void main(String[] args) {
        int i = 15;
        double score = 1.1;
        float pi = 3.14f;
        char grade = 'a';
        System.out.println(i);
        String name = "kim";
        System.out.println(name+String.format(" 님이 %d시에 접속하였습니다",i));

//        int a = 1000000000000;
        long a =  1000000000000l; // 21억 이상의 수는 long
        a =  1_000_000_000_000l; // 21억 이상의 수는 long
        System.out.println(a);
    }

}
