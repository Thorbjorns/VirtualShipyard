package program.menu.departmentMenu;

import program.department.GrindingDepartment;
import program.menu.AbstractMenu;

public class GrinderMenu extends AbstractMenu {
    GrindingDepartment grindingDepartment = new GrindingDepartment();

    public void grinderMenu(){
            System.out.println("1: Add Grinders: ");
            System.out.println("2: Check Grinders in your company: ");
            System.out.println("3: Remove Grinder by surname: ");
            System.out.println("4: Go back to MainMenu: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> grindingDepartment.setWorkerToDepartment();
                case 2 -> grindingDepartment.getWorkerFromDepartment();
                case 3 -> grindingDepartment.deleteWorkers();
                case 4 -> running = false;
        }
    }
}
