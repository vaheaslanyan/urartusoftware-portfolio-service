package com.urartusoftware.urartusoftwareportfolioservice.repositories;

import com.urartusoftware.urartusoftwareportfolioservice.models.Project;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends MongoRepository<Project, String> {
}
