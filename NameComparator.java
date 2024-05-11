package week6;

import java.util.Comparator;

public class NameComparator implements Comparator<mod6CTAoption1> {
	   @Override
	    public int compare(mod6CTAoption1 s1, mod6CTAoption1 s2) {
	        return s1.getName().compareTo(s2.getName());
	    }
	}


