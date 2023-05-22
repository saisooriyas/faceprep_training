package data_structure.algorithm;

import java.lang.*;
import java.util.*;

class floyd_warshall {
    final static int INF = 99999, V = 4;

    void floydWarshall(int[][] dist)
    {
        for(int k =0;k<dist.length;k++){
            for(int i=0;i<dist.length;i++){
                for(int j=0;j<dist.length;j++){
                    if(dist[i][k] + dist[k][j] < dist[i][j]){
                        dist[i][j] = dist[i][k] + dist[k][j];
                    }
                }
            }
        }
        printSolution(dist);
    }

    void printSolution(int[][] dist)
    {
        for (int i = 0; i < V; ++i) {
            for (int j = 0; j < V; ++j) {
                if (dist[i][j] == INF)
                    System.out.print("INF ");
                else
                    System.out.print(dist[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        int[][] graph = {{0,3,INF,7},
                {3,0,2,INF},
                {5,INF,0,1},
                {2,INF,INF,0}};
        floyd_warshall a = new floyd_warshall();
        a.floydWarshall(graph);
    }
}