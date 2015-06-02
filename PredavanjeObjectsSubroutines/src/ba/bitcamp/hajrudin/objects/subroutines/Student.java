package ba.bitcamp.hajrudin.objects.subroutines;

class Student {
	private String faculty;
	private String name;
	private String surname;
	private Integer birthYear;
	private Integer index;
	
	
	
	public Student(String faculty, String name, String surname,
			Integer birthYear, Integer index) {
		super();
		this.faculty = faculty;
		this.name = name;
		this.surname = surname;
		this.birthYear = birthYear;
		this.index = index;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}

	public String toString(){
		String a = "";
		a = a + "Faculty:    " + faculty + "\n";
		a = a + "Name:       " + name + "\n";
		a = a + "Surname:    " + surname + "\n";
		a = a + "Birth year: " + birthYear + "\n";
		a = a + "Index:      "+ index;
		return a;
	}
	
	
	
}
