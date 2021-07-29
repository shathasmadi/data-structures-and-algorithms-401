public class Testing {


    public static void main(String[] args) {
        int[] array1={1,2,3,5};
        int num=5;
        array(array1, num);
        System.out.println(array(array1, num));
    }


    public static int array(int[] array,int num) {
        int max=array.length-1;
        int min=0;
        int mid;

        while(min<=max){
            mid=min+(max-min)/2;
            if(array[mid]==num){
                return mid;
            }else if(num<array[mid]){
                max=mid -1;
            }else {
                min=mid+1;
            }
        }
        return -1;
    }

}