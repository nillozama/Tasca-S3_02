package IT.TascaS3_02;

import java.util.ArrayList;
import java.util.List;

public class IssuingBroker {
	
	private List<Brokerage> brokerageList;
	
	public IssuingBroker(){
		
		brokerageList=new ArrayList<Brokerage>();
	}
	
	public void subscribe(Brokerage brokerage) {
		
		brokerageList.add(brokerage);
	}
	
	public void unsubscribe(Brokerage brokerage) {
		
		brokerageList.remove(brokerage);
	}
	
	public void notify(String eventType) {
		
		brokerageList.forEach(x->x.update(eventType));
	}

}
