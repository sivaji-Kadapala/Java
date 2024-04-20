package Duplicate;

public class DuplicateInArray {
    public static void main(String[] args) {
        String arr[]={"java","net","oracle","oracle","java","angular"};
        boolean flag=true;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i].equalsIgnoreCase(arr[j]) ) {
                    System.out.println("Duplicate elements are "+arr[i]);
                    flag=false;
                }
            }
        }
        if (flag ) {
            System.out.println("No Duplicates");
        }
    }
}
