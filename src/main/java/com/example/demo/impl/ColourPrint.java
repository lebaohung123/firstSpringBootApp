package com.example.demo.impl;

import org.springframework.stereotype.Component;

@Component
public class ColourPrint implements ColourPrinter{

    private RedPrinter redPrinter;
    private BluePrinter bluePrinter;

    public ColourPrint(RedPrinter redPrinter, BluePrinter bluePrinter){
        this.redPrinter = redPrinter;
        this.bluePrinter = bluePrinter;
    }

    @Override
    public String print() {
        return String.join(", ", redPrinter.print(), bluePrinter.print());
    }
}
