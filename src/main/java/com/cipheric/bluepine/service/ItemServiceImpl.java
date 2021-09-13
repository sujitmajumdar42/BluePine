package com.cipheric.bluepine.service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cipheric.bluepine.entity.Item;
import com.cipheric.bluepine.repo.ItemRepository;

@Component
public class ItemServiceImpl implements ItemService {
	
	@Autowired
	private ItemRepository itemRepo;
	
	@Override
	public void addItem(Item item) {
		itemRepo.save(item);
		System.out.println("Item added."+item.toString());
	}

	@Override
	public Item getItem(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Item> getAllItems() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static void main(String[] args) {
		System.out.println(new SimpleDateFormat("yyyy-MM-dd HH.mm.ss.SS").format(new Date()));
	}

}
