package App.Controllers;

import App.Models.Edge;
import App.Models.Graph;
import App.Models.Node;

public class MainController {
    
    /**
     * Generar la matriz de adyacencia.
     * @return 
     */
    public static int[][] generateAdyacenceMatriz() {
        int tamGraph = Graph.NODES.size();
        int[][] ady = new int[tamGraph][tamGraph];
        
        for (int i = 0; i < tamGraph; i++) {
            for (int j = 0; j < tamGraph; j++) {
                ady[i][j] = Graph.NODES.get(i).isAdy(Graph.NODES.get(j)) ? 1 : 0;
            }
        }
        
        showMatriz(ady);
        return ady;
    }
    
    /**
     * Generar la matriz de pesos.
     * @return 
     */
    public static int[][] generateWeightsMatriz() {
        int tamGraph = Graph.NODES.size();
        int[][] mat = new int[tamGraph][tamGraph];
        
        for (int i = 0; i < tamGraph; i++) {
            for (int j = 0; j < tamGraph; j++) {
                Node a = Graph.NODES.get(i), b = Graph.NODES.get(j);
                Edge edge = Graph.getEdge(a, b);
                mat[i][j] = a.isAdy(b) ?  edge.Length() : -1;
            }
        }
        
        showMatriz(mat);
        return mat;
    }
    
    /**
     *
     * @param matriz
     */
    public static void showMatriz(int[][] matriz) {
        for (int[] matriz1 : matriz) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz1[j] + " ");
            }
            System.out.println("");
        }
    }
    
}
