package program.department;

import program.worker.Fitter;
import program.worker.Worker;

import java.util.LinkedList;
import java.util.List;

public class FittingDepartment extends Department {
    private List<Fitter> fittingDepartment = new LinkedList<>();
    private Fitter fitter = new Fitter();


    public void setWorkerToDepartment() {
        System.out.println("Insert a name of your Fitter: ");
        String name = input.next();
        System.out.println("Insert a surname of your Fitter: ");
        String surname = input.next();
        System.out.println("Insert an age of your Fitter: ");
        int age = input.nextInt();
        Fitter fitter = new Fitter(name,surname,age);
        fittingDepartment.add(fitter);
    }

    public void getWorkerFromDepartment(){
       fittingDepartment.stream().forEach(System.out::println);
    }

    public void deleteWorkers(){
        fittingDepartment.removeAll(fittingDepartment);
    }
}
