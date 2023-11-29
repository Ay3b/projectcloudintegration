package fr.efrei.projectcloudintegration.web.rest;

import fr.efrei.projectcloudintegration.domain.Item;
import fr.efrei.projectcloudintegration.repository.ItemRepository;
import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
@SpringBootTest
@TestPropertySource(
        locations= "classpath:application-test.properties"
)
public class ItemResourceIT {
    @Autowired
    private ItemRepository itemRepository;

    @Test
    @Transactional
    void createItem() throws Exception {
        int databaseSizeBeforeCreate = itemRepository.findAll().size();
        assertThat(databaseSizeBeforeCreate).isEqualTo(0);

        Item item = new Item();
        //item.setId(6);
        item.setName("Pierre");
        item.setPrice(12.00);
        itemRepository.save(item);

        List<Item> itemList = itemRepository.findAll();
        assertThat(itemList).hasSize(databaseSizeBeforeCreate +1);
    }
}
