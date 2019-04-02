class class FindPrimaryNumber{
// algorithm to find the prim numbers
    public static ArrayList<Integer> findPrims(int n){
        int[] numbers = new int[n + 1];
        for(int x = 2; x <= n; x++){
            numbers[x] = x;
        }
        int sqrt = (int)Math.ceil(Math.sqrt(n));
        for(int x = 2; x <= sqrt; x++){
            if(numbers[x] == 0) continue;
            int j = x * x;
            while(j <= n){
               numbers[j] = 0;
               j += x;
            }
        }
        ArrayList<Integer> finalNumbers = new ArrayList<>();
        for(int x = 2; x <= n; x++){
            if(numbers[x] != 0)
            finalNumbers.add(numbers[x]);
        }
        return finalNumbers;
    }
}