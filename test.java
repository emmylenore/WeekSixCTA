package week6;

import java.util.*;

public class test {
	public static void main(String[] args) {
		List<mod6CTAoption1> studentRoll = new ArrayList<>();
		
		studentRoll.add(new mod6CTAoption1(10, "Macy Mark", "123 Weston St"));
		studentRoll.add(new mod6CTAoption1(4, "Avery Williams", "678 Weston Ave"));
		studentRoll.add(new mod6CTAoption1(5, "Chase Smith", "363 Sesame St"));
		studentRoll.add(new mod6CTAoption1(3, "Jacob Levor", "833 Monarch Rd"));
		studentRoll.add(new mod6CTAoption1(7, "Thomas Swab", "293 Barrow Rd"));
		studentRoll.add(new mod6CTAoption1(2, "Ariana Scener", "143 ForeHills St"));
		studentRoll.add(new mod6CTAoption1(6, "Serena Johns", "935 Mountain Way"));
		studentRoll.add(new mod6CTAoption1(9, "Louise Roan", "532 Winton Ave"));
		studentRoll.add(new mod6CTAoption1(1, "Olivia Thoms", "675 Robinson St"));
		studentRoll.add(new mod6CTAoption1(8, "Luke Layton", "253 Disney Way"));
		
		System.out.println("Student List");
		System.out.println(studentRoll);
		
		System.out.println( "\n\n Organized By RollNumber:");
		Collections.sort(studentRoll, new RollNumberComparator());
		System.out.println(studentRoll);
		
		System.out.println( "\n\n Organized By First Name:");
		Collections.sort(studentRoll, new NameComparator());
		System.out.println(studentRoll);
		
		
		
	}

}
