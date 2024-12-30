package com.Intern_Assignment.e_commerce.system.Part02_Discount_Management;


import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DiscountService {

    @Autowired
    private DiscountRepository discountRepository;

    public Discount getDiscountByCode(String code) {
        return discountRepository.findByCode(code).orElseThrow(() -> new ResourceNotFoundException_discount("Discount not found"));
    }

    public Discount createDiscount(@Valid Discount discount) {

        return discountRepository.save(discount);
    }
}
