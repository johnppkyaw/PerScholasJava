package com.perScholas.TutorialStore.model;
import jakarta.persistence.*;
@Entity
//indicates that the class is a persistent Java class. @Entity is used to mark that this POJO is used as an entity in the database.
@Table(name = "tutorials")
//annotation provides the table that maps this entity.
public class Tutorial {
    @Id
    //primary key
    @GeneratedValue(strategy = GenerationType.AUTO)
    //annotation is used to define the generation strategy for the primary key. GenerationType.AUTO means Auto Increment field.
    private long id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "published")
    private boolean published;

    public Tutorial() {

    }

    public Tutorial(String title, String description, boolean published)   {
        this.title = title;
        this.description = description;
        this.published = published;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isPublished() {
        return published;
    }

    public void setPublished(boolean isPublished) {
        this.published = isPublished;
    }

    @Override
    public String toString() {
        return "Tutorial [id=" + id + ", title=" + title + ", desc=" + description + ", published=" + published + "]";
    }
}

