package program.accident;

import java.util.*;

public class Accident {
    Scanner scanner = new Scanner(System.in);
    protected Map<String,List<String>> accidentToDepartment = new HashMap<>();

    public Accident() {
    }

    protected List<String> accidentsF = new ArrayList<>();
    protected List<String> accidentsW = new ArrayList<>();
    protected List<String> accidentsG = new ArrayList<>();

    protected String FittingDepartment = "Fitters";
    protected String WeldingDepartment = "Welders";
    protected String GrindingDepartment = "Grinders";



}
