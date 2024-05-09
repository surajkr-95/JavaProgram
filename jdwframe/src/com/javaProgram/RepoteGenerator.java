package com.javaProgram;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class RepoteGenerator {

	public static void main(String[] args) {
		  try {
	            FileWriter writer = new FileWriter("report.txt");
	            LocalDateTime dateTime = LocalDateTime.now();
	            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

	            writer.write("Report generated on: " + dateTime.format(formatter));
	            writer.close();

	            System.out.println("Report has been generated.");
	        } catch (IOException e) {
	            System.out.println("An error occurred while generating the report.");
	            e.printStackTrace();
	        }
	}

}
