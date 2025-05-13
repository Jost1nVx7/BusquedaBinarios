/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package www.orellana.gob.ec.busquedabinaria;

/**
 *
 * @author Global Technology Ec
 */
public class BusquedaBinaria {

        public static int busquedaBinaria(int[] arreglo, int valorBuscado) {
        int izquierda = 0;
        int derecha = arreglo.length - 1;

        while (izquierda <= derecha) {
            int medio = izquierda + (derecha - izquierda) / 2;

            if (arreglo[medio] == valorBuscado) {
                return medio; // Encontrado
            }

            if (arreglo[medio] < valorBuscado) {
                izquierda = medio + 1; // Buscar a la derecha
            } else {
                derecha = medio - 1; // Buscar a la izquierda
            }
        }

        return -1; // No encontrado
    }

    public static void main(String[] args) {
        int[] datos = {1, 2, 3, 4, 5, 6, 7};
        int valor = 5;

        int resultado = busquedaBinaria(datos, valor);

        if (resultado != -1) {
            System.out.println("Elemento encontrado en el indice: " + resultado);
        } else {
            System.out.println("Elemento no encontrado.");
        }
    }
}
