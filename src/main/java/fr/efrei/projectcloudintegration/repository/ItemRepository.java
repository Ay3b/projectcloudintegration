package fr.efrei.projectcloudintegration.repository;

import fr.efrei.projectcloudintegration.domain.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Repository
public interface ItemRepository extends JpaRepository<Item,Integer> {

}
