package com.melvin.inventory.entity;

import javax.persistence.*;

@Entity
@Table(name = "delivery")
public class DeliveryEntity {

    @Id
    @GeneratedValue
    private long sno;
    private String item;
    @Column(name = "quantity")
    private int quantity_d;
    private String address;

    public long getSno() {
        return sno;
    }

    public void setSno(long sno) {
        this.sno = sno;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getQuantity() {
        return quantity_d;
    }

    public void setQuantity(int quantity) {
        this.quantity_d = quantity;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public DeliveryEntity() {
    }

    public DeliveryEntity(String item, int quantity_d, String address) {
        this.item = item;
        this.quantity_d = quantity_d;
        this.address = address;
    }
}
