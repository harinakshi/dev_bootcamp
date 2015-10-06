package com.electron.models;

public class Inventory {
    private IItemRepository repository;

    public Inventory(IItemRepository repository) {
        this.repository = repository;
    }

    public boolean addItem(Item item) {
        return repository.addItem(item);
    }
}
