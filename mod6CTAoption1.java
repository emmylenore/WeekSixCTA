package week6;

public class mod6CTAoption1 {
	
	int rollno;
	  String name;
	    String address;

	    public mod6CTAoption1(int rollno, String name, String address) {
	        this.rollno = rollno;
	        this.name = name;
	        this.address = address;
	    }
	    
	    public int getRollno() {
	    	return rollno;
	    }
	    
	    public String getName() {
	        return name;
	    }
	    
	    public String getAddress() {
	        return address;
	    }


	    @Override
	    public String toString() {
	        return "Student [rollno=" + rollno + ", name=" + name + ", address=" + address + "]";
	    }
	}


