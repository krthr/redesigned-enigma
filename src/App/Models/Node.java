package App.Models;

import java.util.ArrayList;
import java.util.Objects;

public class Node {
    static int n = 0;
    private final String calle;
    private final String cra;
    private final int id;
    private ArrayList<Node> adya;

    /**
     *
     * @param c
     * @param cra
     */
    public Node(String c, String cra) {
        this.id = Node.genId();
        this.calle = c;
        this.cra = cra;
        this.adya = new ArrayList<>();
    }
    
    static int genId() {
        n++; return n;
    }

    /**
     *
     * @return
     */
    public String getCalle() {
        return calle;
    }

    /**
     *
     * @return
     */
    public String getCra() {
        return cra;
    }

    /**
     * Obtener Id del Nodo.
     * @return Numero de identificacion del nodo.
     */
    public int getId() {
        return id;
    }
    
    /**
     * Añadir un nodo adyacente.
     * @param t Nodo adyacente.
     */
    public void addAdy(Node t) {
        adya.add(t);
    }
    
    /**
     * Verificar si un nodo es adyacente.
     * @param c
     * @param cr
     * @return Falso o verdadero.
     */
    public boolean isAdy(String c, String cr) {
        return adya.stream().anyMatch((temp) -> (temp.getCalle().equals(c) && temp.getCra().equals(cr)));
    }
    
    /**
     * Verificar si un nodo es adayante. 
     * @param node Nodo
     * @return 
     */
    public boolean isAdy(Node node) {
        return adya.stream().anyMatch((temp) -> (node == temp));
    }
  
    // OVERRIDE
    
    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "(" + this.calle + "," + this.cra + ")";
    }

}
