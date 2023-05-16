package lowerbound;

public class LowerBound {

    public static int lowerBound(int[] arr, int val) {
        // crear variable start para e inicializar en 0
        int start = 0;
        // tener el indice del ultimo elemento del array
        int lastElementIndex = arr.length - 1;
        // respuesta default si no se encuentra val = -1
        int answer = -1;

        // iteracion
        while (start <= lastElementIndex) {
            // dividir en dos el array
            int mid = (start + lastElementIndex) / 2;
            // check si el elemento del array en el index mid es menor o igual al valor
            if (arr[mid] <= val) {
                // si es actualizamos el resultado al elemento del medio del array
                answer = arr[mid];
                // sumamos 1 al inicio ya que significa que el elemento se encuentra en la mitad derecha del array
                start = mid + 1;
            } else {
                // sino restamos una al final ya que el elemento estaría en la parte izquierda del array
                lastElementIndex = mid -1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {5,8,9,13,18,21};
        System.out.println(lowerBound(arr, 17));
    }
}
