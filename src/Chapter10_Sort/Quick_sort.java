package Chapter10_Sort;

public class Quick_sort {

    public static void main(String[] args){
        int[] arr = new int[]{7,6,5,4,3,2,1};

        quick_sort(arr,0,arr.length-1);

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static void quick_sort(int[] arr, int start, int end){
        int left = start;
        int right = end;
        int target = arr[(start + end)/2];

        if(start >= end){
            return;
        }
        while(left <= right){
            while(left <= right && arr[left] < target){
                left++;
            }

            while ((left <= right) && arr[right] > target){
                right--;
            }
            if(left <= right){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }
        quick_sort(arr, start,right);
        quick_sort(arr,left,end);

    }
}
