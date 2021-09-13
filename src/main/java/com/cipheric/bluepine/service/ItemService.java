package com.cipheric.bluepine.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cipheric.bluepine.entity.Item;

@Service
public interface ItemService {
	public void addItem(Item item);
	public Item getItem(String id);
	public List<Item> getAllItems();
}
