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


class Graph{

    // implementation of BFS and DFS through the linked List
    ArrayList<Node> nodes;
    
    public Graph(ArrayList<String> vertices, int[][] edges){
        nodes = new ArrayList<>();
        for(int x = 0; x < vertices.size(); x++) nodes.add(new Node(vertices.get(x), x));
        for(int x = 0; x < edges.length; x++){
            for(int y = 0; y < edges[x].length; y++){
                if(edges[x][y] > 0){
                    nodes.get(x).connected.add(nodes.get(y));
                }
            }   
        }
    }
    
    public void BFS(int from, int to){
        Queue<Node> queue = new LinkedList<>();
        queue.add(nodes.get(from));
        nodes.get(from).visited = true;
        while(!queue.isEmpty()){
            Node node = queue.poll();
            System.out.println(node.name);
            if(node.index == to) break;
            for(Node n: node.connected){
                if(!n.visited){
                    queue.add(n);
                    n.visited = true;
                }
            }
        }
    }
    
    
    
    public void DFS(int from, int to){
        Stack<Node> stack = new Stack();
        stack.add(nodes.get(from));
        nodes.get(from).visited = true;
        while(!stack.isEmpty()){
            
            Node node = stack.pop();
            System.out.println(node.name);
            if(node.index == to){
                break;
            }
            
            for(Node n: node.connected){
                if(!n.visited){
                    stack.push(n);
                    n.visited = true;
                }
            }
            
        }
    }
    
    
    private class Node{
        String name;
        boolean visited;
        int index;
        LinkedList<Node> connected;
        public Node(String name, int index){
            this.name = name;
            this.index = index;
            connected = new LinkedList<>();
        }
    }
    
}
