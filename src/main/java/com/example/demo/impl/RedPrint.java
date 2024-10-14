package com.example.demo.impl;

import org.springframework.stereotype.Component;
@Component
public class RedPrint implements RedPrinter {

    @Override
    public String print() {
        return "Reddddd";
    }
}
