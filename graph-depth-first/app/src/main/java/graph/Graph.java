package graph;


import org.w3c.dom.Node;

import java.util.*;

public class Graph <T>{

    Map<Vertex <T>, ArrayList<Vertex<T>>> map = new HashMap<>();

    List<Vertex<T>> depth = new ArrayList<>();

    public Vertex<T> addNode(T value ){

        Vertex vertex = new Vertex( value);
        map.put(vertex,new ArrayList<>());
        return vertex;

    }

     public void addEdge(Vertex nodeOne , Vertex nodeTwo){
        map.get(nodeOne).add(nodeTwo);
        map.get(nodeTwo).add(nodeOne);
     }


     public ArrayList<Vertex> getNodes(){

        if (map.isEmpty()){
            return null;
        }

        ArrayList<Vertex> list = new ArrayList<>();
         list.addAll(map.keySet());
        return list;

     }

     public  ArrayList<Vertex<T>> getNeighbors(Vertex node){
        return map.get(node);
     }

     public int getSize(){
        return map.size();
     }



    public List<Vertex> breadthFirst(Vertex startVertex) {
        Queue<Vertex> queue = new LinkedList<>();
        List<Vertex> visited = new ArrayList<>();

        queue.add(startVertex);
        visited.add(startVertex);

        while (!queue.isEmpty()) {
           Vertex current = queue.remove();

            for (Vertex result : getNeighbors(current) ) {
                if (!visited.contains(result)) {
                    queue.add(result);
                    visited.add(result);
                    System.out.println(result);
                }
            }
        }
        return visited;
    }



    public List<Vertex<T>> depthFirst(Vertex<T> startValue) {
        this.depth.add(startValue);

        if (!map.get(startValue).isEmpty()) {
            for(Vertex<T> data :getNeighbors(startValue) ) {
                if (!depth.contains(data)){
                    depthFirst(data);
                }
            }
        }
        return depth;
    }
}
