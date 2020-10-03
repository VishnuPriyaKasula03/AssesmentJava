import java.util.Arrays;
import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class Reduce {
	public void reduce(List<Student> students) {
		Stream<Student> steam2 = students.stream();
		steam2.forEach((student4) -> {
			double[] array = student4.getStudentMarks();
			DoubleStream stream = Arrays.stream(array);
			double add = stream.reduce(0, (a, b) -> a + b);
			System.out.println(add);
		});
	}
}