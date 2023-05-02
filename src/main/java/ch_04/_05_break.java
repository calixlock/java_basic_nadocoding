package ch_04;

public class _05_break {
    public static void main(String[] args) {
        int limit = 20;
        int max = 50;
        int noShow = 4;
        System.out.println("----------for문---------");
        for (int i = 0; i < max; i++) {
                System.out.println(i+"번째");
            if (i == limit){
                System.out.println("max값에 도달.");
                break;
            }
            if (i == noShow) {
                System.out.println("noShow 발생");
                continue;

            }i++;
        }
        System.out.println("----------while문---------");

        int index = 1;
        while (index <= 50){
            System.out.println(index+" 번째");
            if ( index == limit){
                System.out.println("max값에 도달.");
                break;
            }if (index == noShow) {
                System.out.println("noShow 발생");
                continue;
            }
            index++;
        }
    }
}
