package App.Models;

/**
 * Arista (o arco) entre dos nodos.
 */
public class Edge {
    private final Node a;
    private final Node b;
    private final int length;

    /**
     *  Constructor de las aristas.
     * @param a Nodo inicial
     * @param b Nodo final
     * @param length Distancia entre nodos
     */
    public Edge(Node a, Node b, int length) {
        this.a = a;
        this.b = b;
        this.length = length;
    }
    
    /**
     *  Obtener nodo inicial.
     * @return Nodo inicial.
     */
    public Node A() {
        return this.a;
    }
    
    /**
     * Obtener nodo final.
     * @return Nodo final.
     */
    public Node B() {
        return this.b;
    }
    
    /**
     * Obtener distancia (peso) de la arista.
     * @return Distancia enttre los nodos.
     */
    public int Length() {
        return this.length;
    }
    
    /**
     *  Representar una arista como una cadena de texto.
     * @return
     */
    @Override
    public String toString() {
        return this.a.toString() + "> " + this.length + " >" + this.b.toString();
    }
}
