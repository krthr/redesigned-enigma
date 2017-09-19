package App.Models;

import java.util.ArrayList;

/**
 * Grafo que representa al mapa. Las intersecciones entre calles y carreras son
 * nodos.
 */
public class Graph {

    public static final ArrayList<Node> NODES = new ArrayList<>(); // NODOS
    public static final ArrayList<Edge> EDGES = new ArrayList<>(); // ARISTAS

    /**
     * Añadir nuevo nodo al grafo.
     *
     * @param calle
     * @param cra
     */
    public static void addNode(String calle, String cra) {
        if (!isNode(calle, cra)) {
            NODES.add(new Node(calle, cra));
        }
    }

    /**
     * Unir dos nodos, agregando el peso entre los dos.
     *
     * @param c Calle del nodo A
     * @param cr Carrera del nodo A
     * @param c2 Calle del nodo B
     * @param cr2 Carrera del nodo B
     * @param distance Distancia entre A y B (entero)
     */
    public static void makeEdge(String c, String cr, String c2, String cr2, int distance) {
        Node a, b;
        if (!isNode(c, cr)) {
            a = new Node(c, cr);
            NODES.add(a);
        } else a = getNode(c, cr);

        if (!isNode(c2, cr2)) {
            b = new Node(c2, cr2);
            NODES.add(b);
        } else b = getNode(c2, cr2);

        EDGES.add(new Edge(a, b, distance));
        a.addAdy(b);
    }

    /**
     * Verificar si existe el nodo en el grafo.
     *
     * @param calle Calle del grafo
     * @param cra Carrera del grafo
     * @return Falso o verdadero, si el  nodo existe en el grafo.
     */
    public static boolean isNode(String calle, String cra) {
        return NODES.stream().anyMatch((temp) -> (temp.getCalle().equals(calle) && temp.getCra().equals(cra)));
    }

    /**
     * Obtener un nodo del grafo (si existe)
     *
     * @param c Calle del nodo
     * @param cr Carrera del nodo
     * @return El nodo, si fue encontrado. Nulo si no fue encontrado.
     */
    public static Node getNode(String c, String cr) {
        for (Node temp : NODES) {
            if (temp.getCalle().equals(c) && temp.getCra().equals(cr)) {
                return temp;
            }
        }

        return null;
    }

    /**
     *
     * @param a
     * @param b
     * @return
     */
    public static Edge getEdge(Node a, Node b) {
        for (Edge temp : EDGES) {
            if (temp.A().equals(a) && temp.B().equals(b)) {
                return temp;
            }
        }

        return null;
    }

    // TERMINAL
    /**
     * Mostrar nodos via consola.
     */
    public static void showNodes() {
        NODES.stream().forEach((temp) -> {
            System.out.println(temp.toString());
        });
    }

    /**
     * Mostrar las aristas via consola.
     */
    public static void showEdges() {
        EDGES.stream().forEach((Edge temp) -> {
            System.out.println(temp.toString());
        });
    }
}
