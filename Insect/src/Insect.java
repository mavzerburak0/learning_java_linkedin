public class Insect {
    int numberOfLegs;
    int numberOfEyes;

    public Insect() {

    }

    public Insect(int inputLegs, int inputEyes) {
        this.numberOfEyes = inputEyes;
        this.numberOfLegs = inputLegs;
    }

    public void says() {
        System.out.println("...");
    }

    public void crawl() {
        System.out.println("The insect crawled.");
    }

}
