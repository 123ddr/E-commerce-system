package com.Intern_Assignment.e_commerce.system.Part03_Placing_Orders;


import com.Intern_Assignment.e_commerce.system.Part01_Item_Management.Item;
import com.Intern_Assignment.e_commerce.system.Part01_Item_Management.ItemRepository;
import com.Intern_Assignment.e_commerce.system.Part02_Discount_Management.Discount;
import com.Intern_Assignment.e_commerce.system.Part02_Discount_Management.DiscountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class OrderService {


    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private LineItemRepository lineItemRepository;

    @Autowired
    private ItemRepository itemRepository;

    @Autowired
    private DiscountService discountService;

    public Order placeOrder(Order order, java.util.List<Long> itemIds, List<Integer> quantities, String discountCode) {
        double totalAmount = 0;
        if (discountCode != null) {
            Discount discount = discountService.getDiscountByCode(discountCode);
            if (new Date().before(discount.getValidUntil())) {
                order.setDiscountCode(discountCode);
            }
        }

        for (int i = 0; i < itemIds.size(); i++) {
            Item item = itemRepository.findById(itemIds.get(i)).orElseThrow(() -> new ResourceNotFoundException_lineItem("Item not found"));
            double lineTotal = item.getUnitPrice() * quantities.get(i);
            totalAmount += lineTotal;

            LineItem lineItem = new LineItem();
            lineItem.setOrder(order);
            lineItem.setItem(item);
            lineItem.setQuantity(quantities.get(i));
            lineItem.setLineTotal(lineTotal);
            lineItemRepository.save(lineItem);
        }

        order.setTotalAmount(totalAmount);
        return orderRepository.save(order);
    }
}
