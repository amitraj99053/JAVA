import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        Scanner variable;
        variable = new Scanner(System.in);
        String vowel;

        System.out.println("Enter alphabet ");
        vowel = variable.nextLine();

        switch (vowel){
            case "A":
            case "E":
            case "I":
            case "O":
            case "U":
            case "a":
            case "e":
            case "i":
            case "o":
            case "u":
                System.out.println("Given alphabet is vowel word🙂😁 ");
                break;
            case "B":
            case "C":
            case "D":
            case "F":
            case "G":
            case "H":
            case "J":
            case "K":
            case "L":
            case "M":
            case "N":
            case "P":
            case "Q":
            case "R":
            case "S":
            case "T":
            case "V":
            case "W":
            case "X":
            case "Y":
            case "Z":
            case "b":
            case "c":
            case "d":
            case "f":
            case "g":
            case "h":
            case "j":
            case "k":
            case "l":
            case "m":
            case "n":
            case "p":
            case "q":
            case "r":
            case "s":
            case "t":
            case "v":
            case "w":
            case "x":
            case "y":
            case "z":
                System.out.println("Given alphabet is consonant");
            break;
            default:
                System.out.println("Enter only alphabet");


        }

    }
}
