package com.alg.top20.ll;

public class MyRandom {

	public static long nextInt(int n) {
		return System.currentTimeMillis()%n;
	}
	public static void main(String[] args) {
		System.out.println(nextInt(10));

	}

}
