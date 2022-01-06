package com.study.ocp.day01;

import java.util.Arrays;

public class ArrayDemo3 {

	public static void main(String[] args) {
		int[] p1 = { 10, 20 };
		int[] p2 = { 30, 50 };
		// p1(10,20), p2(30,50)
		// 求兩點間的距離
		double x1 = Math.pow(p1[0] - p2[0], 2);
		double x2 = Math.pow(p1[1] - p2[1], 2);
		double d = Math.sqrt(x1 + x2);
		System.out.printf("p1:%s p2:%s 距離:%.2f", Arrays.toString(p1), Arrays.toString(p2), d);
	}

}
