class switchCase{
    public static void main(String args[]){

        // int n = 9;

        // // Old way
        // switch(n){
        //     case 1:
        //         System.out.println("Sunday");
        //         break;
        //     case 2:
        //         System.out.println("Monday");
        //         break;
        //     case 3:
        //         System.out.println("Tuesday");
        //         break;
        //     case 4:
        //         System.out.println("Wednesday");
        //         break;
        //     case 5:
        //         System.out.println("Thursday");
        //         break;
        //     case 6:
        //         System.out.println("Friday");
        //         break;
        //     case 7:
        //         System.out.println("Saturday");
        //         break;
        //     default:
        //         System.out.println("Enter Valid number.");
        //         break;
        // }
        

        // new way without break using ->
        // String day = "Thursday";
        // boolean isClass = false;
        // switch(day){
        //     case "Saturday" -> System.out.println("Sleep till 9");
        //     case "Thursday","Friday" -> System.out.println("Sleep till 6:30");
        //     default -> System.out.println("Sleep till 5:30");
        // }

        // using yeild
        String day = "Thursday";
        String sleepTime = "";
        boolean isClass = false;
       sleepTime = switch(day){
            case "Saturday"-> "9";
            case "Thursday","Friday"-> {
                if(isClass)
                    yield "6:30";
                else
                    yield "9";
            }
            default-> "5:30";
        };
        System.out.println(sleepTime);
    }
}