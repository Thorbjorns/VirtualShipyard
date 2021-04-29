package program.menu.departmentMenu;

import program.department.WeldingDepartment;
import program.menu.AbstractMenu;

public class WelderMenu extends AbstractMenu {
    WeldingDepartment weldingDepartment = new WeldingDepartment();

    public void welderMenu() {
            System.out.println("1: Add Welder: ");
            System.out.println("2: Check Welders in your company: ");
            System.out.println("3: Remove Welders by surname: ");
            System.out.println("4: Go back to MainMenu: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> weldingDepartment.setWorkerToDepartment();
                case 2 -> weldingDepartment.getWorkerFromDepartment();
                case 3 -> weldingDepartment.deleteWorkers();
                case 4 -> running = false;
        }
    }
}