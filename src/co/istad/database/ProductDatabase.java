package co.istad.database;

import co.istad.model.Product;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ProductDatabase {
    private final List<Product> products;

    public ProductDatabase(){
        products = new ArrayList<>();
        products.add(new Product(1L,"Coca",50,2500.0, LocalDate.now()));
        products.add(new Product(2L,"Anchor",150,2500.0, LocalDate.now()));
        products.add(new Product(3L,"ABC",20,4000.0, LocalDate.now()));
        products.add(new Product(4L,"Krud",50,2500.0, LocalDate.now()));
        products.add(new Product(5L,"Sting",100,2000.0, LocalDate.now()));
        products.add(new Product(6L,"Hanuman",100,2800.0, LocalDate.now()));

    }

    public List<Product> getProducts() {
        return products;
    }
}
