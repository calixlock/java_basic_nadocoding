package ch_03;

public class _Quiz_03 {
    public static void main(String[] args) {
        String socialSecurityNumber = "000000-0000000";
        System.out.println(socialSecurityNumber.substring(0,8));
        System.out.println(socialSecurityNumber.substring(0,socialSecurityNumber.indexOf("-")+2));
    }
}
