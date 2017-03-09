public static int binarySearch(int[] array, int key){
        int start = 0;
        int end = array.length;
        while(start < end){
            int middle = (start + end)/2;
            if(array[middle] == key) return middle;
            else if(array[middle] < key) start = middle;
            else end = middle;
        }
        return -1;
    }
    
    public static int binarySearch2(int[] array, int key){
        return binarySearch2(array, 0, array.length, key);
    }
    
    private static int binarySearch2(int[] array, int start, int end, int key){
        if(end > start){
            int middle = (start + end)/2;
            if(array[middle] == key) return middle;
            else if(array[middle] < key) return binarySearch2(array, middle, end, key);
            else return binarySearch2(array, start, middle, key);
        }
        return -1;
    }
