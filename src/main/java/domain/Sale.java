/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Collection;

/**
 *
 * @author hongyuhuang
 */
public class Sale {
    private int saleId;
    private LocalDateTime date; 
    private String status;
    private Customer customer;
    private Collection<SaleItem> saleItems;

    public int getSaleId() {
        return saleId;
    }

    public void setSaleId(int saleId) {
        this.saleId = saleId;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public BigDecimal getTotal(){
        BigDecimal total = BigDecimal.valueOf(0);
        for(SaleItem s : saleItems){
            total = total.add(s.getItemTotal());
        }
        return total;
    }
    
    public void addItem(SaleItem saleItem){
        saleItems.add(saleItem);
    }
}
