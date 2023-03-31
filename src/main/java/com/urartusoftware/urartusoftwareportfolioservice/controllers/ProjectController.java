package com.urartusoftware.urartusoftwareportfolioservice.controllers;

import com.urartusoftware.urartusoftwareportfolioservice.models.ProjectDTO;
import com.urartusoftware.urartusoftwareportfolioservice.services.CloudinaryService;
import com.urartusoftware.urartusoftwareportfolioservice.services.ProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/project")
public class ProjectController {

    ProjectService ps;
    CloudinaryService cs;

    @Autowired
    public ProjectController(ProjectService ps, CloudinaryService cs) {
        this.ps = ps;
        this.cs = cs;
    }

    @PostMapping
    public ProjectDTO createProject(@RequestBody ProjectDTO pDTO) {
        return this.ps.createProject(pDTO);
    }

    @GetMapping("/project-photos")
    public List<String> getAllProjectPhotosUrls() {
        return this.cs.getProjectScreenshotUrls();
    }
}
