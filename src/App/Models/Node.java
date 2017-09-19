package App.Models;

import java.util.ArrayList;

/**
 * Nodo del grafo. Cada nodo tiene: - La calle - La carrera - Un identificador
 * (id) - Nodos adyacentes
 */
public class Node {

    static int n = 0;
    private final String calle;
    private final String cra;
    private final int id;
    private final ArrayList<Node> adya;

    /**
     * Constructor.
     * @param c Calle
     * @param cra Carrera
     */
    public Node(String c, String cra) {
        this.id = Node.genId();
        this.calle = c;
        this.cra = cra;
        this.adya = new ArrayList<>();
    }

    /**
     * Autoaumentar y asignar id
     * @return
     */
    static int genId() {
        n++;
        return n;
    }

    /**
     * Obtener calle del nodo.
     * @return Calle
     */
    public String getCalle() {
        return calle;
    }

    /**
     * Obtener carrera.
     * @return Carrera del nodo
     */
    public String getCra() {
        return cra;
    }

    /**
     * Obtener Id del Nodo.
     *
     * @return Numero de identificacion del nodo.
     */
    public int getId() {
        return id;
    }

    /**
     * Añadir un nodo adyacente.
     *
     * @param t Nodo adyacente.
     */
    public void addAdy(Node t) {
        adya.add(t);
    }

    /**
     * Verificar si un nodo es adyacente.
     *
     * @param c
     * @param cr
     * @return Falso o verdadero.
     */
    public boolean isAdy(String c, String cr) {
        return adya.stream().anyMatch((temp) -> (temp.getCalle().equals(c) && temp.getCra().equals(cr)));
    }

    /**
     * Verificar si un nodo es adayante.
     *
     * @param node Nodo
     * @return Falso o verdadero.
     */
    public boolean isAdy(Node node) {
        return adya.stream().anyMatch((temp) -> (node.calle.equals(temp.calle) && node.cra.equals(temp.cra)));
    }

    /**
     * Generar representacion del nodo.
     *
     * @return
     */
    @Override
    public String toString() {
        return "(" + this.calle + "," + this.cra + ")";
    }

}
