package CoreJava.Polymorphism;

public class MethodOverLoading {
    /*
why should we go for method overloading?
When we want to maintain the flexibility in our application like using one method
performing several operations then we can use this method overloading.
     */
    void sum(int a,int b){
        System.out.println("Sum is "+(a+b));
    }
    void sum(float a,float b){
        System.out.println("Sum is "+(a+b));
    }
    public static void main(String[] args) {
        MethodOverLoading methodOverLoading=new MethodOverLoading();
        methodOverLoading.sum(10,20);
        methodOverLoading.sum(10.0f,20.0f);
    }
}
