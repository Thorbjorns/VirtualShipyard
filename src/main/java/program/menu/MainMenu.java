package program.menu;

public class MainMenu extends AbstractMenu {
    WorkerManager workerManager = new WorkerManager();

    public void startMenu(){
        while (running){


            int choice = scanner.nextInt();
            switch (choice){
                case 1 -> workerManager.managmentMenu();
            }
        }
    }

}
