

import java.io.*;
import java.util.*;


// Gimcana:


/* Simularem una petita gimcana de punts. Donada una matriu d'enters amb posicions buides i una posició inicial de sortida, digues quantes posicions tardes en passar tots els punts.

Desde la posició de sortida aniràs a la posició amb un 1, d'aquesta aniràs a la posició 2, després a la posició 3, fins a la última posició. S'entra com a paràmetre quantes posicions contindrà el tauler.

Es tracta que s'imprimeixi el nombre de caselles que s'han de recorre per passar per tots els punts de forma ordenada.

Input Format

N: enter tamany de la matriu. M: enter nombre de punts de la gimanca. S'ha de mostrar una matriu amb els M punts situats. (si per exemple M=5, dins la matriu hi ha d'haver 1, 2, 3, 4, 5). (x,y): enters amb la posició de sortida.

Constraints

No n'hi ha.

Output Format

S'imprimeix el nombre de passos necessaris per completar tot el recorregut.

Sample Input 0

4 3
0 0 1 0
2 0 0 0
0 0 0 0
0 0 0 3
0 0
Sample Output 0

10
Explanation 0

Es comença a la posició (0,0) D'aquesta posició fins a la posició on hi ha un 1 cal recorre 2 caselles De la posició 1 a la posició 2 cal recorre 3 caselles (2 horitzontals i una vertical) De la posició 2 a la posició 3 cal recorre 5 caselles (2 en vertical baixant i 3 posicions en horitzontal.)

En total per completar la gimcana són necessaris: 2 + 3 + 5 = 10 passos.

Sample Input 1

5 5
1 0 0 0 0
0 2 0 5 0
0 0 4 0 0
0 0 0 0 3
0 0 0 0 0
3 0
Sample Output 1

15
Explanation 1

De la posició inicial al punt 1: 3 passos Del punt 1 al punt 2: 2 passos Del punt 2 al punt 3: 5 passos Del punt 3 al punt 4: 3 passos Del punt 4 al punt 5: 2 passos En total 15 passos

 */

public class Solution
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int grosor = sc.nextInt();
        int pasosASeguir = sc.nextInt();
        int [][] gimcana = new int [grosor][grosor];


        for (int filas = 0; filas < grosor; filas++)
        {
            for(int columnas = 0; columnas < grosor; columnas++)
            {
                gimcana[filas][columnas] = sc.nextInt();
            }
        }
        int estoyX = sc.nextInt();
        int estoyY = sc.nextInt();
        int pasos = 0;

        for (int num = 1; num <= pasosASeguir; num++ )
        {
            for (int filas = 0; filas < grosor; filas++)
            {
                for(int columnas = 0; columnas < grosor; columnas++)
                {
                    if (gimcana[filas][columnas] == num)
                    {
                        pasos = pasos + Math.abs(filas-estoyX) + Math.abs(columnas-estoyY);
                        estoyX = filas;
                        estoyY = columnas;
                    }
                }
            }
        }
        System.out.println(pasos);
    }
}
