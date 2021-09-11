package hashtable;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashTable <T>{

    Node <T> [] hash;
    int hashSize;

    public HashTable( int hashSize) {
        this.hashSize = hashSize;
        this.hash=new Node[ this.hashSize];
        for (int i = 0; i < this.hashSize ; i++) {
            hash[i]=new Node<>();
             }
    }

    public int hashStringKey(String key){
            int ascii=0;
            for(char latter : key.toCharArray()){
                ascii += (int) latter;
            }
        return ascii % this.hashSize;
    }

    public int hashIntegerKey(int key){
        return key % this.hashSize;
    }

    public void add(T key ,T value) {
        int location = 0;
        if (key instanceof String) {
           location = hashStringKey((String) key);

        }else{
            location = hashIntegerKey((Integer) key);
        }
          Node<T> toAdd = new Node<>( key, value);
           if (hash[location]==null){
               hash[location]=toAdd;
           }else if(hash[location].next==null){
               hash[location].next=toAdd;

           }else{
               toAdd.next=hash[location].next;
               hash[location].next=toAdd;
           }
    }

     public  boolean contains (T key){
         int location = 0;
         boolean result =  false;
         if (key instanceof String) {
             location = hashStringKey((String) key);

         }else{
             location = hashIntegerKey((Integer) key);
         }

         if (hash[location]!= null){
             Node current = hash[location];
             while (current!= null){
                 if (current.key==key){
                     result=true;
                     break;
                 }else{
                     current=current.next;
                 }
             }
         }
         return  result;
     }

     public  String get(T key){
         int location = 0;
         if (key instanceof String) {
             location = hashStringKey((String) key);

         }else{
             location = hashIntegerKey((Integer) key);
         }
         String result = " Wrong Key";
         if(hash[location]!= null){
             Node current=hash[location];
             while (current!= null){
                 if (current.key==key){
                     result= (String) current.value;
                     break;
                 }else {
                     current=current.next;
                 }
             }
         }
         return  result;
     }



}
