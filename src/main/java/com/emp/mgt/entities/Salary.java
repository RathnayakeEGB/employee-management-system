package com.emp.mgt.entities;

public class Salary {
	
	private int id;
	private double basic;
	private double allowance;
	private double bonus;
	
	public Salary() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Salary(int id, double basic, double allowance, double bonus) {
		super();
		this.id = id;
		this.basic = basic;
		this.allowance = allowance;
		this.bonus = bonus;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBasic() {
		return basic;
	}

	public void setBasic(double basic) {
		this.basic = basic;
	}

	public double getAllowance() {
		return allowance;
	}

	public void setAllowance(double allowance) {
		this.allowance = allowance;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return "Salary [id=" + id + ", basic=" + basic + ", allowance=" + allowance + ", bonus=" + bonus + "]";
	}
	
	

}
