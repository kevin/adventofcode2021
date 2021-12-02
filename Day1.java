// github.com/kevin
// 12/2/2021

import java.util.ArrayList;
import java.util.Scanner;

public class Day1 {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		// part 1
		
		ArrayList<Integer> n = new ArrayList<>();
		
		int count = 0;
		
		n.add(in.nextInt());
		
		while (in.hasNextInt()) {
			
			n.add(in.nextInt());
			if (n.get(n.size()-1) > n.get(n.size()-2)) {
				count++;
			}
			
		}
		
		System.out.println("Part 1: " + count);
		
		// part 2
		
		count = 0;
		int numWindows = n.size()-2;
		
		int last = n.get(0) + n.get(1) + n.get(2); // last window calculated, start at the first window
		
		for (int i = 1; i < numWindows; i++) {
			
			int current = n.get(i) + n.get(i+1) + n.get(i+2); // current window
			count += current > last ? 1 : 0;
			last = current;
			
		}
		
		System.out.println("Part 2: " + count);
		
	}

}






