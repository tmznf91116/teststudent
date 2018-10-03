package org.study.todo1;

public class Student {
    
    int id;
	private String name;
    // id name 각각 타입정의 
    public Student() {
        
    }
   
    public Student(int id, String name) {
         this.id = id;    
         this.name = name;
         
    }

    //get set를 사용하여 값 출력 
    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	
    public String getName() {
         return name;
    }

    public void setName(String name) {
         this.name = name;
    }

    //toString 사용하여 ㄱ 변환 출력 
    @Override
    public String toString() {
         return String.format("%-6s %-15s %-15s %-15s"
                   , this.id
                   , this.name);
                   
    }
    
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	//equals 명령어를 사용하여 비교 
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}



