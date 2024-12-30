package com.Intern_Assignment.e_commerce.system.Part03_Placing_Orders;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LineItemRepository extends JpaRepository<LineItem, Long> {
}
