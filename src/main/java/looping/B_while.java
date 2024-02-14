package looping;

import java.util.Scanner;

public class B_while {

    public  void testSimpleWhileStatment() {

        /* 목표 while 문 단독 사용에 대한 흐름을 이해하고 적용할 수 있다.*/
        /* 필기.
            [while 문 표현식]
            초기식;
            while(조건식){
                조건을 만족하는 경우 수행할 구문 (반복할 구문);
                증감식;
                }
         */

        /* 필기 1부터 10까지 1씩 증가시키면서 (10번) i 값을 출력하는 기본 반복문*/

        int i = 1;
        while (i <= 10 ) {

            System.out.println(i);

            i++;
        }
    }
    public void  testWhileExample1(){

        /* 목표 while 문의 흐름을 이해하고 적용 할수 있다 . (1)
            필기. 입력한 문자열의 인덱스를 이용하여 문자 하나씩 출력해보기
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("문자열읊 입력해주세요  : ");
        String str = sc.nextLine();

        /* 필기
            charAt() : 문자열에서 인덱스에 해당하는 문자를 char 형으로 반환하는 기능
            lengty() : String 클래스의 메소드로 문자열의 길이를 int 형으로 반환한다.
            index : 0부터 시작하고 마지막 인덱스는 항상 길이보다 한 개 작은 숫자를 가진다.
         */

        System.out.println("============================================================");
        for(int i = 0 ; i < str.length(); i++) {

            char ch = str.charAt(i);

            System.out.println(i +" : " + ch);


        }

        System.out.println("===========================================================");
        int index = 0;

        while (index < str.length()){

            char ch = str.charAt(index);
            System.out.println(index + " : "+ ch);



        }



    }
    public void  testWhileExample2(){

        /* 필기 증찹while 문을 이용한 구구단 출력하기 2~9단*/

        int dan = 2;
        while (dan < 10){

            int su = 1;
            while  (su < 10)
                System.out.println(dan + " * " + su + " = " + (dan + su));

            System.out.println();
            dan++;
        }

    }

}
