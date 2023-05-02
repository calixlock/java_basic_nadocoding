package ch_05;

public class _Quiz_05 {
    public static void main(String[] args) {
        String[] sizeOfShoes = new String[10];
        for (int i = 0; i < sizeOfShoes.length; i++) {
            sizeOfShoes[i] = String.valueOf(250 + i*5);
            System.out.printf(sizeOfShoes[i]+" ");
        }
    }
}
