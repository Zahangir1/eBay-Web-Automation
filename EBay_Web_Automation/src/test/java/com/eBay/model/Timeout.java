package com.eBay.model;

public class Timeout {
	
	public void timeout () {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
