package App.Controllers;

import App.Models.Graph;
import App.Models.InitialData;

/**
 * Controlador que se ejecuta al inicio, para crear todos los nodos y arcos del
 * grafo. <br><i>OJO: Se debe ejecutar una sola vez.</i><br>
 * <br>
 * Los datos de los grafos y las aristas se obtienen de 'InitialData'.
 */
public class InitController {

    /**
     * Crear y agregar nodos al grafo.
     */
    public static void addNodes() {
        for (String[] node : InitialData.NODES) {
            Graph.addNode(node[0], node[1]);
        }
    }

    /**
     * Crear y agregar aristas (arcos) al grafo.
     */
    public static void addEdges() {
        for (String[] edge : InitialData.EDGES) {
            Graph.makeEdge(edge[0], edge[1], edge[2], edge[3], Integer.parseInt(edge[4]));
        }
    }

    /**
     * TODO
     * @param args
     */
    public static void main(String[] args) {
        
    }

}
