public class Main {

    public static void main(String[] args) throws InterruptedException {
        for (Season season : Season.values()) {

            Thread.sleep(1000);
            System.out.println( season.msg);
        }

    }

    }
