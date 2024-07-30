import java.text.DecimalFormat;
import java.util.Scanner;

public class Run{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        for(int i=0; i<5; i++){
            String input = scanner.nextLine();

            String[] partes = input.split(",");

            int clave = Integer.parseInt(partes[0].trim());

            int nuMin = Integer.parseInt(partes[1].trim());

            float precio = 0;
            switch (clave){
                case 12:
                    precio = 2;
                    break;
                case 15:
                    precio = 2.2f;
                    break;
                case 18:
                    precio = 4.5f;
                    break;
                case 19:
                    precio = 3.5f;
                    break;
                case 23:
                    precio = 6;
                    break;
                case 25:
                    precio = 6;
                case 29:
                    precio = 5;
                    break;
            }

            float costoTotal = precio * nuMin;

            DecimalFormat df = new DecimalFormat("#.##");
            String costoTotalS = df.format(costoTotal);
            System.out.println(costoTotalS);
        }
        scanner.close();
    }
}