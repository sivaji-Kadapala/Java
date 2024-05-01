package Java8.Optional;

import java.util.Optional;

class UserDemo{


//    public String getUserName() {
//        return userName;
//    }
public Optional<String> getUserName() {
    return Optional.ofNullable(userName);
}
    private String userName;
}
public class OptionalDemo {
    public static  void main(String[] args) {
        UserDemo user=new UserDemo();
//        System.out.println(user.getUserName());
//        if (user.getUserName().equalsIgnoreCase("Achillies") ) {
//            System.out.println("Name is equal to Achillies");
//        }else {
//            System.out.println("not equals");
        Optional<String> userName = user.getUserName();
        if (userName.isPresent()&&userName.get().equalsIgnoreCase("Achillies")) {
            System.out.println("Name is equal to Achillies");
        }else{
            System.out.println("Not Equals");
    }
    }

}
