package com.java.interview.Java8.Optional;

import java.util.Optional;

public class UpperCasevalues {
    public static void main(String[] args) {
        Optional<String> name=getName();
        if(name.isPresent ()){
            String s = name.get();
           String s1 = s.toUpperCase ();
            System.out.println (s1);
        }else {
            System.out.println ("value is not available");
        }
        if(name.isEmpty ()){
            System.out.println ("empty");
        }else {
            System.out.println (name.get ().toUpperCase ());
        }
//        if(name!=null){
//            name=name.toUpperCase ();
//              System.out.println (name);
//        }
//        System.out.println (name);

    }

    static Optional<String> getName() {
//        return null;
        String name=null;
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
