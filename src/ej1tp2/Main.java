package ej1tp2;

public class Main {

	public static void main(String[] args) {
		
		int[] array = {0,1,3,2,6};//FALSE
		int[] a = {1,4,5,6,7};//TRUE
		int[] b = {8,5,5,2,1};//TRUE
		int[] c = {8,5,5,2,3};//FALSE
		ComprobadorOrdenamiento z = new ComprobadorOrdenamiento();
		
		System.out.println(z.comprobar(array));
		System.out.println(z.comprobar(a));
		System.out.println(z.comprobar(b));
		System.out.println(z.comprobar(c));
	}

}
