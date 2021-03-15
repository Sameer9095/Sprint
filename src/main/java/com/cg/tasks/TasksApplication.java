package com.cg.tasks;

import org.springframework.boot.SpringApplication;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cg.tasks.customerms.ui.*;
import com.cg.tasks.items.ui.*;

@SpringBootApplication
public class TasksApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(TasksApplication.class, args);

		CustomerUI customerUI = context.getBean(CustomerUI.class);
		customerUI.start();

		ItemUI itemUI = context.getBean(ItemUI.class);
		itemUI.start();

	}

}