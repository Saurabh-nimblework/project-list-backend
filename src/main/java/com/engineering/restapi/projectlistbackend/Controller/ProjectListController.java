package com.engineering.restapi.projectlistbackend.Controller;

import com.engineering.restapi.projectlistbackend.Entity.ProjectList;
import com.engineering.restapi.projectlistbackend.Service.ProjectListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
public class ProjectListController {

    @Autowired
    ProjectListService projectListService;

    @RequestMapping("/list")
    public List<ProjectList> getAllLists() {
        return projectListService.getAllLists();
    }

    @RequestMapping("/list/{ID}")
    public Optional<ProjectList> getListById(@PathVariable("ID") String id) {
        return projectListService.getListById(id);
    }

    @RequestMapping(method= RequestMethod.POST, value="/list")
    public void addList(@RequestBody ProjectList projectList) {
        projectListService.addList(projectList);
    }

    @RequestMapping(method=RequestMethod.PUT, value="/list/{id}")
    public void updateList(@RequestBody ProjectList projectList,@PathVariable String id) {
        projectListService.updateList(id,projectList);
    }

    @RequestMapping(method=RequestMethod.DELETE, value="/list/{id}")
    public void deleteList(@PathVariable String id) {
        projectListService.deleteList(id);
    }

}
