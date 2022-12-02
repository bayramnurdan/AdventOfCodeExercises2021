package day2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AEC2021Day2Part1 {
	public static void main(String[] args) throws FileNotFoundException{
		final String FILE_PATH ="/Users/nurdanemin/Desktop/AOC-2021-Day2-input.txt";
		
		int depth = 0;
		int horizontal_position = 0;
		FileInputStream fis = new FileInputStream(FILE_PATH);
		Scanner scan = new Scanner(fis);
		
		while (scan.hasNextLine()) {
			String[] temp = scan.nextLine().strip().split(" ");
			
			switch (temp[0]) {
			case "forward":
				horizontal_position += Integer.parseInt(temp[1]);
				
				break;
			case "up":
				depth -= Integer.parseInt(temp[1]);
				break;
			case "down":
				depth +=Integer.parseInt(temp[1]);
			}
			}
		
	System.out.println(depth*horizontal_position);
		}
		
		
		
	}

