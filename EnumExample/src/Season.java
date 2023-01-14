 enum Season {
     WINTER("I love Winter"),//public static final Seasons WINTER  = new Season("I love winter");
     SUMMER("I hate summer"),//public static final Seasons SUMMER = new Season("I hate summer");
     MONSOON("Monsoon is ok");//public static final Seasons MONSOON  = new Season("Monsoon is ok");
     String msg;

     Season(String msg) {
         this.msg = msg;
     }

     public String getMsg() {
         return msg;
     }

     public void setMsg(String msg) {
         this.msg = msg;
     }

     public class Main {
         public static void main(String[] args) throws InterruptedException {
             for (Season season : Season.values()) {

                 Thread.sleep(1000);
                 System.out.println(season.name() + " " + season.msg);
             }
         }

     }
 }