import java.awt.*;

public class Main {

    public static void main(String[] args) {

        CellPhone myCell = new CellPhone("Huawei",
                Color.BLACK,
                5,
                true);


        System.out.println(myCell.makeACall(3));

        //System.out.println("Battery left before playing a game: " + myCell.batteryLeft);
        myCell.playGames();
        //System.out.println("Battery left after playing a game: " + myCell.batteryLeft);
        myCell.playGames();
        System.out.println(myCell.isPhoneOn);
        myCell.playGames();
        myCell.makeACall(4);

        myCell.chargePhone(5);
        System.out.println("Battery after charging: " + myCell.batteryLeft);
        myCell.turnOffAndOn();
        System.out.println(myCell.isPhoneOn);
        myCell.playGames();



    }
}
