
class DataTypes{
    public static void main(String a[]){
        // Primitive Data types -> 4 main types(integer,double,character,boolean)
        
        // For numbers(+ve to -ve) 4 sub integer types are present 
        // by default is int
        int num1 = 9;
        // byte num2 = 128; // gives an error as it is out of range for byte(-128 - 127)
        byte correct_num2 = 127; // this will work fine
        short num3 = 465;
        long num4 = 123456l;

        //for point values
        double db = 6.9;
        // float fl = 6.9; // gives an error cause default is double and float should be explicitly defined
        float flr = 6.9f; // this will work fine as flot is explicitly defined using f

        //for character

        char c = 'k';// use single quote for character

        //for boolean(true or false ) which is not equal to 0 and 1 in java like other lang
        boolean bo = false;

        System.out.println(bo);
        System.out.println(num4);
        System.out.println(c);


    }
}