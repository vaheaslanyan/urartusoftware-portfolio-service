package com.urartusoftware.urartusoftwareportfolioservice.controllers;

import com.urartusoftware.urartusoftwareportfolioservice.models.ProjectDTO;
import com.urartusoftware.urartusoftwareportfolioservice.services.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/project")
public class ProjectController {

    ProjectService ps;

    @Autowired
    public ProjectController(ProjectService ps) {
        this.ps = ps;
    }

    @PostMapping
    public ProjectDTO createProject(@RequestBody ProjectDTO pDTO) {
        return this.ps.createProject(pDTO);
    }
}
