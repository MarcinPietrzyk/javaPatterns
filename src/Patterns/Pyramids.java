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
    }

}
