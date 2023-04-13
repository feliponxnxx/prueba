package ProductoDepuntos;

public class reposi {

	public static void main(String[] args) {
		   
        int[] A = {2, 5, -2};
        int[] B = {3, -5, 1};

        
        if (A.length != B.length) {
            System.out.println("Los arreglos A y B deben tener la misma longitud.");
            return;
        }

      
        int productoPuntos = 0;
        for (int i = 0; i < A.length; i++) {
            productoPuntos += A[i] * B[i];
        }

      
        int productoModulos = 1;
        for (int i = 0; i < A.length; i++) {
            productoModulos *= Math.abs(A[i]) * Math.abs(B[i]);
        }

        
        double Z = (double) productoPuntos / productoModulos;

       
        System.out.println("El producto de puntos es: " + productoPuntos);
        System.out.println("El producto de los módulos es: " + productoModulos);
        System.out.println("La expresión Z es: " + Z);
    }


	}


