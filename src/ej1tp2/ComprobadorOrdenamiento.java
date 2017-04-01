package ej1tp2;

public class ComprobadorOrdenamiento {
	int[] array;
	boolean answer = false;
	public String comprobar(int[] a) {
		this.array = a;
		if (this.comprobarAscendente(0)){
			return "Está ordenado ascendentemente";
		}else if(this.comprobarDecendente(0)) {
			return "Está ordenado decendentemente";
		
		} else {
			return "No está ordenado";
		}
	}

	private boolean comprobarDecendente(int i) {
		
		if (i < array.length-1) {
			if (array[i] >= array[i + 1]) {
				this.comprobarDecendente(i + 1);
			} else {
				answer= false;
			}
		} else {
			answer = true;
		}
		return answer;
	}

	private boolean comprobarAscendente(int i) {
		
		if (i < array.length-1) {
			if (array[i] <= array[i + 1]) {
				this.comprobarAscendente(i + 1);
			} else {
				answer= false;
			}
		} else {
			answer = true;
		}
		return answer;
	}
}
