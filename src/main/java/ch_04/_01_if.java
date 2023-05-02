package ch_04;
public class _01_if {
    public static void main(String[] args) {
        int num = 0;
        boolean hallabongAde = true;
        boolean mangoJuice =true;
        boolean iceAmericano = true;
        if (hallabongAde){
            num++;
        }else if (mangoJuice) {
            num++;
        }else if (iceAmericano){
            num++;
        }else {
            System.out.println("아무것도 없음");
        }
        System.out.println(num);
    }
}
