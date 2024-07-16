package Java8.Optional;

import java.util.Optional;

public class OptionalClass {
    public static void main(String[] args) {
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
    }
}
