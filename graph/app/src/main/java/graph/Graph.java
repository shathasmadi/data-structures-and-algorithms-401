package graph;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Graph <T>{

    Map<Vertex <T>, ArrayList<Vertex<T>>> map = new HashMap<>();


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

}
