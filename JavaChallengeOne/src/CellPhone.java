import java.awt.*;

public class CellPhone {


    double callCharge;
    int batteryLeft;
    Color phoneColor;
    String phoneBrand;
    boolean isPhoneOn;

    public CellPhone(String inputPhoneBrand,
                     Color inputPhoneColor,
                     int inputBatteryLeft,
                     boolean inputPhoneOn) {
        this.phoneBrand = inputPhoneBrand;
        this.phoneColor = inputPhoneColor;
        this.batteryLeft = inputBatteryLeft;
        this.isPhoneOn = inputPhoneOn;
    }

    public void playGames() {
        if(this.batteryLeft == 0) {
            this.turnOffAndOn();
            System.out.println("Your battery died.");
        }
        else {
            this.batteryLeft -= 5;
        }
    }

    // Make a call an see how much you are charged

    public double makeACall(int minutes) {
        if (this.batteryLeft == 0) {
            System.out.println("Your phone is dead.");
            return 0;
        }
        else {
            callCharge = 0;
            callCharge += 0.5 * minutes;
            return callCharge;
        }

    }

    public void chargePhone(int minutes) {
        this.batteryLeft += 5 * minutes;
    }

    public void turnOffAndOn() {
        if (this.batteryLeft != 0 & !this.isPhoneOn) {
            this.isPhoneOn = true;
        }
        else {
            this.isPhoneOn = false;
        }

    }

}
