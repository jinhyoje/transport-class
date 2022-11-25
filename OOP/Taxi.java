package OOP;

public class Taxi extends transport{
    public static void main(String[] args) {
        Taxi taxi = new Taxi(4, 3000, "일반");
        Taxi taxi2 = new Taxi(4, 3000, "일반");
        taxi.run(0);
        System.out.println("상태 = " + taxi.state);
        System.out.println();

        taxi.boarding(2, "서울", 2);
        System.out.println("기본 요금 확인 = " + taxi.charge);
        taxi.totalCharge(2);
        System.out.println("상태 = " + taxi.state);
        System.out.println();

        taxi.run(-80);
        System.out.println();

        taxi.out();
        taxi.boarding(5, "", 0);
        taxi.out();
        System.out.println();

        taxi.boarding(3, "구로디지털단지역", 12);
        System.out.println("기본 요금 확인 = " + taxi.charge);
        taxi.totalCharge(12);
        System.out.println();

        taxi.run(-20);
        taxi.out();
        System.out.println();









    }



    // 필드
//    int maxPassenger = 4;
////    int taxiNumber;
////   int gas = 100;
////   int speed = 0;
////   int accelOrBreak;
   String destination;
   int distance = 1;
    int destDistance;
//    int charge = 3000;
   int destCharge = 1000;
//   String state = "일반";

    // 생성자
    Taxi(int maxPassenger, int charge, String state){
        this.number = number;
        this.maxPassenger = maxPassenger;
        this.charge = charge;
        this.state = state;
    }
//
//    Taxi() {
//        this.taxiNumber = (int) (Math.random() * 10000 + 1);
//        System.out.println("택시번호:" + taxiNumber);
//    }

    // 메서드

    boolean run(int gas){
        currentGas += gas;
        if(isLeftGas()){
            System.out.println("주유량 = " + currentGas);
            return true;
        }else{
            System.out.println("주유가 필요합니다. 주유량 = " + currentGas);
            state = "운행불가";
            System.out.println("상태 = " + state);
            return false;
        }
    }
    boolean boarding(int passenger, String destination, int destDistance){
        currentPassenger += passenger;
        if(!maxBoarding()){
            System.out.println("최대 승객 수 초과");
        }
        else if(state.equals("일반")){
            state = "운행 중";
            System.out.println("지금은 " + state + "입니다.");
            System.out.println("탑승 승객 수 = " + currentPassenger );
            System.out.println("잔여 승객 수 = " + (maxPassenger-passenger) );
            System.out.println("목적지 = " + destination);
            System.out.println("목적지까지 거리 = " + destDistance + "km");
        }

        return false;
    }

    void out(){
        currentPassenger = 0;
        state = "일반";
        charge = 3000;
    }

//    int changeSpeed(int accelOrBreak){
//        this.accelOrBreak = accelOrBreak;
//        if(state.equals("운행 중") || state.equals("일반")){
//            speed += accelOrBreak;
//
//        }
//        System.out.println("현재 속도는 " + speed + "km/hr");
//        return speed;
//    }

    int totalCharge(int destDistance){
        this.destDistance = destDistance;
        this.charge = charge;
        if(destDistance > distance){
            charge += (destDistance - distance) * destCharge;
        }else if (destDistance == distance){
            return charge;
        }
        System.out.println("최종 요금은 " + charge + "입니다.");
        return charge;
    }

}
