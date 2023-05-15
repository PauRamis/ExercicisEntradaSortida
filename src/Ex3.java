import java.io.*;
import java.util.Scanner;

//Escriu un programa que ens demani un nom de directori o fitxer i ens digui
//si aquest existeix o no.
public class Ex3 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nom del directori o fitxer (Exemple: /tmp)");
        String line = scanner.nextLine();
        /*File path = new File(scanner.nextLine());
            if (path.exists())
                System.out.println("Existeix");
            else System.out.println("El fitxer o directori no existeix");
*/
        OutputStream os = new FileOutputStream("/tmp/ex10");
        byte[] bytes = line.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            os.write(bytes[i]);
        }
        os.close();
    }
}
