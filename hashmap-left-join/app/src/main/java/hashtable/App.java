/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package hashtable;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());


//
//        HashTable test = new HashTable(10);
//
//        test.add(0,"test adding");
//        System.out.println(Arrays.toString(test.hash));
//        System.out.println(test.hash[0].value.toString());
//        System.out.println(test.get(0));



        HashRepeated hash =new HashRepeated();
        String hashWords ="\" It was the best of times, it was the worst of times, it was the age of wisdom, it was the age of foolishness, it was the epoch of belief, it was the epoch of incredulity, it was the season of Light, it was the season of Darkness, it was the spring of hope, it was the winter of despair, we had everything before us, we had nothing before us, we were all going direct to Heaven, we were all going direct the other way – in short, the period was so far like the present period, that some of its noisiest authorities insisted on its being received, for good or for evil, in the superlative degree of comparison only...\"";
        System.out.println( hash.repeatedWord(hashWords));

    }

    public static Map<String,List<String>> leftJoins(Map<String,String> mapOne, Map<String,String> mapTwo){
        Map<String,List<String>> finalResult=new HashMap<>();

        mapOne.forEach((key,value)->{
            finalResult.put(key, Arrays.asList(value, mapTwo.getOrDefault(value, "null")));
        });

        return finalResult;

    }

}