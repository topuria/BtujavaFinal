package nodartopuria.station;

import java.util.List;

public class Station {
	public static void main(String[] args) {
		Passenger nika = new Passenger("nika",false);
		Passenger nodar = new Passenger("nodar",true);
		Passenger zura = new Passenger("zura",false);

		Train train = new Train();
		train.addPassenger(nika);
		train.addPassenger(nodar);
		train.addPassenger(zura);

		for (Passenger passenger:train.passengerList) {
			System.out.println(passenger.getName());
		}
	}

	public static void forTest(List<Passenger> passengers, Train train){
		for (Passenger passenger1:passengers) {
			train.addPassenger(passenger1);
		}
	}
}
