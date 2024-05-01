package Java8.Lambda;
interface  Addable{
    void Addition(int a, int b, int c);
}
public class MultipleParameters {
    public static void main(String[] args) {
        Addable addable=new Addable() {
            @Override
            public void Addition(int a, int b, int c) {
                System.out.println(a+b+c);
            }
        };
        addable.Addition(6,7,8);

        //withLambda
        Addable addable1=(a,b,c)-> System.out.println(a+b+c);
        addable1.Addition(1,2,3);
    }
}
