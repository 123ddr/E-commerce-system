package com.Intern_Assignment.e_commerce.system.Part01_Item_Management;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class ResourceNotFoundAdvice_item {

    @ResponseBody
    @ExceptionHandler(ResourceNotFoundException_item.class)
    @ResponseStatus

    public Map<String,String> exceptionHandler(ResourceNotFoundException_item exception){

        Map<String,String> errorMap=new HashMap<>();
        errorMap.put("errorMessage",exception.getMessage());

        return errorMap;

    }
}
