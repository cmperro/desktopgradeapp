package graph;

import org.jgraph.JGraph;

import gradeapp.GraphPrint;

public class PrintTest {

    public static void main(String[] args) {
        GraphTest graphTest = new GraphTest();
        GraphPrint.printComponent(graphTest);
        graphTest.dispose();
    }

}
