package ch_01;

public class _06_typecasting {
    public static void main(String[] args) {
        // 형변환
        // 정수 > 실수  // 실수 > 정수
        int score = 93;
        System.out.println(score);
        System.out.println((double) score);
        System.out.println((float) score);

        float score_f = 92.1f;
        double score_d = 95.5;
        System.out.println((int) score_f);
        System.out.println((int) score_d);

        System.out.println((int) score_d + score);
        System.out.println( score_d + (double) score);
        // int > long > float > double  커지는 방향은 자동 형변환 가능

        String score_string = String.valueOf(score);
        String score_integer = Integer.toString(score);
        String score_d_string = String.valueOf(score_d);
        System.out.println(score_string+','+ score_d_string);
        System.out.println(score_integer);
//        문자 > 숫자
        int num = Integer.parseInt("98");
        System.out.println(num);
        double num2 = Double.parseDouble("98.9");
        System.out.println(num2);
    }
}
