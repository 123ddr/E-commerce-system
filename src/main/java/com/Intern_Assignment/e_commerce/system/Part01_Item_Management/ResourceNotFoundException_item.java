package com.Intern_Assignment.e_commerce.system.Part01_Item_Management;

public class ResourceNotFoundException_item extends RuntimeException {

  public ResourceNotFoundException_item(String id) {
    super("Could not found the item with id "+ id);
  }


}
