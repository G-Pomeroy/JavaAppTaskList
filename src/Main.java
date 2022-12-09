import java.util.Scanner;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<String> listTitle = new ArrayList<String>();
        ArrayList<String> listDate = new ArrayList<String>();
        ArrayList<String> listStatus = new ArrayList<String>();
        ArrayList<String> listDesc = new ArrayList<String>();
        action tasks = new action();
        int listIndex = 0;
        int i = 0;

        boolean mainLoop = true;




        try {

        while (mainLoop = true) {

            tasks.intial();

        int menuSelect = input.nextInt();
        input.nextLine();



                switch (menuSelect) {
                    case 1:

                        tasks.case1(
                                input,  listTitle, listDate,
                                listStatus, listDesc
                        );


                        break;
                    case 2:
                        
                        tasks.case2(
                                input,  listTitle, listDate,
                                listStatus, listDesc, i, listIndex
                        );


                        break;

                    case 3:

                        tasks.case3(
                                input,  listTitle, listDate,
                                listStatus, listDesc, i, listIndex
                        );


                        break;
                    case 4:

                        tasks.case4(
                                input,  listTitle, listDate,
                                listStatus, listDesc, i, listIndex
                        );


                        break;
                    case 5:

                        tasks.case5(
                                input,  listTitle, listDate,
                                listStatus, listDesc, i, listIndex
                        );


                        break;
                    case 6:

                        System.out.println("Exiting application...");
                        System.exit(0);

                        break;
                    default:
                        System.out.println("Incorrect Input");
                        break;
                }
            }
    } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

