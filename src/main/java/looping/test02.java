package looping;

public class test02 {

    public static void main(String[] args) {
        test02 te = new test02();
        te.jjaksu();
    }
    public void jjaksu() {

        for (int i = 1; i <= 20; i++) {

            if (i % 2 == 1) {
                System.out.println(i);
            }
        }

    }
    public void pppp() {

        for (int x = 1; x <= 5; x++) ;{
            for (int y = 0; y < 5; y++) ; {
            System.out.println("*");
        }

        }
    }
}
