package program.department;

import program.worker.Welder;
import program.worker.Worker;

import java.util.LinkedList;
import java.util.List;

public class WeldingDepartment extends Department {
    private List<Welder> weldingDepartment = new LinkedList<>();
    private Welder welder = new Welder();



    public void setWorkerToDepartment() {
        System.out.println("Insert a name of your Welder: ");
        String name = input.next();
        System.out.println("Insert a surname of your Welder: ");
        String surname = input.next();
        System.out.println("Insert an age of your Welder: ");
        int age = input.nextInt();
        Welder welder = new Welder(name,surname,age);
        weldingDepartment.add(welder);
    }

    public void getWorkerFromDepartment(){
        weldingDepartment.stream().forEach(System.out::println);
    }


    public void deleteWorkers(){
       weldingDepartment.removeAll(weldingDepartment);
    }
}
