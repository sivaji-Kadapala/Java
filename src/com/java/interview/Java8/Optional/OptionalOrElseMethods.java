package com.java.interview.Java8.Optional;

import java.util.Optional;

public class OptionalOrElseMethods {
    public static void main(String[] args) {
Optional<String> nameContainer=getName ();

    }

    static Optional<String> getName() {
//        return null;
        String name="sivaji";
        Optional<String> value=null;
        if(name==null){
            value=Optional.empty ();
        }else {
            value=Optional.of ( name );
        }
//        Optional<String> value=Optional.of ( name );
        return value;
    }
}
