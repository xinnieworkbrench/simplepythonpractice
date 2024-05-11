package Chapter10_Sort;

public class merge_sort {
    public static void main(String[] args){
        int[] arr = new int[]{7,10,5,4,3,2,1};
        merge_sort(arr);

        //Test
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public static void merge_sort(int[] arr){
        int[] helper = new int[arr.length];
        merge_sort(arr, helper, 0, arr.length - 1);
    }
    public static void merge_sort(int[] arr, int[] helper, int low, int high){
        if(low < high){
            int mid = (low + high) / 2;
            merge_sort(arr, helper, low, mid);
            merge_sort(arr, helper, mid+1, high);
            merge(arr,helper,low, mid, high);
        }
    }
    public static void merge(int[] arr, int[] helper, int low, int mid, int high){
        for(int i = low; i <= high; i++){
            helper[i] = arr[i];
        }

        int helperleft = low;
        int helperright = mid + 1;
        int curr = low;

        while(helperleft <= mid && helperright <= high){
            if(helper[helperleft] <= helper[helperright]){
                arr[curr] = helper[helperleft];
                helperleft++;
            }
            else{
                arr[curr] = helper[helperright];
                helperright++;
            }
            curr++;
        }

        int remain = mid - helperleft;
        for(int i = 0; i <= remain; i++){
            arr[curr+i] = helper[helperleft + i];
        }
    }
}
