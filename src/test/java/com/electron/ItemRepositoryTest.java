package com.electron;

import com.electron.models.Item;
import com.electron.repository.ItemRepository;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ItemRepositoryTest {

    @Test
    public void shouldBeAbleToAddAnItem(){
        ItemRepository itemRepository = new ItemRepository();
        assertTrue(itemRepository.addItem(new Item(78,"Samsung Galaxy",890)));
    }

    @Test
    public void shouldNotBeAbleToAddANULLItem(){
        ItemRepository itemRepository = new ItemRepository();
        assertFalse(itemRepository.addItem(null));
    }

    @Test
    public void shouldBeAbleToGetAllItems(){
        ItemRepository itemRepository = new ItemRepository();
        itemRepository.addItem(new Item(78,"Samsung Galaxy",890));
        itemRepository.addItem(new Item(67,"Television",900));
        assertEquals(2, itemRepository.getAll().size());
    }




}
