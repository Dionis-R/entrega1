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
        int suma = 0;
        int valor = 0;
        int resultado = 0;
        int x = 0;
        int y=0;
        int contadorMenu=2;

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
        /*intruduciendo la coordenada x

        System.out.println("introduce la coordenada x");
        Scanner input = new Scanner(System.in);
        x = input.nextInt();

                           */

        /*introduciendo la coordenada y

        System.out.println("introduce la coordenada y");
        Scanner input1 = new Scanner(System.in);
        y = input1.nextInt();

                                */

        /*comprobando si la coordenada x e y  estan en la matriz

        if((x < matriz.length) && (y < matriz[x].length)) {

            for (int i = 0; i < matriz.length; i++) {

                System.out.print(matriz[x][i]);

            }
            System.out.println("    son los numeros de la fila");

            for (int j = 0; j < matriz[y].length; j++) {

                System.out.print(matriz[j][y]);

            }
            System.out.println("    son los numeros de la columna");

            }else{
                System.out.println("la coodenada x no existe en la matriz");


            }
                                 */
                             //leyendo datos

        do {
            System.out.println("introduce la coordenada x");
            Scanner input = new Scanner(System.in);
            x = input.nextInt();


            System.out.println("introduce la coordenada y");
            Scanner input1 = new Scanner(System.in);
            y = input1.nextInt();

                  //condicion para evaluar la matriz


            if(((x >=0 )&&(x < matriz.length)) && ((y>=0) &&(y < matriz[x].length))) {


                  // bucle for para las filas


                for (int i = 0; i < matriz.length; i++) {

                    System.out.print(matriz[x][i]);

                }
                System.out.println("    son los numeros de la fila");

                // Bucle for para las columnas

                for (int j = 0; j < matriz[y].length; j++) {

                    System.out.print(matriz[j][y]);

                }
                System.out.println("    son los numeros de la columna");
                contadorMenu=0;                                               //variable de control para salir

            }else {
                System.out.println("la coodenada x no existe en la matriz");
            }
            contadorMenu --;                                                  // variable de control decremental

        } while (contadorMenu >0);                                            // condicion para salir



    }


    }

