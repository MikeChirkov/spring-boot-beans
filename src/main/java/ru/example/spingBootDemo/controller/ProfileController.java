package ru.example.spingBootDemo.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.example.spingBootDemo.service.SystemProfile;

@RestController
@AllArgsConstructor
@RequestMapping("/")
public class ProfileController {

    private final SystemProfile profile;

    @GetMapping("profile")
    public String getProfile() {
        return profile.getProfile();
    }
}