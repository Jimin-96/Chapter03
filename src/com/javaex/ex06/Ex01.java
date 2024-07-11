package com.javaex.ex06;

public class Ex01 {
	public static void main(String[] args) {

		int a = 3; // 기본
		System.out.println(a);

		Integer i = new Integer(3);
		System.out.println(i.toString());

		Integer sum = new Integer(3) + new Integer(5);
		System.out.println(sum);

		Integer v01 = 3;

		int v02 = i;

		System.out.println("------------------------------");

		//문자열을 -> 숫자로
		
		// 덜 좋은 방식
		Integer r01 = 100;
		int result = r01.parseInt("1234567");
		System.out.println(result + 3);
		
		//조금 더 좋은 방식 static의 이해
		int result02 = Integer.parseInt("1234567") ;
		System.out.println(result02);
		
		
		// 정수 -> 문자열
		String s99 = String.valueOf(5555);
		System.out.println(s99);
		System.out.println(s99+5);

	}

}
