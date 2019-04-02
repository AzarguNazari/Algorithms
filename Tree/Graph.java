/*
 * The Linked List Graph is implemented on a this class
	@author Hazar Gul Nazari
 */
package LinkedListGraph;

import java.util.LinkedList;

public class Graph {

    
    private LinkedList<Node> list;
    
    public Graph(){
        list = new LinkedList<>();
    }
    
    public void addEdge(String name){
        if(exist(name) != null){
            System.out.println("Sorry! the " + name + " is already exist in list");
        }
        else{
            list.add(new Node(name));
        }
    }
    
    public Node exist(String city){
        for(Node n: list){
            if(n.getName().equalsIgnoreCase(city)) return n;
        }
        return null;
    } 
    
    public void addEdge(String city1, String city2){
        Node first = exist(city1);
        Node second = exist(city2);
        if(first != null && second != null){
           first.getConnected().add(city2);
           second.getConnected().add(city1);
        }
        else{
            System.out.println("Sorry! " + city1 + " or " + city2 + " is not existed in graph");
        }
    }
    
    public void delete(String city){
        Node found = exist(city);
        if(found != null){
            list.remove(found);
            for(Node n: list){
                if(n.getConnected().contains(city)){
                   n.getConnected().remove(city);
                }
            }
        }
        else{
            System.out.println("Sorry! the " + city + " is not exist in Graph");
        }
    }
    
    public void deleteEdge(String city1, String city2){
        Node first = exist(city1);
        Node second = exist(city2);
        if(first != null && second != null){
           first.getConnected().remove(city2);
           second.getConnected().remove(city1);
        }
        else{
            System.out.println("Sorry! " + city1 + " or " + city2 + " is not existed in graph");
        }
    }
 
    public void display(){
        for(Node n: list){
            System.out.println(n);
        }
    }
}
