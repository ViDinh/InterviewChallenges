package com.webui.loginpage;

public class InterviewCodingChallenges {

	public static void main(String[] args) {
		int[] array = {-20, 34, 21, -87, 92, 224748};
		lagestAndSmallest(array);
	}
	
	public static void lagestAndSmallest(int[] array) {
		int maxValue = array[0];
		int minValue = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i]>maxValue) {
				maxValue = array[i];
			}
		}
		for (int i = 0; i < array.length; i++) {
			if (array[i]<minValue) {
				minValue = array[i];
			}
		}
		
		System.out.println(minValue);
		System.out.println(maxValue);
	}
	
	
}
