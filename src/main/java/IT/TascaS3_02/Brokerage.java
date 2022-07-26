package IT.TascaS3_02;

public class Brokerage {
	private String name;

	public Brokerage (String name) {
		
		this.name=name;
	}
	
	public void update(String eventType) {

		System.out.println("L'agencia "+name+" ha rebut la notificació de que la borsa ha "+eventType);	
	}
}

