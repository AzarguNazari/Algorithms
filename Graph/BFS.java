
public class BFS{
	// implementation of BFS though array
	public static void BFS(ArrayList<String> vertices, int[][] edges, String from, String to) {
			boolean[] visited = new boolean[edges.length];
			int index = vertices.indexOf(from);
			Queue<Integer> queue = new LinkedList<>();
			queue.add(index);
			visited[index] = true;
			while (!queue.isEmpty()) {
				int node = queue.poll();
				System.out.print(vertices.get(node) + " ");
				if (vertices.get(node).equals(to)) {
					return;
				}
				for (int x = 0; x < edges.length; x++) {
					if (edges[node][x] > 0 && !visited[x]) {
						queue.add(x);
						visited[x] = true;

					}
				}
			}
		}
}