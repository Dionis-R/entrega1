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
        int numerosEnFila = 0;
        int numerosEnColumna = 0;
        int x = 0;
        int y = 0;
        int contadorMenu = 2;
        int sumafila = 0;
        int sumacolumna = 0;
        int[][] matriz;


        String messageMenu = ("Elige una opcion del menu \n [2] Poner bomba \n [1]Mostrar matriz \n [0]Salir");
        String menssageEndOfGame = ("Estas seguro de que quieres salir del juego?\n escribe y para salir");

        //Bucle para ingreso de filas
        //Comprobacion de los valores antes de seguir

        do {
            System.out.println("introduce el numero de filas");
            Scanner input = new Scanner(System.in);
            numFilas = input.nextInt();
            if (numFilas < 2 || numFilas > 9 && numColumnas < 2 || numColumnas > 9) {
                System.out.println("el numero de filas tiene que ser 2 o mas y menor que 9");
            }
        } while (numFilas < 2 || numFilas > 9);


        //Bucle para ingreso de columnas
        //Comprobacion de los valores antes de seguir
        do {
            System.out.println("introduce el numero de columnas");
            Scanner input = new Scanner(System.in);
            numColumnas = input.nextInt();
            if (numColumnas < 2 || numColumnas > 9) {
                System.out.println("el numero de columna tiene que ser 2 o mas y menor o igual que 9");
            }
        } while (numColumnas < 2 || numColumnas > 9);


        //Generando la matriz

        System.out.println("el numero de filas es:" + numFilas);
        System.out.println("el numero de columnas es " + numColumnas);
        System.out.println("total =" + (numFilas * numColumnas) + " " + "elementos");


        //Bucle classe Random

        matriz = new int[numFilas][numColumnas];

        for (int filas = 0; filas < matriz.length; filas++) {
            for (int columnas = 0; columnas < matriz[filas].length; columnas++) {
                matriz[filas][columnas] = new Random().nextInt(9 + 1 - 1) + 1;
                System.out.print(matriz[filas][columnas] + " ");
            }

            System.out.println();
        }

        //Bucle del menu


        do {

            System.out.println(messageMenu);             //imprimiendo las opciones del menu


            Scanner input = new Scanner(System.in);      //leyendo valor de entrada de usuario
            userOption = input.nextInt();

            if (userOption < 0 || userOption > 2) {        // condicion para mostrar mensaje
                System.out.println("valor incorrecto!!!");
            }
            switch (userOption) {

                case 0: {
                    System.exit(0);
                }
                case 1:

                    for (int filas = 0; filas < matriz.length; filas++) {
                        for (int columnas = 0; columnas < matriz[filas].length; columnas++) {
                            System.out.print(matriz[filas][columnas] + " ");
                        }

                        System.out.println();
                    }
                    break;

                case 2: {
                    //leyendo los valores de las coordenadas
                    do {

                        //leyendo los valores de la coordenada x
                        //comprobando valores antes de seguir
                        do {

                            System.out.println("introduce la coordenada x");
                            Scanner inputx = new Scanner(System.in);
                            x = input.nextInt();
                            if ((x < 0) || (x >= matriz.length)) {
                                System.out.println("la coordenada x no existe\n" +
                                        "introduce un numero entre 0 y " + " " + (matriz.length - 1));
                            }
                        } while ((x < 0) || (x >= matriz.length));

                        //Leyendo valores en la coordenada y
                        //Comprobando valores antes de seguir

                        do {

                            System.out.println("introduce la coordenada y");
                            Scanner inputy = new Scanner(System.in);
                            y = inputy.nextInt();

                            if ((y < 0) || (y >= (matriz[x].length))) {
                                System.out.println("la coordenada y no existe en la matriz \n" +
                                        "introduce un numero entre 0 y" + " " + (matriz.length - 1));
                            }

                        } while ((y < 0) || (y >= (matriz[x].length)));


                        //Bucle for para recorrer  las filas

                        for (int i = 0; i < (matriz[x].length); i++) {

                            numerosEnFila = matriz[x][i];                          //guardando los numeros de cada fila
                            sumafila += matriz[x][i];                             //incrementando los numeros de cada fila
                            System.out.print(numerosEnFila + "+");                  //imprimiendo los numeros de cada fila


                        }
                        System.out.println("la suma de fila es " + sumafila);     //imprimiendo la suma total

                        // Bucle for para recorrer  las columnas

                        for (int j = 0; j < (matriz.length); j++) {
                            numerosEnColumna = matriz[j][y];                      //guardando los numeros de cada columna
                            sumacolumna += matriz[j][y];                          //incrementando los numeros de cada columna

                            System.out.print(numerosEnColumna + "+");                //imprimiendo los numeros de cada columan

                        }
                        System.out.println("la suma de la columna es" + sumacolumna);       //imprimiendo la suma de la columna

                        //Explosion

                        System.out.println("la explosion es de " + (sumacolumna + sumafila));   //imprimiendo el valor de la explosion.
                        //actualizar la matriz


                        // actualizando filas


                                for (int i = 0; i < (matriz.length); i++) {


                                    for (int j = 0; j < matriz[0].length;j++) {
                                        matriz[i][y] = 0;
                                        matriz[x][j] = 0;


                                        System.out.print(matriz[i][j]);

                                    }
                                    System.out.println();
                                }
                                break;
                    } while ((userOption < 0) || (userOption > 3));              //condicion para volver a mostrar el menu


                }

            }

        } while (userOption < 0 || userOption > 2); ;

    }

    }

