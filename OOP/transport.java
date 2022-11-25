package OOP;

public class transport {

    int number;
    static int charge;
    int currentGas = 100;
    int speed = 0;
    int accelOrBreak;
    static int currentPassenger;
    int maxPassenger;
    String state = "";



    transport() {
        this.number = (int) (Math.random() * 10000 + 1);
        System.out.println("번호:" + number);
    }

    boolean isLeftGas() {
        return currentGas >= 10;

    }


    boolean maxBoarding() {
        return maxPassenger >= currentPassenger;
    }

    int changeSpeed(int accelOrBreak){
        this.accelOrBreak = accelOrBreak;

        if(isLeftGas()){
            speed += accelOrBreak;
        }


        System.out.println("현재 속도 : " + speed + "km/hr");
        return speed;
    }



//    void gasChange(int gas){
//        this.gas += gas;
//    }

//    void passengerChange(int passenger){
//        this.passenger += passenger;
//        this.maxPassenger -= passenger;
//    }


}
