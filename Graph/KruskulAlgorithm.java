
import java.util.ArrayList;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

public class Kruskol {

    public static void KruskolAlgorithm(int[][] graph){
        int[][] graphCopy = graph.clone();
        PriorityQueue<Pair> queue = new PriorityQueue<>();
        for(int x = 0; x < graphCopy.length; x++){
            for(int y = 0; y < graphCopy[x].length; y++){
                if(graphCopy[x][y] > 0){
                    queue.add(new Pair(x, y, graphCopy[x][y]));
                    graphCopy[x][y] = -1;
                }
            }
        }
        
        Set<Integer> sets = new HashSet<>();
        Set<Pair> finalList = new HashSet<>();
        for(Pair p : queue){
            if(!sets.contains(p.x)){
                sets.add(p.x);
                finalList.add(p);
            }
            if(!sets.contains(p.y)){
                sets.add(p.y);
                finalList.add(p);
            }
        }
        System.out.println("The final list are");
        finalList.forEach((p) -> {
            System.out.println("From " + p.x + " to " + p.y + " = " + p.value);
        });
    }

    private static class Pair implements Comparable<Pair>{
        int x, y;
        double value;
        Pair(int x , int y, double value){
            this.x = x;
            this.y = y;
            this.value = value;
        }

        @Override
        public int compareTo(Pair o) {
            return (value >= o.value)? 1: -1;
        }
    }
    
    
    public static void primAlgorithm(int[][] graph){
        int[] parents = new int[graph.length];
        for(int x = 0; x < parents.length; x++) parents[x] = x;
        double[] values = new double[graph.length];
        for(int x = 0; x < values.length; x++) values[x] = Integer.MAX_VALUE;
        
    }
    
}