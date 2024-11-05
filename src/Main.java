//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Random;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {

        /* Declaracion de variables */

        int numFilas = 0;
        int numColumnas = 0;
        int userOption;
        int suma =0;
        int valor=0;
        int resultado =0;
        String messageMenu = ("Elige una opcion del menu \n [2] Poner bomba \n [1]Mostrar matriz \n [0]Salir");
        String menssageEndOfGame = ("Estas seguro de que quieres salir del juego?\n escribe y para salir");

        /* Bucle para el ingreso de informacion del usuario*/

        do {
            System.out.println("introduce el numero de filas");
            Scanner input = new Scanner(System.in);
            numFilas = input.nextInt();
            System.out.println("introduce el numero de columnas");
            numColumnas = input.nextInt();
            if (numFilas < 1 || numFilas > 9 && numColumnas < 1 || numColumnas > 9) {
                System.out.println("el valor introdocido no es correcto");
            }

        } while (numFilas < 1 || numFilas > 9 && numColumnas < 1 || numColumnas > 9);


        //Generando la matriz

        System.out.println("el numero de filas es:" + numFilas);
        System.out.println("el numero de columnas es " + numColumnas);
        System.out.println("total =" + (numFilas * numColumnas) + " " + "elementos");


        //Bucle classe Random

        int[][] matriz = new int[numFilas][numColumnas];

        for (int filas = 0; filas < matriz.length; filas++) {
            for (int columnas = 0; columnas < matriz[filas].length; columnas++) {
                matriz[filas][columnas] = new Random().nextInt(9 + 1 - 1) + 1;
                System.out.print(matriz[filas][columnas] + " ");
            }

            System.out.println();
        }

        int fila= 1;

        for (int i = 0; i < matriz.length; i++) {


            System.out.print(matriz[fila][i] +=valor);
              resultado =i+valor;
        }
            System.out.println();
        System.out.println();
        System.out.println(resultado);

        }


    }