package App.Models;

import java.util.ArrayList;

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
     * @param c
     * @param cr
     * @param c2
     * @param cr2
     * @param distance
     */
    public static void makeEdge(String c, String cr, String c2, String cr2, int distance) {
        try {
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
        } catch (Exception ex) {
            // TODO
        }

    }

    /**
     * Verificar si existe el nodo en el grafo.
     *
     * @param calle
     * @param cra
     * @return
     */
    public static boolean isNode(String calle, String cra) {
        return NODES.stream().anyMatch((temp) -> (temp.getCalle().equals(calle) && temp.getCra().equals(cra)));
    }

    /**
     * Obtener un nodo del grafo (si existe)
     *
     * @param c
     * @param cr
     * @return
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
            if (temp.A().equals(a) && temp.B().equals(b)) return temp;
        }
        
        return null;
    }
    
    // TERMINAL
    
    /** Mostrar nodos via consola. */
    public static void showNodes() {
        NODES.stream().forEach((temp) -> {
            System.out.println(temp.toString());
        });
    }
    
    /** Mostrar las aristas via consola. */
    public static void showEdges() {
        EDGES.stream().forEach((Edge temp) -> {
            System.out.println(temp.toString());
        });
    } 
}
