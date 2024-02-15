package looping;

import java.util.Scanner;

public class Oneten {
    public static void main(String[] args) {
        Oneten o = new Oneten();
//        o.oneten2();

//        o.childan();
//    o.jjaksu();
        o.factorial();

//        o.time();

    }

    public void oneten2() {

        for (int i = 10; i >= 1; i--) {
            System.out.println(i);

        }

    }

    public void childan() {

        for (int i = 1; i <= 9; i++) {
            System.out.println(7 * i);
        }

    }

    public void jjaksu() {

        for (int i = 1; i <= 100; i++) {

            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

    }

    public void factorial() {

        Scanner sc = new Scanner(System.in);
        System.out.print("값을 입력해주세요 : ");

        int x = sc.nextInt();
        int sum = 1;
        for (int y = 1; y <= x; y++) {
            sum *= y;

            System.out.println(sum);

        }

    }

    public void time() {

        for (int h = 0; h <= 23; h++) {

            for (int m = 0; m <= 59; m++) {
                System.out.println(h + " : " + m);
            }

        }
    }
    public void time2() {

        int h = 0;
        int m = 0;
        while (h < 24){

            while (m < 60){
                System.out.println(h + " : " + m);
           m++; }
            h++;
            m = 0;
        }
    }
}














