// Overloading is using the same method with different parameters and the return type plays no role in it.
class MyCalculator{
    public int add(int n1,int n2){
        return n1 + n2;
    }
    public int add(int n1,int n2,int n3){
        return n1 + n2 + n3;
    }
    public double add(double n1,int n2){
        return n1 + n2;
    }
}
class MethodOverloading{
    public static void main(String args[]){
        MyCalculator obj = new MyCalculator();
        int r1 = obj.add(1,2);
        int r2 = obj.add(3,4);
        double r3 = obj.add(5.6,3);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
    }
}