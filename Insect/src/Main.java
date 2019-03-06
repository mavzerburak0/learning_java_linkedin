public class Main {

    public static void main(String[] args) {

        Insect insect = new Insect(4, 8);
        Spider spider = new Spider(8, 8, true);
        Cricket cricket = new Cricket(1.25);

        insect.crawl();
        insect.says();
        System.out.println();
        spider.says();
        //spider.crawl();
        System.out.println();
        cricket.crawl();
        cricket.says();
        cricket.jump();

        if (spider instanceof Insect && spider instanceof Spider) {
            System.out.println("spider is an insect and a spider.");
        }

    }

}
