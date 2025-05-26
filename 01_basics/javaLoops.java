
// Write a program that prints the first 10 prime numbers.

// for loop
// class javaLoops{
//     public static void main(String args[]){
//         int i = 2;
//         int count = 0;
//         while(count != 10){
//             int flag = 0;
//            for(int j = 2; j<=i/2;j++){
//             if(i % j == 0){
//                 flag++;
//             }
            
//             }
//             if(flag == 0){
//                 System.out.println(i);
//                 count++;
//            }
//            i++;
//         }
//     }
// }

// while loop
// Print all numbers from 10 down to 1.

// class javaLoops{
//     public static void main(String args[]){
//         int i = 10;
//         while(i>=1){
//             System.out.println(i);
//             i--;
//         }
//     }
// }

//Do-While Loop
// Print the multiplication table of 3 (up to 10 terms).

class javaLoops{
    public static void main(String args[]){
        int i = 1;
        do{
            System.out.println("3 * " + i + " = " + 3*i);
            i++;

        }while(i<=10);
    }
}