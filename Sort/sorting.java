// Selection sort
public static void insertionSort(int[] list) {
        for (int x = 0; x < list.length; x++) {
            int min = x;
            for (int y = x + 1; y < list.length; y++) {
                if (list[y] < list[min]) {
                    min = y;
                }
            }
            swap(list, min, x);
        }
    }
    
    
 // bubble sort
  public static void bubbleSort(int[] list) {
        int temp;
        for (int x = 0; x < list.length - 1; x++) {
            for (int y = 0; y < list.length - 1; y++) {
                if (list[y] > list[y + 1]) {
                    swap(list, y, y+ 1);
                }
            }
        }
 }
 
 // Insertion Sort
 public static void insertionSort1(int[] list) {
        for(int x = 0; x < list.length; x++){
            int j = x;
            while(j > 0 && list[j] < list[j - 1]){
                swap(list, j, j-1);
                j--;
            }
        }
    }
 
 public static void swap(int[] array, int start int end){
    int temp = array[start];
    array[start] = array[end];
    array[end] = temp;
 }
