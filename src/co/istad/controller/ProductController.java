package co.istad.controller;

import co.istad.dto.UpdateProductDto;
import co.istad.model.Product;
import co.istad.service.ProductService;
import co.istad.service.ProductServiceImpl;
import co.istad.view.ProductView;


import java.util.Collections;
import java.util.List;

public class ProductController {

    private ProductService productService;
    public ProductController(){
        productService = new ProductServiceImpl();
    }
    public void index(){
        List<Product> products = productService.select();
        ProductView.printProductList(products);
    }

    public void create(){
        List<Product> products = productService.select();
        ProductView.createProduct(products);
    }

    public void deleteById(Long id) {
        productService.deleteById(id);
    }

    public void updateProduct(String id, UpdateProductDto updateProductDto) {
        productService.updateById(id, updateProductDto);
    }
}
