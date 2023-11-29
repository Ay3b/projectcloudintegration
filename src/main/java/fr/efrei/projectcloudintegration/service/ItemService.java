package fr.efrei.projectcloudintegration.service;

import fr.efrei.projectcloudintegration.domain.Item;
import fr.efrei.projectcloudintegration.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    @Autowired
    ItemRepository itemRepository;

    public ItemService(ItemRepository itemRepository){
        this.itemRepository = itemRepository;
    }

    public List<Item> findAll() {return itemRepository.findAll();}
}
