import java.util.Scanner;

public class Main {

    static Scanner scan = new Scanner(System.in);
    static Television tv;

    public static void main(String[] args) {


        showMenu();
        boolean exit = false;

        while (exit == false) {
            System.out.println("Your choice : (Press 8 to view the menu)");
            int choice = scan.nextInt();

            switch (choice) {

                case 1:
                    tvSetUp();
                    break;
                case 2:
                    openTv();
                    break;
                case 3:
                    volumeUp();
                    break;
                case 4:
                    volumeDown();
                    break;
                case 5:
                    changeChannel();
                    break;
                case 6:
                    showChannelInfo();
                    break;
                case 7:
                    closeTv();
                    break;
                case 8:
                    showMenu();
                    break;
                case 0:
                    System.out.println("Exiting the system");
                    exit = true;
                    break;
                default:
                    System.err.println("Enter a value between 0 and 8 ");
                    break;

            }
        }

    }

    public static void showChannelInfo() {
        if (tv != null) {
            tv.showCurrentChannel();
        } else {
            System.err.println("First Set up TV and Create channels");
        }
    }

    private static void changeChannel() {
        if (tv != null) {
            System.out.println("Which channel do you want to see ? \n");
            int channelWantoOpen = scan.nextInt();
            tv.changeChannel(channelWantoOpen);
        } else {
            System.err.println("First Set up TV and Create channels");
        }
    }

    private static void volumeUp() {
        if (tv != null) {
            tv.volumeUp();
        } else {
            System.err.println("First Set up TV and Create channels");
        }
    }

    private static void volumeDown() {
        if (tv != null) {
            tv.volumeDown();
        } else {
            System.err.println("First Set up TV and Create channels");
        }
    }

    private static void closeTv() {
        if (tv != null) {
            tv.closeTv();
        } else {
            System.err.println("First Set up TV and Create channels");
        }
    }

    private static void openTv() {
        if (tv != null) {
            tv.openTv();
        } else {
            System.err.println("First Set up TV and Create channels");
        }
    }

    private static void tvSetUp() {

        if (tv == null) {
            scan.nextLine();
            System.out.println("Enter the brand of the TV");
            String brand = scan.nextLine();
            System.out.println("Enter the size of the TV");
            String size = scan.nextLine();
            tv = new Television(brand, size);
            System.out.println(tv);
        } else {
            System.err.println("Television Active");
            System.out.println(tv);
        }


    }

    private static void showMenu() {
        System.out.println("************* Menu *************");
        System.out.println("0 --- Exit\n" +
                "1 -- Set Up Television\n" +
                "2 -- Open Television\n" +
                "3 -- Volume Up\n" +
                "4 -- Volume Down\n" +
                "5 -- Change Channel \n" +
                "6 -- Show Channel Info\n" +
                "7 -- Close it Television\n" +
                "8 -- Show Menu\n");


    }
}