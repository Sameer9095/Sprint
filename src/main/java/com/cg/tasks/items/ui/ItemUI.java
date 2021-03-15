package com.cg.tasks.items.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.cg.tasks.items.entities.*;
import com.cg.tasks.items.service.*;

@Component
public class ItemUI {

	@Autowired
	IItemService service;

	public void start() {

		Item item1 = service.create(120000.0, "Notebook");
		display(item1);

		Item item2 = service.create(250000.0, "Macbook");
		display(item2);

	}

	void display(Item item) {
		System.out.println("Item id is " + item.getId() + "\n Price if item is  " + item.getPrice()
				+ "\n Name of item is  " + item.getDescription());

	}

}