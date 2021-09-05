/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package insertion.sort;

import java.util.Arrays;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }


    public static void main(String[] args) {
        System.out.println(new App().getGreeting());

        int[] array = {8,4,23,42,16,15};
//        System.out.println(Arrays.toString(insertionSort(array)));
//        System.out.println(Arrays.toString(mergeSort(array)));
        System.out.println(Arrays.toString(quickSort(array,0,5)));



    }

    public static int[] insertionSort(int[] array){
        for(int i = 0;i<array.length;i++){
            int j=i-1;
            int temp = array[i];
            while (j>=0 && temp < array[j]){
                array[j+1] = array[j];
                j=j-1;
            }
            array[j+1] = temp;
        }
        return array;
    }



    public static int[] mergeSort(int[] array){

        if (array.length>1){
            int mid=array.length/2;
            int[] left;
            int[] right;
            right=new int[mid];
            if (array.length%2==0){
                left=new int[mid];
                System.arraycopy(array, mid, right, 0, right.length );
            }
            else {
                left=new int[mid+1];
                System.arraycopy(array, mid+1, right, 0, right.length );
            }

            System.arraycopy(array, 0, left, 0, left.length );

            mergeSort(left);
            mergeSort(right);
            merge(left,right,array);

        }
        return array;
    }

    public static void merge(int[] left,int[] right,int[] array){
        int i=0;
        int j=0;
        int k=0;

        while (i<left.length&&j<right.length){
            if (left[i]<=right[j]){
                array[k]=left[i];
                i++;
            }
            else {
                array[k]=right[j];
                j++;
            }
            k++;
        }
        while (i < left.length) {
            array[k] = left[i];
            i++;
            k++;
        }
        while (j<right.length){
            array[k]=right[j];
            j++;
            k++;
        }

    }

    public static int[] quickSort(int[] array, int left, int right) {
        if(left < right) {
            int partitionIndex = partition(array, left, right);
            quickSort(array, left, partitionIndex - 1);
            quickSort(array, partitionIndex + 1, right);
        }
        return array;
    }

    public static int partition(int[] array, int left, int right) {
        int pivot = array[right];
        int low = left - 1;
        for(int i = left; i < right; i++) {
            if(array[i] - pivot < 0) {
                low++;
                swap(array, i, low);
            }
        }

        swap(array, right, low + 1);
        return low + 1;
    }

    public static void swap(int[] array, int i, int low) {
        int temp = array[i];
        array[i] = array[low];
        array[low] = temp;
    }



















}


