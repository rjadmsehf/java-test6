//package looping;
//
//import java.util.Scanner;
//
//public sealed class B_doWhile {
//
//
//    public void testSimpleDoWhileStatement() {
//
//        /* 목표 do- while 문 단독 사용에 대한 흐름을 이해하고 적용할 수 있다*/
//        /* 필기
//            [do-while 문 표현식
//            do {
//                1회차에는 무조건 실행하고 이후에는 조건식을 확인하여 조건을 만족하는 경우 수행할 구문 (반복한 구간)
//                증감식;
//                } while (조건식);
//         */
//
//        do {
//
//            System.out.println(" 최초 1번만 동작하니? ");
//
//
//        } while (false);
//
//        System.out.println("종료확인 ");
//    }
//
//    public void testDoWhileExpmple1() {
//
//        /* 필기
//            키보드로 문자열 입력 받아 반복적으로 출력
//            단, exit 입력되면 반복문을 종료한다.
//
//         */
//
//        Scanner sc = new Scanner(System.in);
//        String str = "";
//
//        do {
//
//            System.out.println("문자열을 입력하세요  :  ");
//            str = sc.nextLine();
//            System.out.println(str);
//            /* 필기 equals() : 문자열은 == 비교불가능하다. 이유를 물으신다면 나중에 해드릴게요.*/
//        } while (!str.equals("exit"));
//
//        System.out.println(" 프로그램을 종료합니다");
//
//
//    }
//}
//
//
//
