package game.view;

import java.util.Scanner;

public class MenuViev {

    private static final int START_CODE=1;
    private static final int LOAD_CODE=1;
    private static final int SETTING_CODE=1;
    private static final int EXIT_CODE=1;

    public int showMenuWithResult(){
        System.out.println(START_CODE+ " - Start");
        System.out.println(LOAD_CODE+ " - Load");
        System.out.println(SETTING_CODE+ " - Setting");
        System.out.println(EXIT_CODE+" - Exit");
        System.out.print(">");

        final Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

//        if (choice==START_CODE){
//            System.out.println(START_CODE+"START!");
//        } else if (choice==2){
//            System.out.println("Load!");
//        } else if (choice==3){
//            System.out.println("Setting!");
//        } else if (choice==4){
//            System.out.println("EXIT!");
//        } else  {
//            System.out.println("Really?!");
//        }
        switch (choice) {
            case START_CODE:
                System.out.println("START!");
                break;
            case 2:
                System.out.println("Load!");
                break;
            case 3:
                System.out.println("Setting!");
                break;
            case 4:
                System.out.println("EXIT!");
                break;
            default:
                System.out.println("Really?!");
                break;



        }


        return 0;
    }

}
