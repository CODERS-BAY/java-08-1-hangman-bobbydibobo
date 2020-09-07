import java.util.Arrays;
import java.util.Scanner;

public class Hangmanb {

    public static void main(String[] args) {

        //Ask user for rnd word

        Scanner scan = new Scanner(System.in);

        System.out.println("Type in your word!");
        String yourWord = scan.nextLine();
        char[] yourWordChar = yourWord.toCharArray();

        int sumCharToIntWord = 0;

        for (int i = 0; i < yourWordChar.length; i++){
            sumCharToIntWord += (int)yourWordChar[i];
        }

        System.out.println(sumCharToIntWord);

        //print with * replacement

        char[] yourWordHidden = new char[yourWord.length()];
        Arrays.fill(yourWordHidden, '*');
        String hiddenWord = new String(yourWordHidden);

        //Counter + hanged man

        int counter = 0;

        //true or false

        while (counter <= 6){
            System.out.println("Type in one character! Counter: " + counter);
            char yourChar = scan.next().charAt(0);

            counter++;

            int sumCharToIntHidden = 0;

            for (int i = 0; i < yourWordChar.length; i ++) {

                if (yourChar == yourWordChar[i]) {

                    System.out.println("Thats right darling, I am the one you are looking for!");

                    yourWordHidden[i] = yourChar;

                    sumCharToIntHidden += ((int)yourWordHidden[i]);

                    counter--;

                }
            }

            System.out.println("The Word: ");
            System.out.println(yourWordHidden);

            switch (counter) {

                case 1:{
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    System.out.println("    ___|___");
                    break;
                }

                case 2: {
                    System.out.println("");
                    System.out.println("       |");
                    System.out.println("       |");
                    System.out.println("       |");
                    System.out.println("       |");
                    System.out.println("       |");
                    System.out.println("       |");
                    System.out.println("    ___|___");
                    break;
                }

                case 3: {
                    System.out.println("        _________");
                    System.out.println("       |");
                    System.out.println("       |");
                    System.out.println("       |");
                    System.out.println("       |");
                    System.out.println("       |");
                    System.out.println("       |");
                    System.out.println("    ___|___");
                    break;
                }

                case 4: {
                    System.out.println("        _________");
                    System.out.println("       |/");
                    System.out.println("       |");
                    System.out.println("       |");
                    System.out.println("       |");
                    System.out.println("       |");
                    System.out.println("       |");
                    System.out.println("    ___|___");
                    break;
                }

                case 5: {
                    System.out.println("        _________");
                    System.out.println("       |/        |");
                    System.out.println("       |");
                    System.out.println("       |");
                    System.out.println("       |");
                    System.out.println("       |");
                    System.out.println("       |");
                    System.out.println("    ___|___");
                    break;
                }

                case 6: {
                    System.out.println("        _________");
                    System.out.println("       |/        |");
                    System.out.println("       |        (_)");
                    System.out.println("       |       --|--");
                    System.out.println("       |         |");
                    System.out.println("       |        //");
                    System.out.println("       |");
                    System.out.println("    ___|___");
                    System.out.println("   YOU LOOSE");
                    break;
                }

            }



        }

    }

}