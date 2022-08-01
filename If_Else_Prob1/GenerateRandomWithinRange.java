package com.tricky.interview;

public class GenerateRandomWithinRange{
	
	public static void main(String[] args){

	//double x= Math.random();

	System.out.println(getRandomNumber(10, 50));

	}

	static int getRandomNumber(int min, int max)
	{

	int n;
	n = (Math.random() * (max - min)) + min;

	return n;
	}
}