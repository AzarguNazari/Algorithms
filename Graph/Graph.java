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
