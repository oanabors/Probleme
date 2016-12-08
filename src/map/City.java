package map;

public class City {
	private String name;
	private long population;

	public City(String name, long population) {
		super();
		this.name = name;
		this.population = population;
	}

	public String getName() {
		return name;
	}

	public long getPopulation() {
		return population;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + (int) (population ^ (population >>> 32));
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
		City other = (City) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (population != other.population)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "City [name=" + name + ", population=" + population + "]";
	}
	
	

}
