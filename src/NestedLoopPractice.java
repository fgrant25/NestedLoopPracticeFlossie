public class NestedLoopPractice {
    public static void main(String[] args) {
        NestedLoopPractice n=new NestedLoopPractice();
    }
    public NestedLoopPractice(){
        pattern1();
        pattern2();
        pattern3();
        pattern4();
        pattern5();
        pattern6();
        pattern7();
        pattern75();
        pattern8();
        pattern9();
    }
    public void pattern1(){
        //code for pattern1 goes here
        System.out.println("******pattern 1******");
         int number=0;
        for (int i = 0; i < 6; i++) {
            System.out.println(number);
            number = number + 5;
        }
        System.out.println();
    }
    public void pattern2(){
        System.out.println("******pattern 2******");
        int number=2;
        for (int i = 0; i < 6; i++) {
            System.out.println(number);
            number = number + 5;
        }
        System.out.println();
    }
    public void pattern3(){
        System.out.println("******pattern 3******");
        int number=21;
        for (int i = 0; i < 6; i++) {
            System.out.print(number + "\t");
            number = number - 4;
        }
        System.out.println();
    }
    public void pattern4(){
        System.out.println();
        System.out.println("******pattern 4******");
        int number=1;
        int d=3;
        for (int i = 0; i < 7; i++) {
            System.out.print(number+ "\t");
            number = number + d;
            d=d+2;
        }
        System.out.println();
    }
    public void pattern5(){
        System.out.println();
        System.out.println("******pattern 5******");
        int number=1;
        for (int k=0; k<4; k++) {
            for (int i = 0; i < 4; i++) {
                System.out.print(number + "\t");
                number = number + 1;
            }
            System.out.println();
            number=1;
        }
        System.out.println();
    }
    public void pattern6(){
        System.out.println("******pattern 6******");
        int number=1;
        for (int i = 0; i < 5; i++) {
            System.out.println(number);
            number = number + 1;
            for (int k=0; k<i+ 1; k++) {
                System.out.print(" ");
            }
        }

    }
    public void pattern7(){
        System.out.println("******pattern 7******");
        int number=1;
        for (int i = 0; i < 5; i++) {
            for (int k=0; k<i+ 1; k++) {
                System.out.print(number);
            }
            number = number + 1;
            System.out.println();
        }

    }
    public void pattern75(){
        System.out.println("******pattern 7.5******");
        int number=1;
        for (int i = 0; i < 5; i++) {
            for (int k=0; k<(5-i)+ 1; k++) {
                System.out.print(number);
            }
            number = number + 1;
            System.out.println();
        }

    }
    public void pattern8(){
        System.out.println("******pattern 8******");
        int number=1;
        for (int i = 0; i < 5; i++) {
            for ( int a=0; a<(i); a++){
                System.out.print(" ");
            }
            for (int k=0; k<(4-i)+ 1; k++) {

                System.out.print("*");
            }

            number = number + 1;
            System.out.println();
        }

    }
    public void pattern9(){
        System.out.println("******pattern 9******");
        int number=1;
        for (int i = 0; i < 5; i++) {
            for ( int a=0; a<(5-i)+1; a++){
                System.out.print(" ");
            }
            for (int k=0; k<(i); k++) {

                System.out.print("*");
            }
            for ( int a=0; a<(i); a++){
                System.out.print(" ");
            }


            number = number + 1;
            System.out.println();

            //incompleted 9
        }

    }



}
