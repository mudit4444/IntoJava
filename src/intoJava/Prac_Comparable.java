import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

class Important implements Comparable<Important> {
	private String name;
	private String schoolName;
	
	public Important(String name, String schoolName) {
		this.name = name;
		this.schoolName = schoolName;
	}

	public int compareTo(Important important) {
		
		return name.compareTo(important.name);
		//return schoolName.compareTo(important.schoolName);
		
		
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result
				+ ((schoolName == null) ? 0 : schoolName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Important other = (Important) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (schoolName == null) {
			if (other.schoolName != null)
				return false;
		} else if (!schoolName.equals(other.schoolName))
			return false;
		return true;
	}
}

public class Prac_Comparable {

	public static void main(String[] args) {
		
		List<Important> list = new ArrayList<Important>();
		SortedSet<Important> set = new TreeSet<Important>();
		
		
		addElement(list);
		addElement(set);
		
		showElement(list);
		showElement(set);

	}

	public static void addElement(Collection<Important> mycol) {
		mycol.add(new Important("Mudit", "CMS"));
		mycol.add(new Important("Hitesh", "LPS"));
		mycol.add(new Important("Nalin", "modern academy"));
		mycol.add(new Important("Aditya", "CMS"));
		
	}
	
	
	public static void showElement(Collection<Important> mycol) {
		for(Important abc : mycol) {
			System.out.println(abc);
		}
		
	}
}
