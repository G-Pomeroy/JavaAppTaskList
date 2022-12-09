import java.util.ArrayList;
import java.util.Scanner;

public class action {


    public action() {

    }

    public void intial(){
        System.out.println("To Do List Application");
        System.out.println("----------------------");
        System.out.println("Please select one of the following options:");
        System.out.println("");
        System.out.println("1. Add a task");
        System.out.println("2. Mark Existing Tasks Complete");
        System.out.println("3. Remove Task");
        System.out.println("4. Edit Task");
        System.out.println("5. Show All Tasks");
        System.out.println("6. Exit Application");
    }

    public void case1(Scanner input, ArrayList<String> listTitle, ArrayList<String> listDate, ArrayList<String> listStatus,ArrayList<String> listDesc){
        System.out.println("Add a task");
        System.out.println("----------------------");
        System.out.println("Please enter a task title: ");
        listTitle.add(input.nextLine());

        System.out.println("Please add a description for this task:");
        listDesc.add(input.nextLine());

        System.out.println("Please add a due date for this task (mm-dd-yyyy): ");
        listDate.add(input.nextLine());

        System.out.println("Please enter a status for this task: ");
        listStatus.add(input.nextLine());

        System.out.println("Task successfully added!");
    }

    public void case2(Scanner input, ArrayList<String> listTitle, ArrayList<String> listDate,
                      ArrayList<String> listStatus,ArrayList<String> listDesc, int i, int listIndex){

        System.out.println("");
        System.out.println("Please select existing task to mark as complete: ");
        System.out.println("----------------------");


        if (listTitle.size() > 0) {
            for (i = 0; i < listTitle.size(); i++) {

                System.out.println("Task #" + (i+1) + ": " + listTitle.get(i));
                System.out.println("Description: " + listDesc.get(i));
                System.out.println("Date Due: " + listDate.get(i));
                System.out.println("State of Task: " + listStatus.get(i));
                System.out.println("----------------------");

            }
        }else {
            System.out.println("No tasks created yet!");
            System.out.println("");
        }


        listIndex = input.nextInt();
        listStatus.set(listIndex-1,"Complete!");



    }

    public void case3(Scanner input, ArrayList<String> listTitle, ArrayList<String> listDate,
                      ArrayList<String> listStatus,ArrayList<String> listDesc, int i, int listIndex){

        System.out.println("Remove existing task");
        System.out.println("----------------------");
        System.out.println("Please select existing task to remove: ");

        if (listTitle.size() > 0) {
            for (i = 0; i < listTitle.size(); i++) {

                System.out.println("Task #" + (i+1) + ": " + listTitle.get(i));
                System.out.println("Description: " + listDesc.get(i));
                System.out.println("Date Due: " + listDate.get(i));
                System.out.println("State of Task: " + listStatus.get(i));
                System.out.println("----------------------");
            }
        } else {
            System.out.println("No tasks created yet!");
            System.out.println("");
        }

        listIndex = input.nextInt();

        listTitle.remove(listIndex-1);
        listDesc.remove(listIndex-1);
        listDate.remove(listIndex-1);
        listStatus.remove(listIndex-1);

        System.out.println("Task removed successfully!");

    }

    public void case4(Scanner input, ArrayList<String> listTitle, ArrayList<String> listDate,
                      ArrayList<String> listStatus,ArrayList<String> listDesc, int i, int listIndex){


        System.out.println("Please select existing task to edit: ");
        System.out.println("----------------------");

        if (listTitle.size() > 0) {
            for (i = 0; i < listTitle.size(); i++) {

                System.out.println("Task #" + (i+1) + ": " + listTitle.get(i));
                System.out.println("Description: " + listDesc.get(i));
                System.out.println("Date Due: " + listDate.get(i));
                System.out.println("State of Task: " + listStatus.get(i));
                System.out.println("----------------------");
            }
        } else {
            System.out.println("No tasks created yet!");
            System.out.println("");
        }

        listIndex = input.nextInt();

        System.out.println("Select a component to edit: ");
        System.out.println("1. Title ");
        System.out.println("2. Description ");
        System.out.println("3. Due Date ");
        System.out.println("4. Status ");

        int subMenuSelect = input.nextInt();
        input.nextLine();


        switch (subMenuSelect){
            case 1:
                System.out.println("Enter a Title: ");
                listTitle.set(listIndex-1,input.nextLine());
                break;
            case 2:
                System.out.println("Enter a Description: ");
                listDesc.set(listIndex-1,input.nextLine());
                break;
            case 3:
                System.out.println("Enter a Date (mm-dd-yyyy): ");
                listDate.set(listIndex-1,input.nextLine());
                break;
            case 4:
                System.out.println("Enter a Status: ");
                listStatus.set(listIndex-1,input.nextLine());
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }

    }

    public void case5(Scanner input, ArrayList<String> listTitle, ArrayList<String> listDate,
                      ArrayList<String> listStatus,ArrayList<String> listDesc, int i, int listIndex){

        System.out.println("Display all tasks");
        System.out.println("----------------------");

        if (listTitle.size() > 0) {
            for (i = 0; i < listTitle.size(); i++) {

                System.out.println("Task #" + (i+1) + ": " + listTitle.get(i));
                System.out.println("Description: " + listDesc.get(i));
                System.out.println("Date Due: " + listDate.get(i));
                System.out.println("State of Task: " + listStatus.get(i));
                System.out.println("----------------------");
            }
        } else {
            System.out.println("No tasks created yet!");
            System.out.println("");
        }
    }



}
