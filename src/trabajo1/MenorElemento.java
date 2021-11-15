/*} 
 */
package trabajo1;

import java.util.Scanner;

/**
 *
 * William Condori Anconayra
 */
public class MenorElemento {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Elija la cantidad de numeros del Array: ");
		
	    int cantidad = sc.nextInt();
	    
		int [] arreglo = new int[cantidad];
		
		
		System.out.println("El numero minimo es: "+minRec(arreglo,0,arreglo.length-1));
	}

	
	private static int minRec (int A [],int low, int high) {
		if (low == high) return A [low];
		int mid = (low+high)/2;
		return Math.min(minRec(A,low,mid), minRec(A,mid+1,high));
	}
}

