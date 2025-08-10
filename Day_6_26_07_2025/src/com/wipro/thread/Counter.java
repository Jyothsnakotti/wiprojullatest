package com.wipro.thread;

public class Counter {
	public int count = 0;

    public synchronized void increment() {
        count++;
    }

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public Counter() {
		super();
		this.count = count; 
		
	}

	@Override
	public String toString() {
		return "Counter [count=" + count + ", getCount()=" + getCount() + "]";
	}

	

}
