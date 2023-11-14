package co.istad.service;

import co.istad.dto.UpdateProductDto;
import co.istad.model.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    // CRUD : Create, Read, Update, Delete
    Product insert(Product product);
    List<Product> select();
    Product selectById(Long id);
    Product updateById(Product product);
    Product deleteById(Long id);
    List<Product> selectName(String name);

    void updateById(String id, UpdateProductDto updateProductDto);
}
