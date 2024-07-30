import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        
        EdadException edEx = new EdadException();

         Scanner scanner = new Scanner(System.in);

        try{
            System.out.print("Ingrese la edad: ");
            int edad = scanner.nextInt();
            edEx.validadEdad(edad);
        }catch(NullPointerException ex) {
            ex.printStackTrace();
            System.out.println("Entre al catch");
            System.out.println(ex.getMessage());
        }catch(Exception ex){
            ex.printStackTrace();
        }
        finally{
            System.out.println("Finally");
            scanner.close();
        }

        System.out.println("continuacion del programa en java");
    }    
}
