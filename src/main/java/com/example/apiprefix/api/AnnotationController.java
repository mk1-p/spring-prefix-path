package com.example.apiprefix.api;

import com.example.apiprefix.config.ApiPrefixController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ApiPrefixController
public class AnnotationController {
    @GetMapping
    @RequestMapping("/anno")
    public ResponseEntity getTestMessage() {
        return ResponseEntity.ok().body("Annotation Message Ok!");
    }
}
