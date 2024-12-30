package com.Intern_Assignment.e_commerce.system.Part03_Placing_Orders;


import com.Intern_Assignment.e_commerce.system.Part01_Item_Management.ResourceNotFoundException_item;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class ResourceNotFoundAdvice_lineItem {

    @ResponseBody
    @ExceptionHandler(ResourceNotFoundException_lineItem.class)
    @ResponseStatus

    public Map<String,String> exceptionHandler(ResourceNotFoundException_lineItem exception){

        Map<String,String> errorMap=new HashMap<>();
        errorMap.put("errorMessage",exception.getMessage());

        return errorMap;

    }
}
