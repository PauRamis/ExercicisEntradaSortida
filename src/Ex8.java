import java.io.File;
import java.util.List;
import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nom del directori (Exemple: /tmp)");
        String dir = scanner.nextLine();

        File path = new File(dir);
        if (!path.exists() || !path.isDirectory()){
            throw new RuntimeException("No existeix aquest directori");
        }

        llistaRecursiu(path);
    }

    private static void llistaRecursiu(File path) {
        File[] list = path.listFiles();
        if (path == null) return;
        for (int i = 0; i < list.length; i++) {
            File f = list[i];
            if (f.isDirectory()){
                //Directori
                llistaRecursiu(f);
            } else {
                //Fitxer
                System.out.println(f);
            }
        }
    }
}

