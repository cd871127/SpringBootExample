package com.anthony.service;

import org.springframework.stereotype.Service;

@Service
public class BService implements TestService {
    @Override
    public void whoami() {
        System.out.println("BBBBBBBBBB");
    }
}
