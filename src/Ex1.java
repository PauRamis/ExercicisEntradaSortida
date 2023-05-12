import java.io.File;
import java.util.Scanner;

//Escriu un programa que ens demani un nom de directori
//i llisti tots els fitxers que hi ha a dins.
public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nom del directori (Exemple: /tmp)");
        File path = new File(scanner.nextLine());

        String[] continguts = path.list();
        assert continguts != null;
        for (String contingut : continguts) {
            System.out.println(contingut);
        }

    }
}
