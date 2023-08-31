package com.engineering.restapi.projectlistbackend.Repo;

import com.engineering.restapi.projectlistbackend.Entity.ProjectList;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectListRepo extends MongoRepository<ProjectList,String> {

}
