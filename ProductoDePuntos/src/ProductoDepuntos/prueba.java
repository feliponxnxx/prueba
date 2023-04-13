package ProductoDepuntos;

public class prueba {

	public static void main(String[] args) {
		
		
        int[] A = {1, 2, 3};
        int[] B = {4, 5, 6};

     
        int productoPuntos = calcularProductoDePuntos(A, B);
        System.out.println("El producto de puntos es: " + productoPuntos);

     
        String expresion = obtenerExpresion(A, B);
        System.out.println("La expresión es: " + expresion);
    }

    
    public static int calcularProductoDePuntos(int[] A, int[] B) {
        int producto = 0;
        for (int i = 0; i < A.length; i++) {
            producto += A[i] * B[i];
        }
        return producto;
    }

  
    public static String obtenerExpresion(int[] A, int[] B) {
        StringBuilder expresion = new StringBuilder();
        for (int i = 0; i < A.length; i++) {
            expresion.append(A[i]).append("*").append(B[i]);
            if (i < A.length - 1) {
                expresion.append(" + ");
            }
        }
        return expresion.toString();
    }

	}


