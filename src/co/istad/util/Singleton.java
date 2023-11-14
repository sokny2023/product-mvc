package co.istad.util;

import co.istad.controller.MenuController;
import co.istad.controller.ProductController;
import co.istad.dao.ProductDaoImpl;
import co.istad.service.ProductServiceImpl;

import java.util.Scanner;

public class Singleton {
    // 1. create static reference type
    private static  Scanner scanner;
    private static MenuController menuController;
    private static ProductController productController;
    private static ProductServiceImpl productServiceImpl;

    // 2. static block
    public static Scanner scanner(){
        if(scanner == null){
            scanner = new Scanner(System.in);
        }
        return scanner;
    }

    public static MenuController menuController(){
        if(menuController == null){
            menuController = new MenuController();
        }
        return menuController;
    }

    public static ProductController productController(){
        if(productController == null){
            productController = new ProductController();
        }
        return productController;
    }

    public static ProductServiceImpl getProductServiceImpl() {
        if(productServiceImpl == null){
            productServiceImpl = new ProductServiceImpl();
        }
        return productServiceImpl;
    }
}
