package com.urartusoftware.urartusoftwareportfolioservice.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
public class Project {

    @Id
    private String id;
    private String name;
    private String description;
    private List<String> imageUrls;

    // NEED to add tech tags

    // Constructors
    public Project() {}

    public Project(String name, String description, List<String> imageUrls) {
        this.name = name;
        this.description = description;
        this.imageUrls = imageUrls;
    }

    public Project(ProjectDTO pDTO) {
        this.name = pDTO.getName();
        this.description = pDTO.getDescription();
        this.imageUrls = pDTO.getImageUrls();
    }

    // toString
    @Override
    public String toString() {
        return "Project{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", imageUrls='" + imageUrls + '\'' +
                '}';
    }

    // equals & hashchode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Project that = (Project) o;

        return id.equals(that.getId());
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }

    // Getters & Setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getImageUrls() {
        return imageUrls;
    }

    public void setImageUrls(List<String> imageUrls) {
        this.imageUrls = imageUrls;
    }
}
