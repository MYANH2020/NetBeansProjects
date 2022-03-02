/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drivergraph;

/**
 *
 * @author fansari
 */
public class DriverGraph {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Graph g = new Graph(6);
        Edge e1 = new Edge(1, 2, 10);
        Edge e2 = new Edge(1, 3, 20);
        Edge e3 = new Edge(0, 1, 80);
        g.addEdge(e2);
        g.addEdge(e1);
        g.addEdge(e3);
        System.out.print(g.getAdjList(1));
    }

}
