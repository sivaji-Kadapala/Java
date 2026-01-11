package coding;

import java.security.SecureRandom;
import java.util.stream.Collectors;

public class Code_6 {
    public static void main(String[]args){
        int length=6;
        SecureRandom random=new SecureRandom();
        String OTP = random.ints(length, 0, 10).mapToObj(i -> String.valueOf(i)).collect(Collectors.joining());
        System.out.println("Generated OTP: " + OTP);
    }
}
