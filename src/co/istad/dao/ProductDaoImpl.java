package co.istad.dao;

import co.istad.database.ProductDatabase;
import co.istad.exception.ProductNotFoundException;
import co.istad.model.Product;

import java.util.List;
import java.util.Optional;

public class ProductDaoImpl implements ProductDao{

    private final ProductDatabase productDb;

    public ProductDaoImpl(){
        productDb = new ProductDatabase();
    }

    @Override
    public Product insert(Product product) {
        productDb.getProducts().add(product);
        return product;
    }

    @Override
    public List<Product> select() {
        return productDb.getProducts();
    }

    @Override
    public Optional<Product> selectById(Long id) {
        return productDb.getProducts().stream()
                .filter(product -> product.getId().equals(id))
                .findFirst();
    }

    @Override
    public Product updateById(Product product) {
        return productDb.getProducts().stream()
                .filter(pro -> pro.getId().equals(product.getId()))
                .map(newPro -> product)
                .findFirst()
                .orElseThrow(()
                        -> new ProductNotFoundException(
                                String.format("Product ID = %s doesn't exist in DB...!",product.getId())
                ));
    }

    @Override
    public Product deleteById(Long id) {
        Product foundProduct = productDb.getProducts().stream()
                .filter(pro -> pro.getId().equals(id))
                .findFirst()
                .orElseThrow(()
                        -> new ProductNotFoundException(
                        String.format("Product ID = %s doesn't exist in DB...!",id)
                ));
        productDb.getProducts().remove(foundProduct);
        return foundProduct;
    }

    @Override
    public List<Product> selectName(String name) {
        return productDb.getProducts().stream()
                .filter(product -> product.getName().toLowerCase().contains(name.toLowerCase()))
                .toList();
    }
}
