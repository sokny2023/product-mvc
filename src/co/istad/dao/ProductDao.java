package co.istad.dao;

import co.istad.dto.UpdateProductDto;
import co.istad.model.Product;

import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

public interface ProductDao {

    // CRUD : Create, Read, Update, Delete
    Product insert(Product product);
    List<Product> select();
    Optional<Product> selectById(Long id);
    Product updateById(Product product);
    Product deleteById(Long id);
    List<Product> selectName(String name);

}