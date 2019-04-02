package LinkedListGraph;

import java.util.LinkedList;

/**
	* 
	*	@author Hazargul Nazari
	*/

public class Node {

    private String name;
    private LinkedList<String> connected;
    
    public Node(String name){
        this.name = name;
        connected = new LinkedList<>();
    }

    public String getName() {
        return name;
    }

    public LinkedList<String> getConnected() {
        return connected;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    @Override
    public String toString(){
        return this.name + " -> " + this.connected;
    }
}
