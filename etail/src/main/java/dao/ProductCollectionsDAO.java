/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import domain.Product;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 *
 * @author hongyuhuang
 */
public class ProductCollectionsDAO {
    
    private static Collection<Product> products = new HashSet<>();
    private static Collection<String> categories = new HashSet<>();
    private static Map<String, Product> productIds = new HashMap<>();

    
    public void saveProduct(Product p){
        products.add(p);
        categories.add(p.getCategory());
        productIds.put(p.getProductId(), p);
    }
    
    public Collection<Product> getProducts(){
        return products;
    }
    
    public Collection<String> getCategories(){
        return categories;
    }
    
    public void removeProducts(Product p){
        products.remove(p);
        categories.remove(p.getCategory());
        productIds.remove(p.getProductId(), p);
    }
    
    public Product searchById (String productId){
        if(!productIds.containsKey(productId)){
            return null;
        }
        return productIds.get(productId);
    }
        
}
