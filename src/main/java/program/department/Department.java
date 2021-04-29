package program.department;

import java.util.Scanner;

public abstract class Department  {
    protected Scanner input = new Scanner(System.in);

    public abstract void setWorkerToDepartment();
    public abstract void getWorkerFromDepartment();
    public abstract void deleteWorkers();
    }



