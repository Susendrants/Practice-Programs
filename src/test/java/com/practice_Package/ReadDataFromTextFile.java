package com.practice_Package;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.testng.annotations.Test;

public class ReadDataFromTextFile {
	@Test
	public void readData() throws FileNotFoundException
	{
		File fs= new File(".\\src\\test\\resources\\data.txt");
		Scanner s= new Scanner(fs);
		int count=0;
		while(s.hasNextLine())
		{
			System.out.println(s.nextLine());
			count++;
		}
		System.out.println(count);
	}

}
