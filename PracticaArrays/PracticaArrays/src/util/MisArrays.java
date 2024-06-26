package util;

import java.util.Arrays;

public abstract class MisArrays {
	/**
	 * @param notas Un array de enteros que representa las notas.
	 * @return El valor entero de la nota máxima encontrada en el array.
	 * @throws IllegalArgumentException Si el array de notas no esta entre 0 y 10.
	 */
	public static int MaximaNota(int[] notas) {
		int max = notas[0];
		  for (int i=0;i<notas.length;i++) {
		   if (notas[i] <0 || notas[i]>10) {
	 throw new IllegalArgumentException("Las notas deben estar entre 0 y 10");
            }else if(notas[i]>max) {
            	max=notas[i];
              }
		    }
		       return max;
		}

	/**
	 * @param notas Un array de enteros que representa las notas.
	 * @return El valor entero de la nota minima encontrada en el array.
	 * @throws IllegalArgumentException Si el array de notas no esta en 0 y 10.
	 */
public static int MinimaNota(int[] notas) {
		int min = notas[0];
		  for (int i=0;i<notas.length;i++) {
		   if (notas[i] <0 || notas[i]>10) {
	 throw new IllegalArgumentException("Las notas deben estar entre 0 y 10");
            }else if(notas[i]<min) {
            	min=notas[i];
              }
		    }
		       return min;
		}
/**
 * 
 * @param notas Un array de valores float que representan las notas.
 * @return La media de las notas en el array.
 * @throws IllegalArgumentException Si el array de notas no esta en 0 y 10.
 */
public static float mediaNotas(float[] notas) {
	int media = 0;
	  for (int i=0;i<notas.length;i++) {
	   if (notas[i] <0 || notas[i]>10) {
		   throw new IllegalArgumentException("Las notas deben estar entre 0 y 10");
      }
	   media+= notas[i];
        
	    }
	       return media/notas.length;
}	
/**
 * 
 * @param notas Un array de valores entero que representan las notas.
 * @return La mediana de las notas en el array.
 * @throws IllegalArgumentException Si el array de notas no esta en 0 y 10.
 */
public static float medianaNotas(int[] notas) {
	
	  for (int i=0;i<notas.length;i++) {
	   if (notas[i] <0 || notas[i]>10) {
		   throw new IllegalArgumentException("Las notas deben estar entre 0 y 10");
      }
   
	    }
	  Arrays.sort(notas);
	  int[]arrayOrden= notas;
	  int mitad = arrayOrden.length/2;
	  if(arrayOrden.length % 2 ==0) {
		  return(float) (arrayOrden[mitad - 1]+ arrayOrden[(int) mitad])/2;
	  }else {
	       return arrayOrden[mitad];
	  }
 }
}
