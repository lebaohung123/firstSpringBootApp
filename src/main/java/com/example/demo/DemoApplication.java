package com.example.demo;

import com.example.demo.impl.ColourPrint;
import com.example.demo.impl.ColourPrinter;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

	private ColourPrinter colourPrinter;

	public DemoApplication(ColourPrinter colourPrinter){
		this.colourPrinter = colourPrinter;
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(final String...args){
		System.out.println(colourPrinter.print());
	}
}
