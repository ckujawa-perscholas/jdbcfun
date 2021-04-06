package com.perscholas.daoexample.model.dao;

import java.util.List;

import com.perscholas.daoexample.model.Item;

public interface IItemDAO {
	
	public static final String GET_ALL_ITEMS = "select * from items";
	public static final String ADD_ITEM = "insert into items values (?,?,?)";
	public static final String REMOVE_ITEM_BY_ID = "delete from items where id = ?";
	
	public List<Item> getAllItems();
	public void addItem(Item i);
	public void removeItemByID(int i);
}
