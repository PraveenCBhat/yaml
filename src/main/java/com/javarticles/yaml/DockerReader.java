package com.javarticles.yaml;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DockerReader {

	public static void main(String[] args) {
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader(
					"/Users/praveena.c/Documents/praveenbhat/Dockerfile"));
			String line = reader.readLine();
			while (line != null) {
				System.out.println(line);
				// read next line
				line = reader.readLine();
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}