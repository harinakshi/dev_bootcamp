package com.electron.models;

import com.electron.repository.ItemRepository;
import org.junit.Test;

import static org.junit.Assert.*;

class MockItemRepository implements IItemRepository
{
    @Override
    public boolean addItem(Item item) {
        return true;
    }
}

public class InventoryTest {
    @Test
    public void shouldBeAbleToCreateInventoryWithValidRepository() {
        Inventory inventory = new Inventory(new MockItemRepository());
        assertTrue(inventory.addItem(new Item(10,"abcd",100)));
    }
}