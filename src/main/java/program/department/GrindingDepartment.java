package program.department;

import program.worker.Grinder;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;

public class GrindingDepartment extends Department {
    private List<Grinder> grindingDepartment = new LinkedList<>();
    private Grinder grinder = new Grinder();

    public void setWorkerToDepartment()  {

            System.out.println("Insert a name of your Grinder: ");
            String name = String.valueOf(input.nextLine());
            System.out.println("Insert a surname of your Grinder: ");
            String surname = String.valueOf(input.nextLine());
            System.out.println("Insert an age of your Grinder: ");
            int age = Integer.valueOf(input.nextInt());
            Grinder grinder = new Grinder(name, surname, age);
            grindingDepartment.add(grinder);

    }


    public void getWorkerFromDepartment(){
        grindingDepartment.stream().forEach(System.out::println);
    }

    public void deleteWorkers(){
       grindingDepartment.removeAll(grindingDepartment);
    }
}
