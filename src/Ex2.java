import java.io.File;
import java.util.Scanner;

//Escriu un programa que ens demani un nom de directori i una extensió de fitxer i llisti
//tots els fitxers d’aquell directori amb l’extensió donada.
public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nom del directori (Exemple: /home/superior/Imatges)");
        File path = new File(scanner.nextLine());
        System.out.println("Nom de la extansió (Exemple: png)");
        String wantedExtension = scanner.nextLine();

        String[] continguts = path.list();
        assert continguts != null;
        if (path.exists() && path.isDirectory())
            for (String contingut : continguts) {
                String extension = "";

                int index = contingut.lastIndexOf('.');
                if (index > 0) {
                    extension = contingut.substring(index + 1);
                }
                if (extension.equals(wantedExtension))
                    System.out.println(contingut);
            }
        else System.out.println("No existeix un directori amb aquest nom");
    }
    /*if (path.exists() && path.isDirectory())
            for (String contingut : continguts) {
                if (contingut.toLowerCase().endsWith("."))
                    System.out.println(contingut);
            }*/
}
