package com.cg.tasks.items.service;

import com.cg.tasks.items.entities.*;

public interface IItemService {

	Item create(Double price, String description);

	Item findById(String itemID);

	Item buyItem(String itemId, Long customerId);

}