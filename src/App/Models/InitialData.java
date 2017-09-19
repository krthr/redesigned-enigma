package App.Models;

public class InitialData {

    /**
     * Lista con todos los nodos del mapa.
     */
    public static final String NODES[][] = {
        {"94", "58"}, {"94", "57"}, {"94", "56"}, {"94", "55"}, {"94", "54"}, {"94", "53"},
        {"90b", "57"}, {"90b", "53"}, {"94", "56"}, {"94", "55"},
        {"91", "64c"}, {"91", "64b"}, {"91", "64"}, {"91", "59b"}, {"91", "59"}, {"91", "58"}, {"91", "57"}, {"91", "56"},
    };

    /**
     * Lista con todos los arcos del mapa. <br><br>
     * { "CalleA", "CarreraA", "Calle2", "Carrera2", "Distancia" }
     */
    public static final String EDGES[][] = {
        {"95", "58", "94", "58", "10"}
    };

}
