package nodartopuria.station;

import java.util.ArrayList;
import java.util.List;

public class Train {

	List<Passenger> passengerList = new ArrayList<>();

	public void addPassenger(Passenger passenger){
		if (passenger.haveTicket()){
			passengerList.add(passenger);
			System.out.println("Name: "+passenger.getName()+" Passed");
		}else{
			System.out.println(passenger.getName()+" You Shall not Pass!!");
		}
	}

}
