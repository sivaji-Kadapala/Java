package Java8.Strm;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMap {
    public static void main(String[] args) {
        List<String> javaCourses= Arrays.asList("Core Java","Adv Java","SBMS","JRTP");
        List<String> uiCourses=Arrays.asList("HTML5","CSS3","Angular","React JS");
        List<String> cloudCourses=Arrays.asList("Devops","AWS","Azure","GCP");
        List<List<String>> ashokItCourses=Arrays.asList(javaCourses,uiCourses,cloudCourses);
        Stream<List<String>> stream=ashokItCourses.stream();
        Stream<String> courses=stream.flatMap(s->s.stream());
        courses.forEach(System.out::println);
    }
}
