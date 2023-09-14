package com.example.apiprefix.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("${api_prefix}/spel")
public class SpELController {

    @GetMapping
    public ResponseEntity getTestMessage() {
        return ResponseEntity.ok().body("SpEL Message Ok!");
    }

}
