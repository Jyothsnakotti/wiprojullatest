package com.wipro.thread;

public class AlphaThread extends Thread{
	public void run()
	{
		for(char ch='A';ch<='J';ch++)
		{
			System.out.println(ch+ " ");
		}
	}
}
