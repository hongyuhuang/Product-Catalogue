/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;
 
import java.math.*;
 
/**
 *
 * @author hongyuhuang
 */
public class Product {
    private String productId;
    private String name;
    private String description;
    private String category;
    private BigDecimal listPrice;
    private BigDecimal quantityInStock;
 
    public String getProductId() {
        return productId;
    }
 
    public void setProductId(String productId) {
        this.productId = productId;
    }
 
    public String getName() {
        return name;
    }
 
    public void setName(String name) {
        this.name = name;
    }
 
    public String getDescription() {
        return description;
    }
 
    public void setDescription(String description) {
        this.description = description;
    }
 
    public String getCategory() {
        return category;
    }
 
    public void setCategory(String category) {
        this.category = category;
    }
 
    public BigDecimal getListPrice() {
        return listPrice;
    }
 
    public void setListPrice(BigDecimal listPrice) {
        this.listPrice = listPrice;
    }
 
    public BigDecimal getQuantityInStock() {
        return quantityInStock;
    }
 
    public void setQuantityInStock(BigDecimal quantityInStock) {
        this.quantityInStock = quantityInStock;
    }
 
    @Override
    public String toString() {
        return productId + ", " + name;
    }
}
