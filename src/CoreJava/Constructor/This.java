package CoreJava.Constructor;

public class This {
    int i,i1,i2;
    public This(int i, int i1, int i2) {
        /*
We can use this keyword for the following purpose.
• this keyword is used to refer to current object.
• this is always a reference to the object on which method was invoked.
• this can be used to invoke current class constructor.
• this can be passed as an argument to another method.
         */
        this.i=i;
        this.i1=i1;
        this.i2=i2;
    }

    public static void main(String[] args) {
        This thisDemo=new This(10,20,30);
        System.out.println(thisDemo.i);
        System.out.println(thisDemo.i1);
        System.out.println(thisDemo.i2);
    }
}
