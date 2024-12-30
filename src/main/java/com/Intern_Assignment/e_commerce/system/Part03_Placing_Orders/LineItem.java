package com.Intern_Assignment.e_commerce.system.Part03_Placing_Orders;


import com.Intern_Assignment.e_commerce.system.Part01_Item_Management.Item;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;

@Entity
public class LineItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long lineItemId;

    @ManyToOne
    private Order order;

    @ManyToOne
    private Item item;

    @NotNull
    private Integer quantity;

    private Double lineTotal;

    // Getters and setters


    public Long getLineItemId() {
        return lineItemId;
    }

    public void setLineItemId(Long lineItemId) {
        this.lineItemId = lineItemId;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getLineTotal() {
        return lineTotal;
    }

    public void setLineTotal(Double lineTotal) {
        this.lineTotal = lineTotal;
    }
}
