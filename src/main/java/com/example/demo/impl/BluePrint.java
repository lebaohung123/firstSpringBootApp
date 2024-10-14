package com.example.demo.impl;

import org.springframework.stereotype.Component;

@Component
public class BluePrint implements BluePrinter{
    @Override
    public String print() {
        return "BLUEEEE";
    }
}
