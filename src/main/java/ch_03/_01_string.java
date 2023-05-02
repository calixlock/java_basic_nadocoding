package ch_03;

public class _01_string {
    public static void main(String[] args) {
        String s = "i like java and python and c.";
// 변환
        System.out.println(s.length()); // 길이
        System.out.println(s.toUpperCase()); // 대문자
        System.out.println(s.toLowerCase()); // 소문자
// 탐색
        System.out.println(s.contains("ja"));
        System.out.println(s.contains("JA"));
        System.out.println(s.indexOf("ja")); // 없을시 -1 반환
        System.out.println(s.indexOf("and"));
        System.out.println(s.lastIndexOf("and"));
        System.out.println(s.startsWith("i"));  // boolean 형태
        System.out.println(s.startsWith("li")); // boolean 형태
        System.out.println(s.endsWith("."));    // boolean 형태
        System.out.println(s.endsWith(","));    // boolean 형태
// 변환2
        System.out.println(s.replace("and",","));
        System.out.println(s.substring(s.indexOf("ja"),s.indexOf(".")));
        System.out.println(s.substring(s.indexOf("ja"),s.indexOf(".")+1));
// 공백 제거
        s = "       asdjfkal  asdjfklas   asdss      ";
        System.out.println(s.trim()); // 문자열 처음과 끝 (공백제거)
// 문자결합
        String s1 = "java"; String s2 = "python";
        System.out.println(s1+" or "+s2);
        System.out.println(s1.concat(" or ").concat(s2));
// 문자열 비교
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals("java")); // 완전 동일
        System.out.println(s1.equalsIgnoreCase("JAVA")); // 대소문자 구분없이

        String ss1 = new String("1234");
        String ss2 = new String("1234");
        System.out.println(ss1.equals(ss2)); // 내용 비교  // true
        System.out.println(ss1 == ss2); // 참조(리모콘/메모리주소) 비교 // false

    }
}
