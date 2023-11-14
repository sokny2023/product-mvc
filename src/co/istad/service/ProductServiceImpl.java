package co.istad.service;

import co.istad.dao.ProductDao;
import co.istad.dao.ProductDaoImpl;
import co.istad.dto.UpdateProductDto;
import co.istad.exception.ProductNotFoundException;
import co.istad.model.Product;

import java.util.List;
import java.util.Optional;

public class ProductServiceImpl implements ProductService {

    private final ProductDao productDao;
    public ProductServiceImpl(){
        productDao = new ProductDaoImpl();
    }

    @Override
    public Product insert(Product product) {
        return productDao.insert(product);
    }

    @Override
    public List<Product> select() {
        return productDao.select();
    }

    @Override
    public Product selectById(Long id) {
        return productDao.selectById(id)
                .orElseThrow(()
                        -> new ProductNotFoundException(
                        String.format("Product ID = %s doesn't exist in DB...!",id)
                ));
    }

    @Override
    public Product updateById(Product product) {
        return productDao.updateById(product);
    }

    @Override
    public Product deleteById(Long id) {
        return productDao.deleteById(id);
    }

    @Override
    public List<Product> selectName(String name) {
        return productDao.selectName(name);
    }
}
