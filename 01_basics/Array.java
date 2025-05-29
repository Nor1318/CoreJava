class Array{
    public static void main(String args[]){
       // Array Decleration if value is pre known
        int arr[] = {1,2,3,4};
        System.out.println(arr[3]);
        // Array Decleration if value is not known prior
        int arr1[] = new int[4]; // sets all value to 0 
        arr1[2] = 6;
        for(int i = 0; i < 4; i++){
            System.out.println(arr1[i]);
        }
    }
}