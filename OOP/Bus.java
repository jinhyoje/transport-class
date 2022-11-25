package OOP;

public class Bus extends  transport{
    public static void main(String[] args) {


        Bus bus = new Bus(30, "운행", 0, 0);
//        Bus bus2 = new Bus(30, "운행", 1000, 0); // 1번

        bus.onBoarding(2); // 2번
        System.out.println();

        bus.run(-50);  //3번
        System.out.println();

        bus.run(-50); // 4번
        System.out.println();

        bus.run(+10); // 5번, 6번
        bus.run(+50);
        System.out.println();

        bus.onBoarding(45);
        System.out.println();

        bus.onBoarding(5);
        System.out.println();

        bus.run(-55);
        System.out.println();



    }
        // 필드
//    int maxPassenger = 30;  // 최대 승객수
//    int currentPassenger = 0; // 현재 승객수
//    int charge = 1000; // 버스 요금
//    int busNumber; // 버스 번호
//    int gas = 100; // 주유량
//    int speed = 0; // 현재 속도
//    int accelOrBreak; // 속도 변경
//    String state = "운행"; // 버스 상태



        // 생성자
        Bus( int maxPassenger, String state, int charge, int currentPassenger){
            this.number = number;
            this.maxPassenger = maxPassenger;
            this.state = state;
            this.charge = charge;
            this.currentPassenger = currentPassenger;

        }


//    Bus() {
//        this.busNumber = (int) (Math.random() * 10000 + 1);
//        System.out.println("버스번호:" + busNumber);
//    } // 버스번호 랜덤 생성

        // 메소드

//    boolean isLeftGas(){
//        return gas >= 10;
//    }

        boolean run (int gas) {
            currentGas += gas;
//            if (!state.equals("운행")) {
//                state = "차고지행";
//                currentPassenger = 0;
//            }
            if (isLeftGas()) {
                System.out.println("gas잔량 : " + currentGas);
                state = "운행";
                System.out.println("상태 = " + state);
                return false;
            }
            if (!isLeftGas()) {
                System.out.println("주유가 필요합니다. (gas잔량 : " + currentGas + ")" );
                state = "차고지행";
                currentPassenger = 0;
                charge = 0;
                System.out.println("상태 = " + state);
            }
            return true;
        }

//    boolean maxBoarding() {
//        return maxPassenger >= currentPassenger;
//    }

    void onBoarding(int passenger) {

        if (maxPassenger >= (currentPassenger + passenger)) {
            currentPassenger += passenger;
            charge += passenger * 1000 ;
            System.out.println("승객" + passenger + "명 탑승, 현재 승객수 " + currentPassenger + "명 입니다.");
            System.out.println("잔여 승객 수 = " + (maxPassenger - passenger));
            System.out.println("요금 확인 = " + charge);
            return;
        }


            System.out.println((currentPassenger + passenger - maxPassenger) + "명 초과, 탑승불가 입니다.");
            currentPassenger = 0;



    }


}





//    int changeSpeed(int accelOrBreak){
//        this.accelOrBreak = accelOrBreak;
//
//        if(isLeftGas()){
//            speed += accelOrBreak;
//        }
//
//
//        System.out.println("현재 속도 : " + speed + "km/hr");
//        return speed;
//    }
//



