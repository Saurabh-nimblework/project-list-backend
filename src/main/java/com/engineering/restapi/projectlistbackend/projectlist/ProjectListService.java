package com.engineering.restapi.projectlistbackend.projectlist;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProjectListService {
    private List<ProjectList> projectLists= new ArrayList<ProjectList>(Arrays.asList(
            new ProjectList("PRJ1","Nimble Cafe","SN","Critical"),
            new ProjectList("PRJ2","Nimble Retro","AK","High")
    ));

    public List<ProjectList> getAllTopics() {
        return projectLists;
    }

    public ProjectList getTopicById(String id) {
        return projectLists.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public void addTopic(ProjectList projectList) {
        projectLists.add(projectList);
    }

    public void updateTopic(String id, ProjectList topic) {
        for(int i=0;i<projectLists.size();i++) {
            ProjectList t = projectLists.get(i);
            if(t.getId().equals(id)) {
                projectLists.set(i,topic);
                return;
            }
        }
    }

    public void deleteTopic(String id) {
        projectLists.removeIf(t -> t.getId().equals(id));
    }

}
