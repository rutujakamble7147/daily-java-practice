public class SwitchCaseExample {
    public static void main(String[] args) {
        int  num = 20;
        switch (num+2){
            case 1:
                System.out.println("case1: value is :" +num);
            case 2:
                System.out.println("case2 : value is :" +num);
            case 3:
                System.out.println("case3 : value is : " +num);
            default:
                System.out.println("default : value is :" +num);
        }
    }
}