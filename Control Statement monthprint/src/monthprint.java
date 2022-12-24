public class monthprint {
    public static void main(String[] args) {
        int MonthNumber = 6;
        String MonthName = "" ;
        switch (MonthNumber){
            case 1 : MonthName = "January";
            break;
            case 2 : MonthName = "February";
            break;
            case  3 : MonthName = "March";
                break;
            case 4 : MonthName = "April";
                break;
            case 5 : MonthName = "May";
                break;
            case 6 : MonthName = "June";
                break;
            case 7 : MonthName = "Jully";
                break;
            case 8 : MonthName = "August";
                break;
            case 9 : MonthName = "September";
                break;
            case 10 : MonthName = "October";
                break;
            case 11 : MonthName = "November";
                break;
            case 12: MonthName = "December";
                break;
            default:
                MonthName = "Invalid month";
        }
        System.out.println("Month name");
    }
}