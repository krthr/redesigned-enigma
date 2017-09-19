package App.Models;

import java.util.ArrayList;

public class Node {
    static int n = 0;
    private final String calle;
    private final String cra;
    private final int id;
    private ArrayList<Node> adya;

    public Node(String c, String cra) {
        this.id = Node.genId();
        this.calle = c;
        this.cra = cra;
    }
    
    static int genId() {
        n++; return n;
    }

    public String getCalle() {
        return calle;
    }

    public String getCra() {
        return cra;
    }

    public int getId() {
        return id;
    }
    
    public void addAdy(Node t) {
        adya.add(t);
    }
    
    @Override
    public String toString() {
        return "(" + this.calle + "," + this.cra + ")";
    }
}
