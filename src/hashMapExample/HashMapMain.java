package hashMapExample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapMain {

	public static void main(String[] args) {

		HashMap<Integer, List<Student>> student = new HashMap<>();

		ArrayList<Student> studentsScoredAbove90 = new ArrayList<Student>();
		ArrayList<Student> studentsScoredBelow90 = new ArrayList<Student>();

		studentsScoredBelow90.add(new Student(11, "Aman", 70));
		studentsScoredBelow90.add(new Student(11, "Daman", 68));
		studentsScoredBelow90.add(new Student(11, "sheena", 80));

		studentsScoredAbove90.add(new Student(11, "Binu", 95));
		studentsScoredAbove90.add(new Student(11, "Blessy", 97));
		studentsScoredAbove90.add(new Student(11, "Ikleen", 90));

		student.put(1, studentsScoredAbove90);
		student.put(2, studentsScoredBelow90);
		

		// Print the list of students who scored marks above 90

		for (Entry<Integer, List<Student>> entry : student.entrySet()) {
			Integer key = entry.getKey();
			List<Student> val = entry.getValue();
			if (key == 1) {
				System.out.println("List of students who scored marks above 90");
				for (Student name : studentsScoredAbove90) {
					System.out.println(name.getName());
				}
			} else {
				System.out.println("List of students who scored marks below 90");
				for (Student name : studentsScoredBelow90) {
					System.out.println(name.getName());
				}
			}

		}

	}
}
