package com.myda.ledger.service;

import org.springframework.stereotype.Service;

@Service
public class DocumentService {

    public String getStatus() {
        return "Ledger is operational";
    }
}
