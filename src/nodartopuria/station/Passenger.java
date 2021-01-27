package nodartopuria.station;

public class Passenger {
	private String name;
	private boolean ticket;

	public Passenger(String name, boolean ticket){
		this.name = name;
		this.ticket = ticket;
	}
	public Passenger(){

	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean haveTicket() {
		return ticket;
	}

}
