package com.urartusoftware.urartusoftwareportfolioservice.services;

import com.urartusoftware.urartusoftwareportfolioservice.models.Project;
import com.urartusoftware.urartusoftwareportfolioservice.models.ProjectDTO;
import com.urartusoftware.urartusoftwareportfolioservice.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectService {

    ProjectRepository pr;

    @Autowired
    public ProjectService(ProjectRepository pr) {
        this.pr = pr;
    }

    public ProjectDTO createProject(ProjectDTO pDTO) {
        Project newProject = new Project(pDTO);
        Project savedProject = this.pr.save(newProject);
        return new ProjectDTO(savedProject);
    }
}
