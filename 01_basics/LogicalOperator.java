
class LogicalOperator{
    public static void main(String args[]){
        int x = 10;
        int y = 10;

        double a = 5.6;
        double b = 4.7;

        boolean result = x < y | a < b; //& - and operator && - short circuit and operator


        System.out.println(!result);
    }
}