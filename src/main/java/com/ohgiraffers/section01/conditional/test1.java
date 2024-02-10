package com.ohgiraffers.section01.conditional;

import java.util.Scanner;

public class test1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.print("사용자수를 정해주세요 : ");
        int inum = sc.nextInt();
        sc.nextLine();

        int jjg = (int)(Math.random()*3)+1;


        if (jjg == 1 ) {


            System.out.print("사용자1 지정 : " + sc.nextLine());


        } else if (inum == 2) {

            System.out.print("사용자1 지정 : "  );
            String a = sc.nextLine();

            System.out.print("사용자2 지정 : " );
            String b = sc.nextLine();

        }else if (inum == 3 ) {

            System.out.print("사용자1 지정 : "  );
            String a = sc.nextLine();

            System.out.print("사용자2 지정 : " );
            String b = sc.nextLine();

            System.out.print("사용자3 지정 : " );
            String c = sc.nextLine();


            }



    }
    }