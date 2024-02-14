package looping;

public class test03 {
    public static void main(String[] args) {

        for (int x = 1 ; x < 6; x++) {
            for(int y = 0; y < x; y++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
// for(int i = 1 ; i < 6; i++){  // 행
//        for(int j = 0; j < i; j++){
//        System.out.print("*");
//            }
//                    System.out.println();
//	        }

