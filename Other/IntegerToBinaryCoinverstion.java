 
 public class IntegerToBinaryConversion{
 // Integer to binary conversion
    public static String toBinary(int n){
        int length = (int)Math.ceil(Math.log(n)/Math.log(2));
        int[] bits = new int[length];
        for(int x = 0; x < length; x++){
            double val = Math.pow(2, length - x);
            if(n >= val){
                bits[x] = 1;
                n -= val;
            }
            else{
                bits[x] = 0;
            }
        }
        String convert = "";
        for(int x = 0; x < length; x++){
            convert += bits[x];
        }
        return convert;
    }
 }