/**
 * Esta clase permite convertir un numero romano al sistema decimal
 * @author Rafael Luna
 * @version 1.0
 * 			04/05/2016
 *
 */
public class ConversorNumerosRomanos{
	/**
	 * Este metodo es el metodo principal
	 * @param numero: numero que se va a convertir
	 * @return retorna el numero romano convertido al sistema decimal
	 */
	public int convertir(String numero){
		int resultado = 0, tamano;
		tamano = numero.length();
		char[] letra = new char[tamano];
		int[] decimal = new int[tamano];
		obtenerLetras(letra,numero);
		for(int i=0;i<tamano;i++){
			switch(letra[i]){
			case 'I':
				decimal[i]=1;
				break;
			case 'V':
				decimal[i]=5;
				break;
			case 'X':
				decimal[i]=10;
				break;
			case 'L':
				decimal[i]=50;
				break;
			case 'C':
				decimal[i]=100;
				break;
			case 'D':
				decimal[i]=500;
				break;
			case 'M':
				decimal[i]=1000;
				break;
			}
		}
		resultado=sumarNumeros(decimal,tamano);
		return resultado;
	}
	
	/**
	 * Este metodo permite obtener el numero romano separado por letras
	 * @param letras: vector donde se almacenan las letras (digitos) del numero
	 * @param numero: numero que se va a convertir
	 */
	public void obtenerLetras(char letras[], String numero){
		for(int i=0;i<numero.length();i++){
			letras[i]=numero.charAt(i);
		}
	}
	
	/**
	 * Este metodo permite sumar los digitos que fueron convertidos en el metodo principal
	 * @param numeros: vector donde se estan almacenados los digitos convertidos
	 * @param tamano: tamaño (cantidad de digitos) del numero que se va a convertir
	 * @return
	 */
	public int sumarNumeros(int[] numeros, int tamano){
		int suma = 0, i=0, n1,n2;
		do{
			n2=0;
			n1=numeros[i];
			if(i+1<tamano)
				n2=numeros[i+1];
			if(n1<n2){
				n1=n2-n1;
				i++;
			}
			suma+=n1;
			i++;
		}while(i<tamano);
		return suma;
	}
}
