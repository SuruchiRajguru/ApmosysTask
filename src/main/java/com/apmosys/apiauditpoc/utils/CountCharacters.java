package com.apmosys.apiauditpoc.utils;

public class CountCharacters {

	public static void main1(String[] args) {
		// TODO Auto-generated method stub
		String s="Hello world";
		int count;
		int total=0;
		count=s.length();
		System.out.println(count);
		
		
		for(int i=0;i<count;i++) {
			if(s==" "){
				continue;
			}
			else {
				total++;
			}
		}
		System.out.println("total charachters present in the string are"+total);
		

	}

}
