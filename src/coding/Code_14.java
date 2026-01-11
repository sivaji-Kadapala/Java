package coding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Code_14 {
    public static void main(String[]args){
        var mobileNumbers = List.of(
            "8106492316",
            "8555835117",
            "8106185567",
            "8639745119",
            "9705725227"
        );
        List<String> maskedNumbers = mobileNumbers.stream().map(s -> "******" + s.substring(s.length()- 4)).collect(Collectors.toList());
        System.out.println(maskedNumbers);
    }
}
