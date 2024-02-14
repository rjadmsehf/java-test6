package looping;

import java.util.Scanner;

public class A_nestedFor {

    public void printGugudanFromTwoToNine() {


        /* 목표 중첩된 for문의 흐름을 이해하고 적용할 수 있다. (1)*/

        /* 필기. for문 안에서 for문을 이용할 수 있다. */

        /* 필기. 2단부터 단을 1씩 증가시키는 반복문 */
        for (int dan = 2; dan < 10; dan++) {

            /* 필기. 단이 1개씩 증가하는 동안 수행할 내용은 해당 단의 구구단을 출력하는 것.*/
            for (int su = 1; su < 10; su++) {

                System.out.println(dan + " * " + su + " = " + (dan * su));
            }

            System.out.println();
        }

    }
    public void printUpgradeGugudan() {

        for (int dan = 2; dan < 10; dan++) {

            printGugudanOf(dan);
        }
    }
    public void printGugudanOf (int dan){

        for(int su = 1; su < 10; su++){

            System.out.println(dan + " * " + su + " = " + (dan * su));
        }

    }

    public void printStarInputRowTimes() {

        /* 필기.
            키보드로 정수를 하나 입력 받아 해당 정수 만큼 한 행에 "*" 를 5개씩 출력하세요
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("출력할 행수를 입력하세요 : ");
        int row = sc.nextInt();

        for(int i =1 ; i <= row; i++){

            for(int j = 1; j < 6 ; j++){

                System.out.print("*");

            }
            System.out.println();

        }






    }


}
