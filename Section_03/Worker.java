package Section_03;

import java.time.LocalDate;

public class Worker {
	
	private String name;
	private String birthDate;
	protected String endDate;
	
	public Worker() {
		
	}
	
	public Worker(String name, String birthDate) {
		this.name = name;
		this.birthDate = birthDate;
	}
	
	public int getAge() {
		int BirthYear = Integer.parseInt(birthDate.substring(6));
		int currentYear = LocalDate.now().getYear();
		return currentYear - BirthYear;
	}
	
	public double collectPay() {
		return 0.0;
	}
	
	public void terminate(String endDate) {
		this.endDate = endDate;
	}

	@Override
	public String toString() {
		return "Worker [name=" + name + ", birthDate=" + birthDate + ", endDate=" + endDate + "]";
	}
	
	
	
	

}
