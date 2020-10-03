import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class DoubleStream1 {

	public void doubleStream(List<Student> students) {
		System.out.println("Sum of marks Of a Student");
		Stream<Student> steam2 = students.stream();
		steam2.forEach((student4) -> {
			double[] array = student4.getStudentMarks();
			java.util.stream.DoubleStream stream = Arrays.stream(array);
			double add = stream.reduce(0, (a, b) -> a + b);
			System.out.println(add);
		});

	}
}