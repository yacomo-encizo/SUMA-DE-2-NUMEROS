/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package suma_dos_numeros;
import java.io.*;
/**
 *
 * @author STEFANY
 */
public class Suma_dos_numeros {

	public static void main(String args[]) throws IOException {
		BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
		double numero1;
		double numero2;
		double resultado;
		System.out.println("ingrese el primer valor");
		numero1 = Double.parseDouble(bufEntrada.readLine());
		System.out.println("ingrese el segundo valor");
		numero2 = Double.parseDouble(bufEntrada.readLine());
		resultado = numero1+numero2;
		System.out.println("el resultado de la suma es:");
		System.out.println(resultado);
	}


}
