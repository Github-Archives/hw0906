//Drew Williams
//hw0906
//https://github.com/Drew-Williams/Algorithms-and-Datastructures-Fall-2018/blob/master/hw0906
//COSC 311

package hw0906;

import java.util.Scanner;

public class ArrayRepeater {
	
	public static void repeat (int[] a, int factor) {
		
		try {
			printArray(a, 1);
			System.out.println("factor = " + factor);
			int counter = 1;
			int arrSize = factor;
			int factorMultiple = factor * 3;
			int[] arr2 = new int[factorMultiple];
				if (factor > 0) {
					for (int i = 0; i < factorMultiple; i++) {
						arr2[i] = counter;
						counter += 1;
						if (counter > 3) {
							counter = 1;
						}
					}
				}
			printArray(arr2, 2);
			
		}catch(NegativeArraySizeException e) {
			System.out.println("\nrepeat(a, factor) --> {}");
		}
	}
	
	public static void printArray(int[] array, int x) {
		
		if (x == 1) {
			System.out.print("a = {");
			for (int i = 0; i < array.length; i++) {
				System.out.print(" " + array[i] + ", ");
			}
		}
		else if (x == 2) {
			System.out.print("\nrepeat(a, factor) --> {");
			for (int i = 0; i < array.length; i++) {
				System.out.print(" " + array[i] + ", ");
			}
		}
		System.out.println("}");
	}
	
	public static void main(String[] args) {
		
		int num2;
		do {
			int[] arr = {1, 2, 3};	
			Scanner scan = new Scanner(System.in);
			System.out.println("please input factor: ");
			int num = scan.nextInt();
			repeat(arr, num);
					
			System.out.println("\n\t(Press 1 to go again)");
			num2 = scan.nextInt();
		}
		while (num2 == 1);
	}
	
}
