import java.util.ArrayList;
import java.util.Scanner;

public class CycleDetectionInUndirectedGraph {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        for (int t = 0; t < testCases; t++) {
            int vertices = scanner.nextInt();
            int edges = scanner.nextInt();
            ArrayList<ArrayList<Integer>> adjacencyList = new ArrayList<>();
            for (int i = 0; i < vertices; i++) {
                adjacencyList.add(new ArrayList<>());
            }
            for (int i = 0; i < edges; i++) {
                int u = scanner.nextInt();
                int v = scanner.nextInt();
                adjacencyList.get(u).add(v);
                adjacencyList.get(v).add(u);
            }
            System.out.println(hasCycle(adjacencyList, vertices) ? "1" : "0");
        }
    }

    public static boolean hasCycle(ArrayList<ArrayList<Integer>> adjacencyList, int vertices) {
        boolean[] visited = new boolean[vertices];
        for (int i = 0; i < vertices; i++) {
            if (!visited[i]) {
                if (dfs(adjacencyList, i, -1, visited)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean dfs(ArrayList<ArrayList<Integer>> adjacencyList, int vertex, int parent, boolean[] visited) {
        visited[vertex] = true;
        for (int neighbor : adjacencyList.get(vertex)) {
            if (!visited[neighbor]) {
                if (dfs(adjacencyList, neighbor, vertex, visited)) {
                    return true;
                }
            } else if (neighbor != parent) {
                return true;
            }
        }
        return false;
    }
}
