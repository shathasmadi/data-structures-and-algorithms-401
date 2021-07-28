
import java.util.Arrays;
class Rechallenge {
    

 
    
            static int[] testArr = { 1, 2, 3, 4, 5 };
    
            public static void main(String[] args) {
                insertShiftArray(testArr, 10);
            }
    
            public static void insertShiftArray(int[] arr, int num) {
                int[] newArr = new int[arr.length + 1];
    
                for (int i = 0; i < newArr.length; i++) {
                    if (arr.length % 2 == 0) {
                        if (i < arr.length / 2) {
                            newArr[i] = arr[i];
                        } else if (i == arr.length / 2) {
                            newArr[i] = num;
                        } else {
                            newArr[i] = arr[i - 1];
                        }
                    } else {
                        if (i < arr.length / 2 + 1) {
                            newArr[i] = arr[i];
                        } else if (i == arr.length / 2 + 1) {
                            newArr[i] = num;
                        } else {
                            newArr[i] = arr[i - 1];
                        }
                    }
                }
    
                System.out.println("old Array: " + Arrays.toString(arr));
                System.out.println("new Array: " + Arrays.toString(newArr));
            }
        }