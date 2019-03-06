public class Cricket extends Insect {

    double length;

    public Cricket(double length) {
        super(6, 2);
        this.length = length;
    }

    public void says() {
        System.out.println("CHIRP");
    }

    public void jump() {
        System.out.println("The cricket jumped!");
    }

}

