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
    }
}
