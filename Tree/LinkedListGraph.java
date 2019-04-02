/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedListGraph;

import java.util.Scanner;

/**
 *
 * @author Hazar Gul Nazari
 * 
 */
public class LinkedListGraph {

    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        
        Graph graph = new Graph();
        
        OUTER:
        while(true){
            System.out.println("-------------------------------------------------------------------------------------");
            System.out.println("1. Insert a vertex into the list");
            System.out.println("2. Add adjacent vertex to any vertex");
            System.out.println("3. Delete a vertex from the list");
            System.out.println("4. Delete an edge i.e. adjacent vertex of any vertex");
            System.out.println("5. Print all vertices and their adjacent vertices in the graph (i.e. complete graph)");
            System.out.println("6. Quit");
            System.out.println("-------------------------------------------------------------------------------------");
            System.out.print("\tEnter The Option: ");
            int option = input.nextInt();
            
            switch(option){
            
                case 1:
                    System.out.print("Enter the city Name: ");
                    String city = input.next();
                    graph.addEdge(city);
                    break;
                case 2:
                    
                    System.out.print("Enter Source : ");
                    String city1 = input.next();
                    System.out.print("Enter Distination: ");
                    String city2 = input.next();
                    graph.addEdge(city1, city2);
                    System.out.println("From " + city1 + " To " + city2 + " there is edge (connection)");
                    break;
                case 3:
                    System.out.print("Enter the city to be deleted: ");
                    city = input.next();
                    graph.delete(city);
                break;
                case 4:

                    System.out.print("Enter Source : ");
                    city1 = input.next();
                    System.out.print("Enter Distination: ");
                    city2 = input.next();
                    graph.addEdge(city1, city2);
                    System.out.println("From " + city1 + " To " + city2 + " there is no edge (connection)");
                break;
                case 5:
                    graph.display();
                break;
                case 6:

                break OUTER;
               
                
            }
            
        }
        
        
    }
    
}
