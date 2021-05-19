package com.melvin.inventory.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "invdetails")
public class InventoryEntity {

    @Id
    @GeneratedValue
    private long sno;
    private String item;
    private int quantity;
   // private int quantity_d;

//    public int getQuantity_d() {
//        return quantity_d;
//    }

//    public void setQuantity_d(int quantity_d) {
//        this.quantity_d = quantity_d;
//    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }



    public long getSno() {
        return sno;
    }

    public void setSno(long sno) {
        this.sno = sno;
    }
    public InventoryEntity() {
    }

//    public InventoryEntity(String item, int quantity) {
//        this.item = item;
//        this.quantity = quantity;
//    }


    public InventoryEntity(long sno, String item, int quantity) {
        this.sno = sno;
        this.item = item;
        this.quantity = quantity;
    }
}
