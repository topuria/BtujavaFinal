import nodartopuria.station.Passenger;
import nodartopuria.station.Station;
import nodartopuria.station.Train;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class StationTest {

	@Test
	public void testcase(){
		String[] names = {"nika","zura","nini","keti","mari"};
		Boolean[] arr = {true,false,true,false,true};
		List<Passenger> passengerList = new ArrayList<>();
		Train train = new Train();
		for(int i = 0;i<5;i++){
			Passenger passenger = new Passenger(names[i],arr[i]);
			passengerList.add(passenger);
		}
		Station.forTest(passengerList,train);
	}


}
