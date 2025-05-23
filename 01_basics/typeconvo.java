class typeconvo{
    public static void main(String[] args){
        // Conversion -> lower to higher
        //small gift can be added to big box no problem
        // eg byte(which is small) to int
        // byte a = 6;
        // int b = a;
        // System.out.println(a);

        // Casting -> higher assign to lower type
        // explicitly defined in the code
        // in simple term explicit conversion is called casting
        int d = 245; 
        byte e = (byte) d;
        System.out.println(e);
        float f = 5.6f;
        int x = (int)f;
        System.out.println(x);

        // Type promotion
        byte z = 10;
        byte m = 20;
        int p = z * m;
        System.out.println(p);
    }
}