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
public class SaleItem {
    private BigDecimal quantityPurchased;
    private BigDecimal salePrice;
    private Product product;

    public BigDecimal getQuantityPurchased() {
        return quantityPurchased;
    }

    public void setQuantityPurchased(BigDecimal quantityPurchased) {
        this.quantityPurchased = quantityPurchased;
    }

    public BigDecimal getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(BigDecimal salePrice) {
        this.salePrice = salePrice;
    }
    
    public BigDecimal getItemTotal(){
        return quantityPurchased.multiply(salePrice);
    }
}
