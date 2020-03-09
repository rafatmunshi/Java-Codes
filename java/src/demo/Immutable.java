package demo;

import java.util.Date;

public class Immutable {

	private String name="suraj";
	private int id=1232;
	private Date d;
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public Date getD() {
		d=new Date();
		return (Date) d.clone();
	}
}
