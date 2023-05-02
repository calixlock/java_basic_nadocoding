package ch_05;

public class _02_arrayLoop {
    public static void main(String[] args) {
        String[] coffees = {"1","2","3","4"};
        for (int i = 0; i < coffees.length; i++) {
            System.out.println(coffees[i]);
        }
        System.out.println("----------------------");
        for (String item : coffees){
            System.out.println(item);
        }
    }
}
