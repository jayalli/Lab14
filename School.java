import java.util.*;
import java.util.Map.Entry;

public class School {
	
	static Hashtable<Long, Student> studentClass  = TestMain.studentClass ;
	
	
	
	/**
	 * Creates a students object 
	 * and adds it to the studnetclass Hashtable 
	 */
	 public static void addStudent() {
		 
		    School GSU = new School();

	        boolean addAnotherStudent = true;
	        while (addAnotherStudent) {
	            String fname = "";
	            while (fname.length() <= 0) {
	                Scanner key = new Scanner(System.in);
	                System.out.print("What is your first name? ");
	                fname = key.next();
	            }
	            

	            String lname = "";
	            while (lname.length() <= 0) {
	                Scanner key1 = new Scanner(System.in);
	                System.out.print("What is your last name? ");
	                lname = key1.nextLine();
	            }
	            

	            double grade = -1;
	            while (grade < 0 || grade > 4) {
	                Scanner key2 = new Scanner(System.in);
	                System.out.print("What is your GPA (0 - 4)? ");
	                grade = key2.nextDouble();
	            }
	            

	            Long accountId = TestMain.counter;
	            String studentId = fname + lname + accountId;

	            studentClass .put(TestMain.counter, new Student(fname, lname, studentId, accountId, grade));

	            TestMain.counter++;

	            Scanner ask = new Scanner(System.in);
	            System.out.print("Do  you want to  add another student?(y or n) ");
	            String ans = ask.nextLine();
	            if (ans.charAt(0) == 'y' || ans.charAt(0) == 'Y') {

	                continue;


	            } else {

	            	addAnotherStudent = false;
	            	
	            	Scanner p = new Scanner(System.in);
		            System.out.print("Do  you want to perform an action?(y or n)  ");
		            String action1 = p.next();
		            
		            if (action1.charAt(0) == 'n') {
		            	
			            System.out.print("You are Done! ");

		            	
		            }else if (action1.charAt(0) == 'y'){
	            	
	            	boolean runCommands = true;
	            	while(runCommands) {
	            	Scanner k = new Scanner(System.in);
		            System.out.print("Choose an action(if done enter \"Done\"): Filter(f), Sort(s), Remove(r), PrintAll(p): ");
		            String action = k.next();
		            
		            if(action.charAt(0) == 'f') {
		            	
		            	GSU.filterStudent();
		            }else if(action.charAt(0) == 's') {
		            	
		            	GSU.sortStudent();

		            }else if(action.charAt(0) == 'r') {
		            	
		            	GSU.removeStudent();

		            }else if(action.charAt(0) == 'p') {
		            	
		            	GSU.allStudents();

		            }else {
		            	
			            System.out.println("Not a command! ");
		            	
		            }
		            
		            }

	            }else {
	            	
		            System.out.println("You are done!");

	            }

	        }
	       }
	    	//Computations:n(n+n+n+9) + (n+7)
	        //theta: n^2


	    }
	
		
	public  void sortStudent() {
		
		for(int i = 0; i<studentClass .size()-1; i++) {
			for (int j = 0; j<studentClass .size()-2; j++) {
			
			if(studentClass.get(j).getGrade() > studentClass.get(j+1).getGrade()) {
				Student simp =  studentClass .get(j+1);
				studentClass.put(((long)(j+1)),studentClass .get(j) );
				studentClass.put(((long)(j)), simp);
				
			}
				
				
			}
			
		}
    	//Computations:1
        //theta: n^2


	}
	
	
	/**
	 * Filters student by who has the entered grade or  greater
	 */
	public  void filterStudent() {
		
		Scanner k = new Scanner(System.in);
        System.out.print("Enter a grade (all students with entered grade or greater wil be given):  ");
        Double baseGrade = k.nextDouble();
		
		for ( Student i : studentClass .values()) {
			
			
			
		  	if(i.getGrade() >= baseGrade) {
		  		
		  		System.out.println(i.getFname());
		  		
		  	}
			
		}
	
  		System.out.println("These are the students with the entered grade or higher.");
  		//Computations: n*1+1
        //theta: n

	}
	
	
	/**
	 * Removes student based on the students Account Id( aid)
	 */
	public  void removeStudent( ) {
		
		Scanner r = new Scanner(System.in);
		allStudents();
  		System.out.print("Enter the id of the student you want to remove: ");
  		Long id = r.nextLong();
		

		for (Entry<Long, Student> Entry : studentClass.entrySet()) {
		  	
			  if(id.equals(Entry.getKey()))
			  
				 studentClass.remove(id);
		  }
		
  		System.out.println("The student has been deleted ");
  		System.out.println("This is the new School list.");
    	//Computations: n+6

	}
	
	
	/**
	 * Prints all studnets that have been created and entered into the stucnetclass 
	 * given that they have not been removed by the removeStudnet method
	 */
	public void allStudents() {
		
        System.out.println(studentClass );
    	//Computations:1
        //theat: n

	}
		
}
