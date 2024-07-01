package src.Java11;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Optional;
import java.util.stream.Stream;

public class Java11FeaturesDemo {

    public static void main(String[] args) throws Exception {
        // 1. String API Additions
        String multilineString = "Hello\nWorld\nJava 11";
        Stream<String> lines = multilineString.lines();
        System.out.println("Lines in the string:");
        lines.forEach(System.out::println);

        String repeatedString = "Hello ".repeat(3);
        System.out.println("Repeated string: " + repeatedString);

        String whitespaceString = "  Java 11  ";
        System.out.println("Stripped string: '" + whitespaceString.strip() + "'");
        System.out.println("Leading stripped string: '" + whitespaceString.stripLeading() + "'");
        System.out.println("Trailing stripped string: '" + whitespaceString.stripTrailing() + "'");
        System.out.println("Is blank: " + whitespaceString.isBlank());

        // 2. Files API Enhancements
        Path filePath = Files.writeString(Files.createTempFile("test", ".txt"), "Java 11 features");
        String fileContent = Files.readString(filePath);
        System.out.println("File content: " + fileContent);

        // 3. Optional API Enhancements
        Optional<String> optional = Optional.of("Present value");
        System.out.println("Optional is empty: " + optional.isEmpty());

        // 4. Local-Variable Syntax for Lambda Parameters
        var numbers = Stream.of(1, 2, 3, 4, 5);
        int sum = numbers.mapToInt((var x) -> x).sum();
        System.out.println("Sum of numbers: " + sum);

        // 5. New HTTP Client API
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(new URI("https://postman-echo.com/get"))
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println("HTTP response: " + response.body());
    }
}
