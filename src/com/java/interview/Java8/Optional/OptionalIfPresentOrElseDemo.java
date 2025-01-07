package com.java.interview.Java8.Optional;

import java.util.Optional;

public class OptionalIfPresentOrElseDemo {
    public static void main(String[] args) {
        //If present
        Optional<String> nameContainer=getName ();
        nameContainer.ifPresent ( val->{
            System.out.println (val.toUpperCase ());
        });
        //ifPresentOrElse()
        nameContainer.ifPresentOrElse (
                (val)->{
                    System.out.println ("value is presented,So it will convert into uppercase");
                    System.out.println (val.toUpperCase ());
                },
                ()->{
                    System.out.println ("value is not presented,So I am just returning default");
                }
        );
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
