package com.urartusoftware.urartusoftwareportfolioservice.services;

import com.cloudinary.Cloudinary;
import com.cloudinary.api.ApiResponse;
import com.cloudinary.utils.ObjectUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CloudinaryService {

    public List<String> getProjectScreenshotUrls() {
        List<String> urlList = new ArrayList<>();

        // Initializing Cloudinary client
        Cloudinary cloudinary = new Cloudinary();

        // Setting folder as a prefix
        String prefix = "project-screenshots/";

        try {
            // Getting all images in folder
            ApiResponse response = cloudinary.api().resources(ObjectUtils.asMap());

            // Extracting image URLs from response
            List<ApiResponse> resources = (List<ApiResponse>) response.get("resources");
            for (ApiResponse resource : resources) {
                String url = (String) resource.get("url");
                urlList.add(url);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return urlList;
    }
}
