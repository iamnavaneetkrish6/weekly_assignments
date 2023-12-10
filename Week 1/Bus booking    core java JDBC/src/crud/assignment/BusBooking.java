package crud.assignment;

public class BusBooking {
	
	private int pnr;
	private String name;
	private int seatNo;
	
	public BusBooking() {  3
	}

	public BusBooking(int pnr, String name, int seatNo) {
		super();
		this.pnr = pnr;
		this.name = name;
		this.seatNo = seatNo;
	}

	public int getPnr() {
		return pnr;
	}

	public void setPnr(int pnr) {
		this.pnr = pnr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSeatNo() {
		return seatNo;
	}

	public void setSeatNo(int seatNo) {
		this.seatNo = seatNo;
	}

	@Override
	public String toString() {
		return "BusBooking [pnr=" + pnr + ", name=" + name + ", seatNo=" + seatNo + "]";
	}
}
