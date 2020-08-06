

public class Student {
    private String fName;
    
    private String lName;
    
    private String sid;
    
    private long aid;
    
    private double grade;

    
    public Student(String fName, String lName, String sid, long aid, double grade) {
        this.fName = fName;
        this.lName = lName;
        this.sid = sid;
        this.aid = aid;
        this.grade = grade;
        //Computations:1 
        //Theta Analysis: none 
    }

    
    public String getFname() {
        return fName;
        //Computations:1 
        //Theta Analysis: 1
    }

    
    public void setFname(String fName) {
        this.fName = fName;
      //Computations:1 
        //Theta Analysis: 1

    }

    
    public String getLname() {
        return lName;
      //Computations:1 
        //Theta Analysis: 1

    }
    

    public void setLname(String lName) {
        this.lName = lName;
      //Computations:1 
       //Theta Analysis: 1

    }

    
    public String getSid() {
        return sid;
      //Computations:1 
        //Theta Analysis: 1
  
    }

    
    public void setSid(String sid) {
        this.sid = sid;
      //Computations:1 
        //Theta Analysis: 1

    }
    

    public long getAid() {
        return aid;
      //Computations:1 
        //Theta Analysis: 1

    }

    
    public void setAid(long aid) {
        this.aid = aid;
      //Computations:1 
        //Theta Analysis: 1

    }

    
    public double getGrade() {
        return grade;
      //Computations:1 
        //Theta Analysis: 1

    }

    
    public void setGrade(double grade) {
        this.grade = grade;
      //Computations:1 
        //Theta Analysis: 1

    }

    
    @Override public String toString() {
        return  '\t'+ "Student{" +
                "fName= " + fName + '\n' +
                ", lName= " + lName + '\n' +
                ", sid= " + sid + '\n' +
                ", aid= " + aid + '\n' +
                ", grade= " + grade +
                '}';
      //Computations:1 
        //Theta Analysis: 1

    }
}