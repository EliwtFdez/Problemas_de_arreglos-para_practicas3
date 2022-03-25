import java.util.Scanner;



/*
Se tienen 3 Arreglos (A, B, C) de “N” posiciones cada uno; 
donde almacenará datos enteros (positivos y/o negativos). 
Se debe crear un 4to Arreglo de 3 posiciones, 
donde almacenará la suma total de los elementos almacenados en cada Arreglo (A, B, C)
*/


public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);        

        int [] ArregloA = new int [5];
        int [] ArregloB = new int [5];         // los 3 array 
        int [] ArregloC = new int [5];
        int [] Arreglo4to = new int [5];
        int sumaA = 0, sumaB = 0, sumaC = 0;    

             /*  iteradores;  */
        int i,j,k,z;

                // ======================== va a ingresar los datos al array ========================//
        
        System.out.println("Ingrese numeros para arreglo A: ");
        for ( i = 0; i < ArregloA.length; i++) 
        {
            System.out.println("Ingrese el valor de la posicion " + i );
            ArregloA [i] = teclado.nextInt();
                sumaA += ArregloA[i] ;      //esto suma los numeros que hayan entrado al arreglo
        }

                    // para array B
        System.out.println("Ingrese numeros para arreglo B: ");
        for ( j = 0; j < ArregloB.length; j++) 
        {
            System.out.println("Ingrese el valor de la posicion " + j );
            ArregloB [j] = teclado.nextInt();
                sumaB += ArregloB[j] ;      //esto suma los numeros que hayan entrado al arreglo
        }

                // para array C
        System.out.println("Ingrese numeros para arreglo C: ");
        for ( k = 0; k < ArregloC.length; k++) 
        {
            System.out.println("Ingrese el valor de la posicion " + k );
            ArregloC [k] = teclado.nextInt();
                sumaC += ArregloC[k] ;      //esto suma los numeros que hayan entrado al arreglo
        }

                        // finalizamos imprimiendo los data
            System.out.println("\n");

            System.out.print("\n Arreglo A: .....");
            for (i = 0; i < ArregloA.length; i++) {                  //se imrpime el arreglo A de forma original
                System.out.println("\n");
                System.out.print("Valor en la posicion [" + i + "] --> ");
                System.out.print (ArregloA[i]);
            }

            System.out.print("\n Arreglo B: .....");
            for (j = 0; j < ArregloC.length; j++) {                  //se imrpime el arreglo B de forma original
                System.out.println("\n");
                System.out.print("Valor en la posicion [" + j + "] --> ");
                System.out.print (ArregloB[j]);
            }
           
            System.out.print("\n Arreglo C:  .....");
            
            for (k = 0; k < ArregloB.length; k++) {                  //se imrpime el arreglo C de forma original
                System.out.println("\n");
                System.out.print("Valor en la posicion [" + k + "] --> ");
                System.out.print (ArregloB[k]);
            }


            System.out.print("\n");
            Arreglo4to [0]=sumaA;
            Arreglo4to [1]=sumaB;
            Arreglo4to [2]=sumaC;

        System.out.println("Suma de arreglo A: " +  Arreglo4to [0]);
        System.out.println("Suma de arreglo B: " +  Arreglo4to [1]);
        System.out.println("Suma de arreglo C: " +  Arreglo4to [2]);


    }
}
