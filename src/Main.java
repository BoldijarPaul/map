import controller.Controller;
import controller.IController;
import repository.ClientRepository;
import repository.MovieRepository;
import repository.RentRepository;
import view.ConsoleView;

/**
 * Created by Paul on 10/8/2016.
 */
public class Main {

    public static void main(String[] args) {
        ClientRepository clientRepository = new ClientRepository();
        MovieRepository movieRepository = new MovieRepository();
        RentRepository rentRepository = new RentRepository();
        IController IController = new Controller(clientRepository, movieRepository, rentRepository);
        ConsoleView consoleView = new ConsoleView(IController);
        consoleView.start();
    }
}
