public class Main {
    public static void main(String[] args) {

    int value =4;
    switch (value){
        case 1:
            System.out.println("1");
            break;
        case 2:
            System.out.println("2");
            break;
        case 3:
            System.out.println("3");
            break;
        default:
            break;
    }

    }

    public static String getQuarter(String month){
        switch (month) {
            case "January":
            case "February":
            case "March":
                return "1st";
        }
    }
}