package com.ohgiraffers.section01.conditional;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class B_ifElse {




    public void testSimpleIfElseStatement() {
        /* 목표 if-else 문 단독 사용에 대한 흐름을 이해하고 적용할 수 있다.*/
    /* 필기.
        [if-else 문 표현식]
        if(조건식) {
            조건식이 true일 경우 실행할 명령문;
        } else {
            조건이 false 일 경우 실행할 명령문;
        }    */

    /* 필기.
        if 문은 조건식의 결과 값이 참(true)이면 if { } 안에 있는 코드를 실행하고,
        조건식의 결과 값이 거짓(false) 이면 else { } 안에 있는 코드를 실행한다.
     */

    /* 필기.
        정수 한 개를 입력 받아 그 수가 홀수 이면 " 입력하신 숫자는 홀수입니다."
        라고 출력하고,
        홀수가 아니면 "입력하신 숫자는 짝수입니다." 라고 출력하는 프로그램을 작성해보자
        단, 조건과 상관 없이 프로그램이 종료될 때"프로그램이 종료됩니다" 라고 출력되도록 한다.
     */

        Scanner sc = new Scanner(System.in); // Scanner 클래스를 사용하기 위한 조건

        System.out.print("정수 한 개를 입력하세요 : ");
        int num = sc.nextInt();

        /* 필기. 짝수인지 조건 확인 */
        if(num % 2 != 0){

            System.out.println("입력하신 정수는 홀수입니다~");

        } else {

            System.out.println("입력하신 정수는 짝수입니다.");
        }

        System.out.println("프로그램을 종료합니다....");


    }

    public void testNestedIfElseStatement() {

        /* 목표 중첩 된 if-else 문의 흐름을 이해하고 적용할 수 있다. */
        /* 필기. 중첩 된 if else- 문 실행 흐름 확인 */

        /* 필기
            숫자를 하나 임력 받아 양수이면 "압력하신 숫자는 양수입니다" 출력
            음수이면 "입력하신 숫자는 음수입니다:" 출력
            단, 0이면 "0입니다" 라고 출력하세요
         */
        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 하나 입력하세요 : ");
        int num = sc.nextInt();

        if(num != 0) {

            if(num > 0) {
                System.out.println("입력하신 숫자는 양수입니다.");
            } else{

                System.out.println("입력하신 숫자는 음수입니다.");
            }

        } else{
        System.out.println("입력하신 숫자는 0 입니다.");

         }
        System.out.println("ㅗ");
    }

}

