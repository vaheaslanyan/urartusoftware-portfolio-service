package com.urartusoftware.urartusoftwareportfolioservice.models;

public class ProjectDTO {
    private String id;
    private String name;
    private String description;

    // Constructors
    public ProjectDTO(){}

    public ProjectDTO(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public ProjectDTO(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public ProjectDTO(Project p) {
        this.id = p.getId();
        this.name = p.getName();
        this.description = p.getDescription();
    }

    // toString
    @Override
    public String toString() {
        return "Project{" +
                "id='" + id + '\'' +
                "name='" + name + '\'' +
                "description'" + description + '\'' +
                '}';
    }

    // equals & hashcode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProjectDTO that = (ProjectDTO) o;
        return id.equals(that.getId());
    }

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
}
