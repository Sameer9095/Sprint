package com.cg.tasks.items.dao;

import com.cg.tasks.items.entities.*;

public interface IItemDAO {

	Item add(Item item);

	Item update(Item item);

	Item findById(String itemId);

}