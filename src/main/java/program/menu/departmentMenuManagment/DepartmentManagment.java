package program.menu.departmentMenuManagment;

import program.department.FittingDepartment;
import program.department.GrindingDepartment;
import program.department.WeldingDepartment;

public class DepartmentManagment {
FittingDepartment fittingDepartment = new FittingDepartment();
GrindingDepartment grindingDepartment = new GrindingDepartment();
WeldingDepartment weldingDepartment = new WeldingDepartment();

public void showInfoFitting(){
    System.out.println("Department: Fitters");
    System.out.println("Informations about workers and accidents in this departments");
    fittingDepartment.getWorkerFromDepartment();
}
    public void showInfoGrinding(){
        System.out.println("Department: Fitters");
        System.out.println("Informations about workers and accidents in this departments");
        grindingDepartment.getWorkerFromDepartment();
    }
    public void showInfoWelding(){
        System.out.println("Department: Fitters");
        System.out.println("Informations about workers and accidents in this departments");
        weldingDepartment.getWorkerFromDepartment();
    }

    public void showInfoAll(){
        System.out.println("Departments: Fitters,Welders,Grinders");
        System.out.println("All informations: ");
        fittingDepartment.getWorkerFromDepartment();
        System.out.println();
        weldingDepartment.getWorkerFromDepartment();
        System.out.println();
        grindingDepartment.getWorkerFromDepartment();
    }
}
