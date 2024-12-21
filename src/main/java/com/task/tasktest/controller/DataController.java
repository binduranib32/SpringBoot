package com.task.tasktest.controller;

import com.task.tasktest.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DataController {

    @Autowired
    private DataService dataService;

    @PostMapping("/save")
    public ResponseEntity<String> saveData(@RequestBody String data) {
        dataService.saveData(data);
        return ResponseEntity.ok("Data saved successfully in all databases.");
    }
}
