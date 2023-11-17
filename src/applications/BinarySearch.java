package applications;

public class BinarySearch {
    public static int search(int item , int [] list){
        int start = 0;
        int end = list.length-1;
        while (start <= end){
            int middle = ( start + end ) / 2 ;
            if (list[middle] == item)
                return middle;
            if (list[middle] > item){
                end = middle-1;
            }else
                start = middle+1;
        }
        return -1;
    }
}
