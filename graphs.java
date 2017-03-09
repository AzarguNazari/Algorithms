static boolean visited = new boolean[numberOfNodes];
public static void dfs(int[][] graph, int start){
   visited[start] = true;
   System.out.println(start);
   for(int x = 0; x < graphs.length; x++){
      if(graph[start][x] > 0 && !visited[x]){
         dfs(graph, x);
      }
   }
}

public static void bfs(int[][] graph, int start){
   boolean visited = new boolean[visited];
   visited[start] = true;
   Queue<Integer> queue = new LinkedList<>();
   queue.add(start);
   while(!queue.isEmpty()){
      int temp = queue.top();
      System.out.println(temp);
      for(int x = 0; x < graphs.length; x++){
         if(graph[temp][x] > 0 && !visited[x]){
            queue.add(x);
            visited[x] = true;
         }
      }
   }
}
public static boolean find(int first, int second, int[] array){
        return array[first] == array[second];
    }
    
    public static void union(int[] parents, int first, int second){
         int pid = parents[first];
         for(int x = 0; x < parents.length; x++){
             if(parents[x] == pid) parents[x] = parents[second];
         }
    }

public static void dfs(int[][] graph, int start){
        boolean[] visited = new boolean[graph.length];
        Stack<Integer> stack = new Stack();
        visited[start] = true;
        stack.push(start);
        while(!stack.isEmpty()){
            int top = stack.pop();
            System.out.println(top);
            for(int x = 0; x < graph.length; x++){
                if(graph[top][x] > 0 && !visited[x]){
                    stack.push(x);
                    visited[x] = true;
                }
            }
        }
    }

   public static void main(String[] arg){
      ArrayList<node> nodes = new ArrayList<>(9);
        nodes.add(new node(0, 1, 4));
        nodes.add(new node(0, 7, 8));
        nodes.add(new node(1, 2, 8));
        nodes.add(new node(1, 7, 11));
        nodes.add(new node(7, 8, 7));
        nodes.add(new node(6, 7, 1));
        nodes.add(new node(2, 8, 2));
        nodes.add(new node(6, 8, 6));
        nodes.add(new node(5, 6, 2));
        nodes.add(new node(2, 5, 4));
        nodes.add(new node(2, 3, 7));
        nodes.add(new node(3, 4, 9));
        nodes.add(new node(4, 5, 10));
        nodes.add(new node(3, 5, 14));
        
        int[] visited = new int[9];
        for(int x = 0; x < visited.length; x++) visited[x] = x;
        Collections.sort(nodes);
        
        ArrayList<node> finalResult = new ArrayList<>();
        for(node n: nodes){
            if(!find(n.from, n.to, visited)){
                union(visited, n.from, n.to);
                finalResult.add(n);
            }
        }
       System.out.println(finalResult);
   }
}

class node implements Comparable<node>{
    int from, to, value;
    public node(int from, int to, int value){
        this.from = from;
        this.to = to;
        this.value =value;
    }

    @Override
    public int compareTo(node o) {
        return value - o.value;
    }
    
    
    @Override
    public String toString(){
        return "From: " + from + " > To: " + to + " = " +  value + " \n";
    }
}
