/*This program creates a student class with appropriate data fields 
 * The program will create accessors to access some information 
 * The program will create a method to find the average score 
 * The program will determine the student letter grade based on the average score
 * 
 */

package student;


//Following is student class
public class Student {
	// Data Fields needed for this specific student class are below
	public String FirstName;
	public String LastName;
	public int Test1Score;
	public int Test2Score;
	public int FinalScore;

	
	// One default constructor 
	public Student() {
		
	}
	
	// Constructor with arguments
	public Student(String Fname, String Lname,
					int test1, int test2, int finaltest) {
		this.FirstName = Fname;
		this.LastName = Lname;
		this.Test1Score = test1;
		this.Test2Score = test2;
		this.FinalScore = finaltest;
	}
	
	// Getters and Setters for first name 
	public String getFirstName() {
		return this.FirstName;
	}
	
	public void setFirstName(String firstName) {
		this.FirstName = firstName;
	}
	
	// Getter and setter for last name
	public String getLastName() {
		return this.LastName;
	}
	
	public void setLastName(String lastName) {
		this.LastName = lastName;
	}
	// Getter and setter for Test 1
	public int getTest1() {
		return this.Test1Score;
	}
	
	public void setTest1(int test1) {
		this.Test1Score = test1;
	}

	// Getter and setter for Test 2
	public int getTest2() {
		return this.Test2Score;
	}
	
	public void setTest2(int test2) {
		this.Test2Score = test2;
	}
	
	// Getter and setter for Test 2
	public int getFinal() {
		return this.FinalScore;
	}
	
	public void setFinal(int finalscore) {
		this.FinalScore = finalscore;
	}

	
	//A method to calculate Average of Students
	public int StudentAverage() {
		// Initiate average variable
		int avg = 0;
		// Initiate temporary both highest and lowest score 
		int highest_score = 0;
		int lowest_score = 0;
		
		// Check conditions to later appropriately allocate the weight for test scores
		if (this.Test1Score < this.Test2Score) {
			highest_score = this.Test2Score;
			lowest_score = this.Test1Score;
		}
		else {
			highest_score =  this.Test1Score;
			lowest_score = this.Test2Score;
		}	
		//Calculate grade based on test scores and weights
		avg = (int)(this.FinalScore * 0.45 + highest_score * 0.30 + lowest_score * 0.25);	
	return 	avg;
	}
	
	// Method to return Student Grades (We can all this method with the variable we create for each student 
	// with student average
	public char StudentLetterGrade(int avg_score) {
		if  (avg_score >= 90 & avg_score <=100)
			return 'A';
		
		else if (avg_score >= 80 & avg_score < 90)
			return 'B';
		
		else if (avg_score >= 70 & avg_score < 80)
			return 'C';
		
		else if (avg_score >= 60 & avg_score < 70)
			return 'D';
		
		else
			return 'F';
	}
		// Student with highest and lowest average are in a static method in main class

}
