package com.Intern_Assignment.e_commerce.system.Part03_Placing_Orders;

public class ResourceNotFoundException_lineItem extends RuntimeException {


    public ResourceNotFoundException_lineItem(String id) {
        super("Could not found the lineItem with id "+ id);
    }
}
