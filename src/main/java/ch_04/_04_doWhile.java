package ch_04;

public class _04_doWhile {
    public static void main(String[] args) {
        int distance = 25;
        int move = 27;
        int height = 2;
        do{
            System.out.println("현재 이동거리 : "+ move);
            move +=3;
        }while(move +height < distance);
            System.out.println("도착");
    }
}
