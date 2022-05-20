import java.io.*;
import java.io.ObjectInputStream.GetField;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Hashtable;
public class Reader {
    File fs = new File("dato.txt");
    Hashtable<String, String> direct = new Hashtable<String, String>();
    public void process() {
        Scanner sc;
        try {
            FileInputStream fl = new FileInputStream(fs);
            sc = new Scanner(fs); 
        } catch (Exception e) {
            //TODO: handle exception
        }
        while (sc.hasNextLine()) {
           String ml = sc.nextLine();
           String [] sml = ml.split("\\s*"); 
            direct.put(sml[1], sml[2]);
        }
        
    }

public void target() {
    System.out.println("Diga de que a ciudad a que ciudad quiere ir ");
    Scanner sc = new Scanner(System.in);
    String ml = sc.nextLine();
    System.out.println("Diga de que ciudad parte");
    String sl =  sc.nextLine();
    System.out.println("Es"+ml+"-"+sl+"correcto?");
    String in = sc.nextLine();
    if (in == "si"| in == "Si") {
        String connect = ml+"-"+sl; 
        System.out.println("Es Su ruta más corta es"+ direct.get(connect));
    }
    if (in == "no"| in == "No") {
        System.out.println("ponga la opción de nuevo");
    }
    else{

    }
}
}