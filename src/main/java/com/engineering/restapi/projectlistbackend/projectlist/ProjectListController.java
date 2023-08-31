package com.engineering.restapi.projectlistbackend.projectlist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProjectListController {

    @Autowired
    ProjectListService projectListService;

    @RequestMapping("/list")
    public List<ProjectList> getAllTopics() {
        return projectListService.getAllTopics();
    }

    @RequestMapping("/list/{ID}")
    public ProjectList getTopicById(@PathVariable("ID") String id) {
        return projectListService.getTopicById(id);
    }

    @RequestMapping(method= RequestMethod.POST, value="/list")
    public void addTopic(@RequestBody ProjectList projectList) {
        projectListService.addTopic(projectList);
    }

    @RequestMapping(method=RequestMethod.PUT, value="/list/{id}")
    public void updateTopic(@RequestBody ProjectList projectList,@PathVariable String id) {
        projectListService.updateTopic(id,projectList);
    }

    @RequestMapping(method=RequestMethod.DELETE, value="/list/{id}")
    public void deleteTopic(@PathVariable String id) {
        projectListService.deleteTopic(id);
    }

}
