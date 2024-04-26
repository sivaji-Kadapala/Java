package CoreJava;
import static java.lang.System.*;
/*
static imports are special kind of import statements given in java 1.5 version which are used
to import the static members of any class into the program so that we can access those
static members directly without any class name or object.
 */
public class StaticImport {
    public static void main(String[] args) {
        out.println("Hello World !");//Now no need of System.out.println()
    }
}
