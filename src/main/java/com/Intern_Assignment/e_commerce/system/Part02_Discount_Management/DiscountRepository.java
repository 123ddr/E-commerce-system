package com.Intern_Assignment.e_commerce.system.Part02_Discount_Management;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface DiscountRepository extends JpaRepository<Discount, Long> {

    Optional<Discount> findByCode(String code);
}
