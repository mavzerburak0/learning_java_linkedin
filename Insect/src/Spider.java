public class Spider extends Insect {

    boolean isPoisonous;

    public Spider(int numberofLegs, int numberofEyes, boolean isPoisonous) {

        super(numberofLegs, numberofEyes);
        this.isPoisonous = isPoisonous;

    }

    public void says() {
        System.out.println("HISSS");
    }

}
