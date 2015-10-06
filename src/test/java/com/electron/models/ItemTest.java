package com.electron.models;

import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {

    @Test
    public void shouldBeAbleToCreateAnItemWithID_NAME_PRICE(){
        Item newItem = new Item(45,"iPhone5s",890);
        assertEquals(45,newItem.getID());
        assertEquals("iPhone5s",newItem.getName());
        assertEquals(890,newItem.getPrice());

    }




}