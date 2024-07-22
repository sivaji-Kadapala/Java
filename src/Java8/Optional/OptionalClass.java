package Java8.Optional;

import java.util.Optional;

public class OptionalClass {
    public static void main(String[] args) {
//        String email="sivajikadapala97@gmail.com";
        String email=null;
//        of,empty,ofNullable-are used to create object for optional
        Optional<Object> emptyOptional=Optional.empty();
        System.out.println(emptyOptional);

//        Optional<String> emailOptional = Optional.of(email);
//        System.out.println(emailOptional);

        Optional<String> StringOptional=Optional.ofNullable(email);
        String defaultOptional=StringOptional.orElse("sivajkadapala@gmail.com");
        System.out.println(defaultOptional);

        String defaultOptional2=StringOptional.orElseGet(()->"sivajkadapala@gmail.com");
        System.out.println(defaultOptional2);

//        String defaultOptional3=StringOptional.orElseThrow(()->new IllegalArgumentException("Email is not exist"));
//        System.out.println(defaultOptional3);

        Optional<String> gender=Optional.of("Male");
        Optional<String> emptyOptional2=Optional.empty();
        gender.ifPresent(s-> System.out.println("Value is present"));
        emptyOptional2.ifPresent(s-> System.out.println("No Value is present"));

        String res=" abc ";
        if(res!=null && res.contains("abc")){
            System.out.println(res);
        }
        Optional<String> optionalString=Optional.of(res);
        optionalString.filter(res1->res1.contains("abc"))
                .map(String::trim)
                .ifPresent((res1)-> System.out.println(res1));

        //        -----------------------------------
        String[] words=new String[10];
//        String word=words[5].toLowerCase();
//        System.out.println(word);
        Optional<String> checkNull=Optional.ofNullable(words[5]);
        if (checkNull.isPresent()){
            String word=words[5].toLowerCase();
            System.out.println(word);
        }else {
            System.out.println("word is null");
        }

//        example-2
//        String str="CloudTech";
        String str=null;
        Optional<String> optionalS=Optional.ofNullable(str);
        if (optionalS.isPresent()) {
            System.out.println("Valiue is "+optionalS.get());
        }else {
            String value=optionalS.orElse("Default");
            System.out.println("Value is not present "+value);
        }
//        example-3
        String str1="";
        Optional<String> optionalS1=Optional.of(str1);
        if (optionalS1.isPresent()) {
            System.out.println("Valiue is present");
        }else {
            System.out.println("Value is not present ");
        }
//
    }
}
