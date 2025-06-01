package collections;
public class Genrics <T , U>{
	public T name;
	public U id; 
	
	
	public Genrics(T Name , U id) {
		this.name = Name;
		this.id = id;
	}
	
	public T getName() {
		return name;
	}
	public U getId() {
		return id;
	}
	
	

}
