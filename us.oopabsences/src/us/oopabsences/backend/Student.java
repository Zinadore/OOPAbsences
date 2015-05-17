/**
 * 
 */
package us.oopabsences.backend;

import java.util.ArrayList;

/**
 * @author Thanasis
 *
 */
public class Student {
	
	private String firstName;
	private String lastName;
	private String id;
	private String email;
	private ArrayList<Absence> absences;
	
	public Student(String fName, String lName, String id, String email){
		this.firstName = fName;
		this.lastName = lName;
		this.id = id;
		this.email = email;
		this.absences = new ArrayList<Absence>();
	}
	
    public void setFirstName(String fName){
        this.firstName = fName;
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public void setLastName(String lName){
        this.lastName = lName;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setId(String id){
        this.id = id;
    }
    
    public String getId(){
        return id;
    }
    
    public void addAbsence(SpecificAbsence sAbs, Unit unit){
    }
    
    public void removeAbsence(SpecificAbsence sAbs, Unit unit){
    }
    
   /* public SpecificAbsence [] getAbsences(Unit unit){
    *	return // needs clarification
    * }
	*/
}
