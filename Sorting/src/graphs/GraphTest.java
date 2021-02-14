package graphs;

public class GraphTest {

	public static void main(String[] args) {
		Graph g = new Graph(7);
		g.addEdge(0, 2, true);
		g.addEdge(0, 1, true);
		g.addEdge(1, 3, true);
		g.addEdge(1, 4, true);
		g.addEdge(2, 5, true);
		g.addEdge(3, 5, true);
		g.addEdge(4, 5, true);
		
		g.dfsRec(0);
	

	}

}
