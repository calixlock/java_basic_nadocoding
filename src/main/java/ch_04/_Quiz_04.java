package ch_04;

public class _Quiz_04 {
//     주차요금 시간당 4000원
//     일일 최대 요금 30000원
//    경차 / 장애인 최종 요금 50% 할인
//    일반 차량 5시간 주차 20000
//    경차 주차 5시간 10000원
//    장애인 10시간 15000원
    public static void main(String[] args) {
        boolean isSmmallCar = true;
        boolean withDisabledPerson = false;
        int time = 10;
        int parkingPerHour = 4000;
        int maxFee = 30000;
        int totalFee = time * parkingPerHour;
        if (totalFee > maxFee) {
            totalFee = 30000;
        }
        if (isSmmallCar || withDisabledPerson) {
            totalFee *= 0.5;
        }
        System.out.println("주차요금 " + time + "시간 " + totalFee + "원");
    }

}
