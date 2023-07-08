// This is a program to test the student class 

package student;

//This script tests the student Class 
public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Create a students object with an array
		Student [] students = new Student[10];
		// Now students is an array of objects that can take 10 individual students
		// Create all the names and grades for each student
		students[0] = new Student("Jake", "Wuss", 96, 73, 85);
		students[1] = new Student("Kelsey", "YouGoGirl", 73, 89, 69);
		students[2] = new Student("Frank", "Doofus", 89, 70, 71);
		students[3] = new Student("Vanessa", "McFlurry", 83, 63, 30);
		students[4] = new Student("Jeremy", "Pigeon", 31, 52, 50);
		students[5] = new Student("Kathryn", "Pothead", 77, 87, 94);
		students[6] = new Student("Marco", "DeJesus", 92, 61, 80);
		students[7] = new Student("Eggs", "Benedict", 87, 83, 91);
		students[8] = new Student("Roberto", "Sombrero", 85, 94, 72);
		students[9] = new Student("Collin", "Smelly", 45, 97, 67);
			

		
		System.out.println("------------------------------------------------------------------------------");
		System.out.println("FirstName " + " LastName " + "AvreageScore " + "Grage");
		// Print all students with their First Name, Last Name and Letter Grade
		for (int i = 0; i <students.length; i++) {
			printOutstudents(students[i]);
		}
		
		System.out.println("");
		System.out.println("FirstName " + " LastName " + "LowestScore " + "Student");
		// Print all students with their First Name, Last Name and Letter Grade
		Student studentwithLowest = studetnwithLowest(students);
		printOutstudents(studentwithLowest);
		
		System.out.println("");
		System.out.println("FirstName " + " LastName " + "HighestScore " + "Student");
		// Print all students with their First Name, Last Name and Letter Grade
		Student studentwithHighest = studetnwithHighest(students);
		printOutstudents(studentwithHighest);
		
	}
	
	// Print Students with their details
	public static void printOutstudents(Student student) {
		System.out.println(student.getFirstName() + ",        " + student.getLastName() + ",      " +
				student.StudentAverage() + ",         " +  student.StudentLetterGrade(student.StudentAverage()));
	}
	
	
	// Student with Lowest
	// Take in parameter of a list of students, and then return the lowest student
	public static Student studetnwithLowest(Student[] students) {
		Student lowestStudent = students[0];
		int lowestScore = students[0].StudentAverage();
		
		for(int i=0; i <students.length; i++) {
			if(students[i].StudentAverage() < lowestScore) {
				lowestStudent = students[i];
				lowestScore = lowestStudent.StudentAverage();
			}
		}
		
		return lowestStudent;
	}

	// Student with Highest
	// Take in parameter of a list of students, and then return the lowest student
	public static Student studetnwithHighest(Student[] students) {
		Student highestStudent = students[0];
		int highestScore = students[0].StudentAverage();
		
		for(int i=0; i < students.length; i++) {
			if(students[i].StudentAverage() > highestScore) {
				highestStudent = students[i];
				highestScore = highestStudent.StudentAverage();
			}
		}
		
		return highestStudent;
	}

}
