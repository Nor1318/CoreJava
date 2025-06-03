class Student{
    int roll;
    String name;
    int marks;
}

class Array{
    public static void main(String args[]){
       // Array Decleration if value is pre known
        // int arr[] = {1,2,3,4};
        // System.out.println(arr[3]);
        // // Array Decleration if value is not known prior
        // int arr1[] = new int[4]; // sets all value to 0 
        // arr1[2] = 6;
        // // for(int i = 0; i < 4; i++){
        // //     System.out.println(arr1[i]);
        // // }
        // // using  enhanced for loop
        // for(int a : arr1){
        //     System.out.println(a);
        // }

        // int arr[][] = new int[3][4]; //multi dimensional array
        // for(int i = 0;i < 3;i++){
        //     for (int j = 0; j < 4; j++){
        //         arr[i][j] = (int)(Math.random() * 10);
        //         // System.out.print(arr[i][j]);
        //     }
        //     // System.out.println();
        // }

        // for(int a[] : arr){
        //     for(int b : a){
        //         System.out.print(b);

        //     }
        //     System.out.println();
        // }
       
    //    int arr[][] = new int[3][]; //jagged array
    //    arr[0] = new int[4];
    //    arr[1] = new int[2];
    //    arr[2] = new int[3];

    //     for(int i = 0; i<arr.length;i++){
    //         for(int j = 0; j<arr[i].length;j++){
    //            arr[i][j] = (int)(Math.random() * 10);
    //         }
    //     }


    //    for(int a[] : arr){
    //     for(int b : a){
        
    //        System.out.print(b);
    //     }
    //     System.out.println();
    //    }

        // int arr[][][] = new int[4][3][5] // 3D array


        // Array of objects
        Student s1 = new Student();
        s1.roll = 1;
        s1.name = "Bobby";
        s1.marks = 97;

        Student s2 = new Student();
        s2.roll = 2;
        s2.name = "Bob";
        s2.marks = 69;

        Student s3 = new Student();
        s3.roll = 3;
        s3.name = "Boby";
        s3.marks = 79;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;
        for(int i = 0;i <students.length;i++){
            System.out.println(students[i].name + ": " + students[i].marks);
        }








    }
}