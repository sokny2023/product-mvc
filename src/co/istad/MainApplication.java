package co.istad;

import co.istad.controller.MenuController;
import co.istad.controller.ProductController;
import co.istad.util.Singleton;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.exit;

public class MainApplication {

    private final Scanner scanner;
    private final MenuController menuController;
    private final ProductController productController;

    public MainApplication(){
        scanner = Singleton.scanner();
        menuController = Singleton.menuController();
        productController = Singleton.productController();
    }

    private void run() throws IOException {
        do {
            menuController.index();
            System.out.print("Enter option: ");
            int option = Integer.parseInt(scanner.nextLine());
            switch (option){
                case 1 -> productController.index();
                case 2 -> productController.create();
                case 3 -> {
                    System.out.println("Update Product");

                }
                case 4 -> {
                    System.out.print("Input ID to delete: ");
                    Long foundId = Long.parseLong(scanner.nextLine());
                    productController.deleteById(foundId);
                    System.out.println("Delete Product ID: " + foundId + " Successfully");
                }
                case 5 -> exit(1);
                default -> throw new IllegalArgumentException();
            }
            char ch = (char) System.in.read();
        }while (true);
    }

    public static void main(String[] args) throws IOException {
        new MainApplication().run();
    }
}
