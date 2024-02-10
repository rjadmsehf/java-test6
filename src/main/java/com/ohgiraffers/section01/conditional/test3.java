package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {


        //사용자로부터 세 개의 숫자를 입력받아, 이 중에서 가장 큰 숫자를 찾아서 출력하는 프로그램을 작성하세요.

        Scanner sc = new Scanner(System.in);
        System.out.print("첫번쨰 숫자를 입력하세요 : ");
        int a = sc.nextInt();
        System.out.println("첫번째 숫자 : " + a);

        System.out.print("두번쨰 숫자를 입력하세요 : ");
        int b = sc.nextInt();
        System.out.println("두번째 숫자 : " + b);


        System.out.print("세번쨰 숫자를 입력하세요 :");
        int c = sc.nextInt();

        System.out.println("세번째 숫자 : " + c);

        if (a > b && a > c) {
            System.out.println("가장 큰숫자는 : " + a + "입니다");
        } else if (b > a && b > c) {
            System.out.println("가장 큰숫자는 : " + b + "입니다");
        } else if (c > a && c > b) {
            System.out.println("가장 큰숫자는 : " + c + "입니다");
        } else
            System.out.println("숫자 가 겹쳤습니다!!!1");

    }

}