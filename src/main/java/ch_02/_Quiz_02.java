package ch_02;

public class _Quiz_02 {
    public static void main(String[] args) {
        int height = 11;
        String result = (height < 120) ? "키가 "+height+"cm 이므로 탑승이 불가능합니다.":"키가 "+height+"cm 이므로 탑승이 가능합니다.";
        System.out.println(result);
    }
}
