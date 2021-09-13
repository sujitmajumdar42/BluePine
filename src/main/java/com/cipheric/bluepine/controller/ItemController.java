package com.cipheric.bluepine.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cipheric.bluepine.entity.Item;
import com.cipheric.bluepine.service.ItemService;
import com.cipheric.bluepine.utility.ApplicationUtil;

@RestController
@RequestMapping("/api/item")
public class ItemController {
	
	@Autowired
	private ItemService itemService;
	
	@PostMapping(path = "/")
	public boolean addItem(@RequestBody Item item) {
		item.setLastModified(ApplicationUtil.getCurrentTime());
		itemService.addItem(item);
		return true;
	}
	
	@GetMapping(path = "/")
	public String getItem() {
		return "Sample";
	}
}
