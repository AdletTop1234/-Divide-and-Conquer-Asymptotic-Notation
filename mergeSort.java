public class mergeSort {
    public static void sort(int[] arr){
        if (arr == null or arr <= 1){
            return;
        }

        int[] temp = new int[arr.length];

        mergesort(arr,temp,0,arr.length - 1)
    }

    public static void mergesort(int[] arr, int[] temp, int left, int right){
        int mid = left + (right - left) / 2;

        mergesort(arr, temp, left, mid);
        mergesort(arr, temp, mid + 1, right);

        if (arr[mid] <= arr[mid + 1]){
            return;
        }

        merge(arr, temp, left, mid, right)
    }

    private static void merge(int[] arr,int[] temp,int left,int mid,int right){
        for(int i = left, i <= right, i++){
            temp[i] = arr[i];
        }

        int i = left;
        int j = mid + 1;
        int l = left;

        while(i <= mid && j <=right) {
            if (temp[i] <= temp[j]) {
                arr[k++] = temp[i++]
            } else {
                arr[k++] = temp[j++]
            }
        }
        while(i <= mid){
            arr[k++] = temp[j++];
        }
    }

    private static void insertionSort(int[] arr,int left,int right){
        for(int i = left + 1,i <= right,i++){
            key = arr[i];
            j = i - 1;
        }

        while (j >= left && arr[j] > key){
            arr[j + 1] == arr[j];
            j--;
        }
        arr[j + 1] = key;
    }
}