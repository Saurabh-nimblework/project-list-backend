package com.engineering.restapi.projectlistbackend.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "projectLists")
public class ProjectList {
    @Id
    private String id;
    private String name;
    private String owner;
    private String priority;

    public ProjectList() {

    }

    public ProjectList(String id, String name, String owner, String priority) {
        super();
        this.id = id;
        this.name = name;
        this.owner = owner;
        this.priority = priority;
    }

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

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }


}


