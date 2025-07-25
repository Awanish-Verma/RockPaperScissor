package JAVACODE.lec2;

import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {
        int n = 0;
        int countP1 = 0;
        int countP2 = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n\n\n");
        System.out.print("Enter the name of 1st Player :- ");
        String name1 = scanner.nextLine();
        System.out.print("Enter the name of 2st Player :- ");
        String name2 = scanner.nextLine();

        System.out.println("Now game is started ");
        System.out.println("\n\n");

        while (n != 1) {

            System.out.print(name1 + " :- ");
            char ch = scanner.next().charAt(0);
            System.out.print(name2 + " :- ");
            char cha = scanner.next().charAt(0);

            if(ch=='r' && cha== 'p'){
                System.out.println(name2 + " is winner");
                countP2++;
            }
            else if(ch=='p' && cha== 'r'){
                System.out.println(name1 + " is winner");
                countP1++;
            }
            else if(ch=='p' && cha== 's'){
                System.out.println(name2 + " is winner");
                countP2++;
            }
            else if(ch=='s' && cha== 'p'){
                System.out.println(name1 + " is winner");
                countP1++;
            }
            else if(ch=='r' && cha== 's'){
                System.out.println(name1 + " is winner");
                countP1++;
            }else if(ch=='s' && cha== 'r'){
                System.out.println(name2 + " is winner");
                countP2++;
            }
            else if (ch=='e' && cha=='e'){
                n=1;
            }
            else{
                System.out.println("wrong entry please enter r , p , s only and if you want end the game enter e in both person ");
            }
        }

        if (countP1>countP2){
            System.out.println("\n" + name1 + "is winners win by " + (countP1-countP2) + " point");
        }
        else if(countP1<countP2){
            System.out.println("\n" + name2 + "is winners win by " + (countP2-countP1) + " point");
        }
        else{
            System.out.println("\nDraw the match");
        }
        
        scanner.close();
    }
}
