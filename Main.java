import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Diccionario diccionario = new Diccionario();
        Scanner input = new Scanner(System.in);
        diccionario.readFile();
        Boolean on = true;

        while (on){
            System.out.println("\n Diccionario - English - Español - Français");
            System.out.println("1. Ver diccionario");
            System.out.println("2. Traducir texto");
            System.out.println("3. Exit");
    
            int seleccion = Integer.parseInt(input.nextLine());
    
            switch(seleccion){
            case 1:
                System.out.println("\n Mostrar Diccionario");
                System.out.println("Ingresa el idioma");
                System.out.println("1. English");
                System.out.println("2. Español");
                System.out.println("3. Français");
    
                int choice = Integer.parseInt(input.nextLine());
                diccionario.mostrarDiccionario(choice);
                break;
    
            case 2:
                System.out.println("\n Traducir texto");
                System.out.println("Ingresa el idioma de entrada: ");
                System.out.println("1. English");
                System.out.println("2. Español");
                System.out.println("3. Français");
    
                int entrada = Integer.parseInt(input.nextLine());
    
                System.out.println("Ingresa el idioma de salida: ");
                System.out.println("1. English");
                System.out.println("2. Español");
                System.out.println("3. Français");
    
                int salida = Integer.parseInt(input.nextLine());
    
                diccionario.traducir(entrada, salida);
                break;
    
            case 3:
                System.out.println("\n Saliendo del Diccionario");
                on = false;
                break;
                
            default:
                System.out.println("No es una opcion valida...");
                break;
            }

        }
        

    }

}
