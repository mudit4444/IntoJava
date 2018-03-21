package intoJava;

import java.util.HashMap;

public class Contract12 {
	String color;
	
	public Contract12(String color) {
		this.color = color;
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((color == null) ? 0 : color.hashCode());
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
		Contract12 other = (Contract12) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		return true;
	}



	public static void main(String[] args) {
		
		Contract c1 = new Contract("Yellow");
		Contract c2 = new Contract("Black");
		
		HashMap<Contract , Integer> map = new HashMap<Contract , Integer>();
		map.put(c1, 21);
		map.put(c2, 1);
		
		System.out.println(map.get(new Contract("Yellow")));

	}

}
