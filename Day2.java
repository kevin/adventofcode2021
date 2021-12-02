// github.com/kevin
// 12/2/2021

import java.util.ArrayList;
import java.util.Scanner;

public class Day2 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int hori = 0; // horizontal distance traveled
		int depth = 0; // depth
		
		int hori2 = 0; // maybe these should be longs but this passed anyways
		int depth2 = 0;
		int aim = 0;
		
		// part 1 and 2
		
		while (in.hasNextLine()) {
			
			String command = in.next();
			int n = in.nextInt();
			in.nextLine();
			hori += command.equals("forward") ? n : 0;
			depth += command.equals("forward") ? 0 : command.equals("down") ? n : -n;
			hori2 += command.equals("forward") ? n : 0;
			depth2 += command.equals("forward") ? n*aim : 0;
			aim += command.equals("forward") ? 0 : command.equals("down") ? n : -n;
			
		}
		
		System.out.println("Part 1: " + hori * depth);
		
		System.out.println("Part 2: " + hori2 * depth2);
		
	}

}