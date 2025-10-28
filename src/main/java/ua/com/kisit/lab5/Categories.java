package ua.com.kisit.lab5;

import lombok.*;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class Categories {

    private Long id;
    private String name;
    private String description;
    private String images;

    @Override
    public String toString() {
        return "Categories{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", images='" + images + '\'' +
                '}';
    }

    private List<Products> products;

}


//
//    public Categories() {
//    }
//
//    public Categories(Long id, String name, String description, String images) {
//        this.id = id;
//        this.name = name;
//        this.description = description;
//        this.images = images;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
//
//    public String getImages() {
//        return images;
//    }
//
//    public void setImages(String images) {
//        this.images = images;
//    }
//
//    @Override
//    public String toString() {
//        return "Categories{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", description='" + description + '\'' +
//                ", images='" + images + '\'' +
//                '}';
//    }
// }
