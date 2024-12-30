package com.Intern_Assignment.e_commerce.system.Part02_Discount_Management;

public class ResourceNotFoundException_discount extends RuntimeException {

    public ResourceNotFoundException_discount(String id) {
        super("Could not found the discount with id "+ id);
    }
}
