package catalog.utils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import catalog.models.Student;

public class FileUtil {

	public List<Student> readStudents(String fileName) throws IOException {
		List<Student> students = new ArrayList<Student>();
		Path path = Paths.get(fileName);
		List<String> fileLines = Files.readAllLines(path);
		for (String line : fileLines) {
			Student student = createStudent(students, line);
			if (students.contains(student) == false) {
				students.add(student);
			}
			// System.out.println(student);
		}
		return students;
	}

	private Student createStudent(List<Student> students, String line) {
		String[] tokens = line.split(",");
		Student student = new Student();
		student.setId(tokens[0]);
		boolean isAlreadyInTheList = false;
		for (Student stud : students) {
			if (student.equals(stud)) {
				isAlreadyInTheList = true;
				student = stud;
				break;
			}
		}
		if (isAlreadyInTheList) {
			Map<String, Integer> grades = student.getGrades();
			grades.put(tokens[4], Integer.parseInt(tokens[5]));
			student.setGrades(grades);
		} else {
			student.setName(tokens[1]);
			student.setSurname(tokens[2]);
			student.setGroup(Integer.parseInt(tokens[3]));
			Map<String, Integer> grades = new HashMap<>();
			grades.put(tokens[4], Integer.parseInt(tokens[5]));
			student.setGrades(grades);
		}
		return student;
	}

}
