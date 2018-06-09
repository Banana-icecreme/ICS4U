/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unit5;

/**
 *
 * @author Wm.Muir
 */
public class Node implements NodeInterface{
    private String data; 
    private Node next = null;

    public Node(String data) {
        this.data = data;
    }

    @Override
    public Node getNext() {
        try{
        return next; 
        }
        catch (NullPointerException ex){
            return null; 
        }
    }

    @Override
    public void setNext(Node newNode) {
        next = newNode; 
    }

    @Override
    public String getValue() {
        return this.data; 
    }

    @Override
    public String toString() {
        return "Node{" + "data= " + data + '}';
    }
    
    
}
