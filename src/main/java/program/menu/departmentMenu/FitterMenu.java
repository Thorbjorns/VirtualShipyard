package program.menu.departmentMenu;

import program.department.FittingDepartment;
import program.menu.AbstractMenu;

public class FitterMenu extends AbstractMenu {
    FittingDepartment fittingDepartment = new FittingDepartment();
    public void fitterMenu(){
            System.out.println("1: Add Fitter: ");
            System.out.println("2: Check Fitters in your company: ");
            System.out.println("3: Remove Fitter by surname: ");
            System.out.println("4: Go back to MainMenu: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> fittingDepartment.setWorkerToDepartment();
                case 2 -> fittingDepartment.getWorkerFromDepartment();
                case 3 -> fittingDepartment.deleteWorkers();
                case 4 -> running = false;
        }
    }
}
