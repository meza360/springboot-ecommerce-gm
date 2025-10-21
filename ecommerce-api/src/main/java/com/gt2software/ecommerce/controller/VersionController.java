package com.gt2software.ecommerce.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "/version")
public class VersionController {

    @GetMapping(value = "/version", produces = MediaType.TEXT_PLAIN_VALUE)
    public ResponseEntity<String> getVersion() {
        return ResponseEntity.ok("1.0");
    }

}
