package fr.efrei.ProjectCloudIntegration.domain;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class item {
    @Id
    private Integer id;
    private String name;
    private Double price;

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
