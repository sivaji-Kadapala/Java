package Exeption;

// Using the custom checked exception
public class MainChecked {
    public static void main(String[] args) {
        try {
            validateAge(15);
        } catch (CustomCheckedException e) {
            System.out.println("Caught a CustomCheckedException: " + e.getMessage());
        }
    }

    public static void validateAge(int age) throws CustomCheckedException {
        if (age < 18) {
            throw new CustomCheckedException("Age must be 18 or older.");
        }
    }
}
