package com.example.demo.config;

import com.example.demo.impl.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PrinterConfig {
    @Bean
    public RedPrinter redPrinter(){
        return new RedPrint();
    }

    @Bean
    public BluePrinter bluePrinter(){
        return new BluePrint();
    }

    @Bean
    public ColourPrinter colourPrinter(BluePrinter bluePrinter, RedPrinter redPrinter){
        return new ColourPrint(redPrinter, bluePrinter);
    }
}
