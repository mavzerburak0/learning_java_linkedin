import java.awt.*;

public class Car {

    // Data types:
    // int -> integer 1,2,3
    // double -> 3.2, 2.0
    // String -> "Hello world"
    // Color -> awt - abstract window toolkit
    // boolean - true or false

    double averageMilesPerGallon;
    String licensePlate;
    Color paintColor;
    boolean tailLights;

    public Car(double inputAverageMPG,
               String inputLicensePlate,
               Color inputPaintColor,
               boolean inputTailLights) {
        this.averageMilesPerGallon = inputAverageMPG;
        this.licensePlate = inputLicensePlate;
        this.paintColor = inputPaintColor;
        this.tailLights = inputTailLights;
    }

    public void changePaintColor(Color newPaintColor) {
        this.paintColor = newPaintColor;
    }

    // ==== CALL BY VALUE VS. CALL BY REFERENCE ====

    public double speedUp(double currentSpeed) {
        currentSpeed += 100;
        return currentSpeed;
    }

}
