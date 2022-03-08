package org.student;

public class Students {

	public void getStudentInfo(int id) {
		System.out.println("Student ID: "+id);
	}
	public void getStudentInfo(int id, String name) {
		System.out.println("Student ID: "+id+" and name "+name);
	}
	public void getStudentInfo(String email, long phone) {
		System.out.println("Student email: "+email+" and phone "+phone);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students s  = new Students();
		s.getStudentInfo(22);
		s.getStudentInfo(22, "Sahana");
		s.getStudentInfo("sahan@gmail.com", 1234567890);

	}

}
