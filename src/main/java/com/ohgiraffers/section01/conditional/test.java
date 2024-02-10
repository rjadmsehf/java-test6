package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class test {

    public void test1() {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 정수를 입력해주세요 : ");
        int first = sc.nextInt();

        System.out.println("두 번째 정수를 입력해주세요 : ");
        int second = sc.nextInt();

        System.out.print("연산 기호 입력 (+ ,- ,* ,/ ,%) : ");
        sc.nextLine();

        String selectDrink = sc.nextLine(); // < 필기 변수 선언함


        /* 연산의 결과를 저장할 변수 생성 */
        int result = 0;

        /* 입력한 연산기호 문자에 따라 연산의 결과가 달라짐 */
        switch (selectDrink) {
            case "+":
                result = first + second;
                break;
            case "-":
                result = first - second;
                break;
            case "*":
                result = first * second;
                break;
            case "/":
                result = first / second;
                break;
            case "%":
                result = first % second;
                break;

        }
            System.out.println(first + " " + selectDrink + " " + second + " = " + result);


        }
        /* 숫자 스무고개 만들어보기 로또번호 추첨기 */
    }