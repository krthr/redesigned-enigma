package App.Models;

public class Edge {
    private final Node a;
    private final Node b;
    private final int length;

    public Edge(Node a, Node b, int length) {
        this.a = a;
        this.b = b;
        this.length = length;
    }
    
    public Node A() {
        return this.a;
    }
    
    public Node B() {
        return this.b;
    }
    
    public int Length() {
        return this.length;
    }
    
    @Override
    public String toString() {
        return this.a.toString() + "> " + this.length + " >" + this.b.toString();
    }
}
