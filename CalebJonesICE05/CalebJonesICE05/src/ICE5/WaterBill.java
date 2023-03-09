package ICE5;

import java.util.Date;

public abstract class WaterBill implements BaseCharge{
	
	// data fields 
	private int gallons;
	protected double value;
	private Date createdDate;
	
	// constructors
	WaterBill(){
		this.createdDate = null;
		this.gallons = 0;
		this.value = 0;
	}

	WaterBill(int gallons) {
		this.gallons = gallons;
		this.createdDate = new Date();
		}

	public int getGallons() {
		return gallons;
	}

	public void setGallons(int gallons) {
		this.gallons = gallons;
	}

	public double getValue() {
		return value;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	
}// end
