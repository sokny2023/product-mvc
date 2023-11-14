package co.istad.view;


import co.istad.model.Product;

import java.lang.System.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import static java.lang.System.exit;
import static java.lang.System.out;

public class ProductView {
    public static void printProductList(List<Product> products){
       out.println("Product Lis:");
        products.forEach(product -> {
            out.println("ID   :  "+product.getId());
            out.println("Name :  "+product.getName());
            out.println("QTY  :  "+product.getQty());
            out.println("Price:  "+product.getPrice());
            out.println("Imported Date:  "+product.getImportedDate());
        });
    }

    public static void createProduct(List<Product> products){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Product Id : ");
        Long id = scanner.nextLong();
        System.out.print("Enter Product's Name : ");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.print("Enter Product's Price : ");
        Double price = scanner.nextDouble();
        System.out.print("Enter Product's Qty : ");
        Integer qty = scanner.nextInt();
        scanner.nextLine();
        LocalDate importedDate = LocalDate.now();
        Product product = new Product(id,name,qty,price,importedDate);
        products.add(product);
        out.println("Create product successfully...!");
    }

}
