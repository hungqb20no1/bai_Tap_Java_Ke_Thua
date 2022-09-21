public class Studen extends Person {
	private double diem;

	public Studen(String name, int age, String address, double diem) {
		super(name, age, address);
		this.diem = diem;
	}

	public double getDiem() {
		return diem;
	}

	public void setDiem(double diem) {
		this.diem = diem;
	}

	@Override
	public void display(){
		super.display();
		System.out.println("Diem: " + diem);
    }
}