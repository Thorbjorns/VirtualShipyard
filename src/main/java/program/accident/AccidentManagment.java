package program.accident;

public class AccidentManagment extends Accident {
    private Accident accident = new Accident();

    public void addAccidentToFittingDepartment(){
        accidentToDepartment.put(FittingDepartment,accidentsF);
    }
    public void addAccidentToWeldingDepartment(){
        accidentToDepartment.put(WeldingDepartment,accidentsW);
    }
    public void addAccidentToGrindingDepartment(){
        accidentToDepartment.put(GrindingDepartment,accidentsG);
    }

    public void addAccidentToListFitters(){
        System.out.println("Add log to accidents of Fitting Department:");
        String log = scanner.next();
        accidentsF.add(log);
    }
    public void addAccidentToListWelders(){
        System.out.println("Add log to accidents of Welding Department:");
        String log = scanner.next();
        accidentsW.add(log);
    }
    public void addAccidentToListGrinders(){
        System.out.println("Add log to accidents of Grinding Department:");
        String log = scanner.next();
        accidentsG.add(log);
    }

    public void getAccidentsFromFitters(){
        System.out.println("List of accidents of Fitters Department: ");
        accidentsF.stream().forEach(System.out::println);
    }
    public void getAccidentsFromWelders(){
        System.out.println("List of accidents of Welders Department: ");
        accidentsW.stream().forEach(System.out::println);
    }
    public void getAccidentsFromGrinders(){
        System.out.println("List of accidents of Grinders Department: ");
        accidentsG.stream().forEach(System.out::println);
    }
}
