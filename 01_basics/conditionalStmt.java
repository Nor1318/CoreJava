class conditionalStmt{
    public static void main(String args[]){
        int x = 10;
        int y = 20;
        int z = 30;


    // if-elseif-else
        if(x > y && x > z)
            System.out.println(x);
        else if(y > x && y > z)
            System.out.println(y);
        else
            System.out.println(z);
    
    // Using Ternary operator(condition ? true: false)
        int result = (x > y && x > z) ? 1  : (y > z) ? 2 : 3;
        System.out.println(result);

    // if-else for even odd
    if(x % 2 == 0){
        System.out.println("Even");
    }
    else{
        System.out.println("Odd");
    }





    }

}