package view;

import controller.IController;

import java.util.Scanner;

/**
 * Created by Paul on 10/8/2016.
 */
public class ConsoleView {

    private final IController IController;
    private Scanner scanner;

    public ConsoleView(IController IController) {
        this.IController = IController;
        scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            printMenu();
            int option = getOption();
            if (option == 0) {
                return;
            }
            if (option == 1) {
                System.out.println(IController.getMovies());
            }
            if (option == 2) {
                System.out.println(IController.getClients());
            }
            if (option == 3) {
                addMovie();
            }
            if (option == 4) {
                addClient();
            }

            if (option == 5) {
                updateMovie();
            }
            if (option == 6) {
                updateClient();
            }
            if (option == 7) {
                deleteMovie();
            }
            if (option == 8) {
                deleteClient();
            }
            if (option == 9) {
                addRent();
            }
        }
    }

    private void addRent() {
        System.out.println("Id of movie that you want to rent");
        int movieId = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Id of client that you want to rent");
        int clientId = scanner.nextInt();
        scanner.nextLine();
        IController.addRent(clientId, movieId);
    }

    private void deleteClient() {
        System.out.println("Id of client that you want to delete");
        int id = scanner.nextInt();
        scanner.nextLine();
        IController.deleteClient(id);
    }

    private void deleteMovie() {
        System.out.println("Id of movie that you want to delete");
        int id = scanner.nextInt();
        scanner.nextLine();
        IController.deleteMovie(id);
    }

    private void updateClient() {
        System.out.println("Id of client that you want to modify");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Name:");
        String name = scanner.nextLine();
        System.out.println("Address:");
        String address = scanner.nextLine();
        IController.updateClient(id, name, address);
    }

    private void updateMovie() {
        System.out.println("Id of movie that you want to modify");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Director:");
        String director = scanner.nextLine();
        System.out.println("Type:");
        String type = scanner.nextLine();
        IController.updateMovie(id, director, type);
    }

    private void addMovie() {
        System.out.println("Director:");
        String director = scanner.nextLine();
        System.out.println("Type:");
        String type = scanner.nextLine();
        IController.addMovie(director, type);
    }

    private void addClient() {
        System.out.println("Name:");
        String name = scanner.nextLine();
        System.out.println("Address:");
        String address = scanner.nextLine();
        IController.addClient(name, address);
    }

    private void printMenu() {
        System.out.println("0) Exit");
        System.out.println("1) List movies");
        System.out.println("2) List clients");
        System.out.println("3) Add movies");
        System.out.println("4) Add clients");
        System.out.println("5) Update movies");
        System.out.println("6) Update clients");
        System.out.println("7) Delete movies");
        System.out.println("8) Delete clients");
        System.out.println("9) Rent movie");
    }

    private int getOption() {
        int number = scanner.nextInt();
        scanner.nextLine();
        return number;
    }

}
