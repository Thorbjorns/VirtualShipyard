package program.menu.departmentManagmentMenu;

import program.menu.AbstractMenu;
import program.menu.departmentMenuManagment.DepartmentManagment;

public class DepartmentManagmentMenu extends AbstractMenu {
    DepartmentManagment departmentManagment = new DepartmentManagment();

    public void departmentManagmentMenu(){
        System.out.println("1: Informations about Fitting Department: ");
        System.out.println("2: Informations about Grinding Department: ");
        System.out.println("3: Informations about Welding Department: ");
        System.out.println("4: Informations about all Departments: ");


        int choice = scanner.nextInt();
        switch (choice){
            case 1 -> departmentManagment.showInfoFitting();
            case 2 -> departmentManagment.showInfoGrinding();
            case 3 -> departmentManagment.showInfoWelding();
        }

    }

}
