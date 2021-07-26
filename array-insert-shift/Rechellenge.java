import java.util.*;
class Rechallenge {
    public static void main(String[] args) {
        insertShiftArray();
    }
    public static void insertShiftArray  (){
        List<Integer> myList = Arrays.asList( 2,4,6,-8);
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        myArray.addAll(myList);
        System.out.println("original Array: "+myArray);
        int myNum = 5;
        myArray.add(2,myNum);
        System.out.println("Output: " +myArray);

    }
}
