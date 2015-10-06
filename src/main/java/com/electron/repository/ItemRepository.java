package com.electron.repository;

import com.electron.models.IItemRepository;
import com.electron.models.Item;

import java.util.ArrayList;
import java.util.List;

public class ItemRepository implements IItemRepository {

    private List<Item> items = new ArrayList<>();

    @Override
    public boolean addItem(Item item) {
        if(item == null) {
            return false;
        }
        return items.add(item);
    }

    public List<Item> getAll() {
        return items;
    }
}
