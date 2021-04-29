package program;

import program.menu.WorkerManager;
import program.menu.departmentManagmentMenu.DepartmentManagmentMenu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        WorkerManager workerManager = new WorkerManager();
        DepartmentManagmentMenu departmentManagmentMenu = new DepartmentManagmentMenu();
        boolean running = true;
        Scanner input = new Scanner(System.in);


        while (running){
            System.out.println("Choose an option: ");
            System.out.println("1: Worker manager: ");
            System.out.println("2: Department manager: ");
            System.out.println("3: Accident logs");
            System.out.println("4: Ship contract manager");
            System.out.println("5:");
            System.out.println("6:");
            System.out.println("7:");
            System.out.println("8:");
            System.out.println("0: Exit program");
            int choice = input.nextInt();

            switch (choice){
            case 1 -> workerManager.managmentMenu();
            case 2 -> departmentManagmentMenu.departmentManagmentMenu();
            case 0 -> running = false;

            }
        }
    }
}
