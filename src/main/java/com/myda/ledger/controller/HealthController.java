package com.myda.ledger.controller;

import com.myda.ledger.service.DocumentService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class HealthController {

    private final DocumentService service;

    public HealthController(DocumentService service) {
        this.service = service;
    }

    @GetMapping("/health")
    public String health() {
        return service.getStatus();
    }

}
