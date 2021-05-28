package com.yura;

import java.util.Arrays;

public class Uniform {
	
	//작성중
	public static int borrowUniform(int n, int[] lost, int[] reserve) {
		
		int answer = 0; 
		
		int lost_num = lost.length;
		int reserve_len = reserve.length; 
		
		for(int i=0; i<lost.length; i++) {
			int lostOne = lost[i]; 
			for (int j = 0; j < reserve.length; j++) {
				
				if(lostOne == reserve[j]) {
					for(int bye=j; bye<reserve.length-1; bye++) {
						reserve[bye] = reserve[bye+1]; 
					}
					System.out.println(Arrays.toString(reserve));
				}
				
				if(lostOne+1 == reserve[j] || lostOne-1 == reserve[j]) {
					System.out.println(reserve[j] + ", you can borrow to:"+lostOne);
				}
			}
		}
		
		
		return answer; 
	}
	
	public static void main(String[] args) {
	
		int n = 5;
		int[] lost = {2,4};
		int[] reserve = {1,2,5}; 
		
		
		borrowUniform(n, lost, reserve);
		
	}
}
