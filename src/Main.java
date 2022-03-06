public class Main
{
    public static void main(String[] args)
    {
        for(int i = 0; i <= 30; i++){
            System.out.println(i);
            // #1
        }
        for(int i = 30; i >= 0; i--){
            System.out.println(i);
            // #2
        }
        for (int i = 0; i <= 18; i +=3 ){
            System.out.println(i);
            // #3
        }
        for (int i = 10; i >= 0; i -= 2){
            System.out.println(i);
            // #4
        }

        for(int i = 0; i < 6; i++) {

            for(int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
            // #5
        }

        for(int i = 5; i >= 0; i--) {

            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println("");
            // #6
        }

        for(int i = 0; i < 5; i++){

            for(int j = 0; j < 5; j++){
                System.out.print("*");
            }
            System.out.println("");

            // #7
        }

    }
}

