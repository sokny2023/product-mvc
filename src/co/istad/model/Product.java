package co.istad.model;

import java.time.LocalDate;

public class Product {
    private Long id;
    private String name;
    private Integer qty;
    private Double price;
    private LocalDate importedDate;

    Product(){};
    public Product(Long id, String name, Integer qty, Double price, LocalDate importedDate) {
        this.id = id;
        this.name = name;
        this.qty = qty;
        this.price = price;
        this.importedDate = importedDate;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getQty() {
        return qty;
    }

    public Double getPrice() {
        return price;
    }

    public LocalDate getImportedDate() {
        return importedDate;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public void setImportedDate(LocalDate importedDate) {
        this.importedDate = importedDate;
    }
}
