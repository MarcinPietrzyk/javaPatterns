package Patterns;

public class Pyramids {
    public static void main(String[] args) {
        System.out.println("1st patterns");

        for(int row = 1; row<=5;row++){
            for(int column = 1; column<=row;column++){
                System.out.printf("*");
            }
            System.out.print("\n");
        }

        System.out.println("2nd pattern");

        for(int row=1; row<=5;row++){
            for(int column = row; column<=5;column++){
                System.out.printf("*");
            }
            System.out.print("\n");
        }

        System.out.println("3rd pattern");

        for(int row = 0; row<5; row++){
            for(int column = 0; column < row; column++){
                System.out.printf(" ");
            }
            for(int column2 = row; column2 < 5; column2++){
                System.out.printf("*");
            }
            System.out.printf("\n");
        }

        System.out.println("4th pattern");
        for(int row = 0; row<5; row++){
            for(int column = row; column<4; column++){
                System.out.printf(" ");
            }
            for(int columnb = 0; columnb <= row; columnb++){
                System.out.printf("*");
            }
            System.out.printf("\n");
        }

    }

}
