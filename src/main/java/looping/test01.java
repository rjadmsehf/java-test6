package looping;

import java.util.Scanner;

public class test01 {
    public static void main(String[] args) {
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
