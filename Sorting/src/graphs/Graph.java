package graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Graph {

	ArrayList<ArrayList<Integer>> adjList;
	int v; // no. of vertices
	int [] visited;

	public Graph(int size) {
		this.v = size;
		this.adjList = new ArrayList<ArrayList<Integer>>(v);

		for (int i = 0; i < v; i++)
			adjList.add(new ArrayList<Integer>());
		visited = new int[this.v];
	}

	public void addEdge(int start, int end, boolean biDir) {
		this.adjList.get(start).add(end);
		if (biDir) {
			adjList.get(end).add(start);
		}
	}

	public boolean hasEulerianCycle() {
		// if all the vertices are having even degree it implies we are having Eulerian Cycle
		return false;
	}

	public boolean hasEulerianPath() {
		// if we have 0 or 2 vertices with odd degree and rest all are even it implies we are having Eulerian path
		return false;
	}

	public void bfs(int s) {
		int[] captured = new int[this.v];
		int[] visited = new int[this.v];
		int[] parent = new int[this.v];

		captured[s] = 1;
		visited[s] = 1;

		Queue<Integer> q = new LinkedList<Integer>();
		q.add(s);
		while (!q.isEmpty()) {
			int vertex = q.poll();
			System.out.println(vertex);
			captured[vertex] = 1;
			for (int i : adjList.get(vertex)) {
				if (visited[i] != 1) {
					q.add(i);
					visited[i] = 1;
					parent[i] = vertex;
				}
			}

		}

	}
	
	public void dfs(int source) {
		int [] visited = new int [this.v];
		visited[source] = 1;
		
		Stack<Integer> s = new Stack<Integer>();
		s.add(source);
		while (!s.isEmpty()) {
			int vertex = s.pop();
			System.out.println(vertex);
			for (int i : adjList.get(vertex)) {
				if (visited[i] != 1) {
					s.add(i);
					visited[i] = 1;
				}
			}

		}
		
	}
	
	public void dfsRec(int source) {
		visited[source] = 1;
		System.out.println(source);
		for(int i : adjList.get(source)) {
			if(visited[i] == 0) {
				dfsRec(i);
			}
		}
		
	}

}
