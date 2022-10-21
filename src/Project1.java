import java.io.File;
import java.util.Scanner;

public class Project1 {
   static void ReadCommands(String s, Factory f){
        String[] tokens = s.split(" ");
        if(tokens[0].equals("AF")){
            Product p = new Product(Integer.parseInt(tokens[1]),Integer.parseInt(tokens[2]));
            f.addFirst(p);
        }
    }
    public static void main(String[] args)  throws Exception {
       Factory F = new FactoryImpl();
        File file = new File("input.txt");
        Scanner sc = new Scanner(file);

        while (sc.hasNextLine())
            System.out.println(sc.nextLine());
            ReadCommands(sc.nextLine(),F);
    }
}