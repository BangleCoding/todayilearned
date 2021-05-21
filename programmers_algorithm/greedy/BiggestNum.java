package com.yura;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BiggestNum {
	
	//작성중
	public static int biggestNum(String number, int k) {
		
		ArrayList<String> numList = new ArrayList<String>(); 
		 
		for (int i = 0; i < number.length(); i++) {
			char num = number.charAt(i); 
			String stNum = Character.toString(num);  
			numList.add(stNum); 
		}
		
		int max_num = -1; 
		for(int i=0; i < numList.size(); i++) { //1,9,4,2 
			for(int j=0; j<numList.size(); j++) {
				if(numList.get(i) != numList.get(j)) {
					String ss = numList.get(i) + "" + numList.get(j); 
					int aa = Integer.parseInt(ss); 
					if(max_num < aa) {
						max_num = aa; 
					}
				}
				
			}
		}
		return max_num; 
	}
	
	public static void main(String[] args) {
		
		System.out.println(biggestNum("1942", 2));
		
	}
	
}
