package com.engineering.restapi.projectlistbackend.Service;

import com.engineering.restapi.projectlistbackend.Entity.ProjectList;
import com.engineering.restapi.projectlistbackend.Repo.ProjectListRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class ProjectListService {

    @Autowired
    private ProjectListRepo repo;

    public List<ProjectList> getAllLists() {
        return this.repo.findAll();
    }

    public Optional<ProjectList> getListById(String id) {
        return repo.findById(id);
    }

    public void addList(ProjectList projectList) {
        repo.save(projectList);
    }

    public void updateList(String id, ProjectList topic) {
        repo.save(topic);

    }

    public void deleteList(String id) {
        repo.deleteById(id);
    }

}
