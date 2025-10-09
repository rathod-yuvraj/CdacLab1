
import java.util.Date;

public class Vehicle {
 
	private int id;
	private String name;
	private String Vtype;
	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", name=" + name + ", Vtype=" + Vtype + ", purchase=" + purchase + "]";
	}
	public Vehicle() {
		super();
	}
	public Vehicle(int id, String name, String vtype, Date purchase) {
		super();
		this.id = id;
		this.name = name;
		Vtype = vtype;
		this.purchase = purchase;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getVtype() {
		return Vtype;
	}
	public void setVtype(String vtype) {
		Vtype = vtype;
	}
	public Date getPurchase() {
		return purchase;
	}
	public void setPurchase(Date purchase) {
		this.purchase = purchase;
	}
	private Date purchase;


	
}