package hashtable;

public class HashRepeated {
    public static String repeatedWord (String hashString){

        String[] repeatWords = hashString.split(" ");

        for(int i = 0; i<repeatWords.length; i++){
            for(int h= 0; h<i; h++){

                    if (repeatWords[i].equals(repeatWords[h].toLowerCase()))
                        return repeatWords[i].toLowerCase();
                }
            }

        return "There Is No Repeated Words";
    }


}
