public class DFS{
	// implementation of DFS through array
		public static void DFS(ArrayList<String> vertices, int[][] edges, String from, String to) {
			boolean[] visited = new boolean[edges.length];
			int index = vertices.indexOf(from);
			Stack<Integer> stack = new Stack();
			int toIndex = vertices.indexOf(to);
			stack.add(index);
			visited[index] = true;
			while (!stack.isEmpty()) {
				int node = stack.pop();
				System.out.print(vertices.get(node) + " ");
				if (vertices.get(node).equals(to)) {
					return;
				}
				for (int x = 0; x < edges.length; x++) {
					if (edges[node][x] > 0 && !visited[x]) {
						stack.add(x);
						visited[x] = true;

					}
				}
			}
		}
}