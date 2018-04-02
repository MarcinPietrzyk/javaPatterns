package Patterns;

public class Pyramids {
    public static void main(String[] args) {
        System.out.println("Patterns");

        for(int row = 1; row<=5;row++){
            for(int column = 1; column<=row;column++){
                System.out.printf("*");
            }
            System.out.print("\n");
        }
    }
}
