package Sorting;

import java.util.Arrays;

public class MinimumMovesToSeatEveryone {
	
	public static void main(String args[]) {
		
		
		int[] seats = {3,1,5};
		int[] students = {2,7,4};
		
		Arrays.sort(seats);
		Arrays.sort(students);
		int count =0;
		for(int i=0;i<seats.length;i++) {
			if(seats[i] > students[i]) {
				count = count + seats[i] - students[i];
			}
			
			else {
				count = count +  students[i] -seats[i] ;
			}
		
		}
		
		System.out.print(count);
		
		
	}

}
