package data_structure.graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class dijsktra {
    static void addEdge(ArrayList<ArrayList<Integer> > adj,
                        int u, int v, int w)
    {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    static void printAdjacencyList(ArrayList<ArrayList<Integer>> adj)
    {
        for (int i = 0; i < adj.size(); i++) {
            System.out.println("Adjacency list of " + i);
            for (int j = 0; j < adj.get(i).size(); j++) {
                System.out.print(adj.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

    static void dijkstra(ArrayList<ArrayList<Integer>> adj){
        int[] dist = new int[adj.size()];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[0] = 0;
        boolean[] fin = new boolean[adj.size()];
        for(int i=0;i<adj.size();i++){
            int u = minDistance(dist,fin);
            fin[u] = true;
            for(int j=0;j<adj.get(u).size();j++){
                int v = adj.get(u).get(j);
                if(!fin[v] && dist[u]!=Integer.MAX_VALUE && dist[u]+1<dist[v]){
                    dist[v] = dist[u]+1;
                }
            }
        }
        for(int i=0;i<adj.size();i++){
            System.out.println(i+" "+dist[i]);
        }
    }

    private static int minDistance(int[] dist, boolean[] fin) {
        int min = Integer.MAX_VALUE;
        int min_index = -1;
        for(int i=0;i<dist.length;i++){
            if(!fin[i] && dist[i]<=min){
                min = dist[i];
                min_index = i;
            }
        }
        return min_index;
    }

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int V = 5;
        ArrayList<ArrayList<Integer> > adj = new ArrayList<ArrayList<Integer> >(V);
        for (int i = 0; i < V; i++)
            adj.add(new ArrayList<Integer>());

        addEdge(adj, 0, 1, 1);
        addEdge(adj, 0, 4, 1);
        addEdge(adj, 1, 2, 1);
        addEdge(adj, 1, 3, 1);
        addEdge(adj, 1, 4, 1);
        addEdge(adj, 2, 3, 1);
        addEdge(adj, 3, 4, 1);
        printAdjacencyList(adj);
        dijkstra(adj);
    }
}