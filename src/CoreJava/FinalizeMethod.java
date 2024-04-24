package CoreJava;

public class FinalizeMethod {
    public static void main(String[] args) {
        FinalizeMethod finalizeMethod=new FinalizeMethod();
        finalizeMethod=null;
        System.gc();
    }
    protected void finalize(){
        System.out.println("finalize method called...");
    }
}
