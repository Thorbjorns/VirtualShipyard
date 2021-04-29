package program.menu;

import program.menu.departmentMenu.FitterMenu;
import program.menu.departmentMenu.GrinderMenu;
import program.menu.departmentMenu.WelderMenu;

public class WorkerManager extends AbstractMenu {
    FitterMenu fitterMenu = new FitterMenu();
    GrinderMenu grinderMenu = new GrinderMenu();
    WelderMenu welderMenu = new WelderMenu();
    public void managmentMenu(){
        System.out.println("Choose a department to operate: FITTER(F)/GRINDER(G)/WELDER(W) " +
                    "or another letter to quit this menu: ");
            String choice = scanner.next();

            switch (choice) {
                case "F" -> fitterMenu.fitterMenu();
                case "G" -> grinderMenu.grinderMenu();
                case "W" -> welderMenu.welderMenu();
            }
    }
}
