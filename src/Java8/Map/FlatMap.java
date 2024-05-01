package Java8.Map;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;
// When we have Collection inside another collection then to flaten that stream we will use flatMap( ) method.
public class FlatMap {
    public static void main(String[] args) {
        List<String> javaCourses= Arrays.asList("Core Java","Adv Java","SBMS","JRTP");
        List<String> cloudCourses= Arrays.asList("Devops","AWS","Azure","GCP");
        List<String> webCourses= Arrays.asList("HTML5","CSS3","Angular","ReactJs");
        List<List<String>> ashokCourses= Arrays.asList(javaCourses,cloudCourses,webCourses);
        Stream<List<String>> stream1=ashokCourses.stream();
        Stream<String> courses=stream1.flatMap(s->s.stream());
        courses.forEach(System.out::println);
    }
}
