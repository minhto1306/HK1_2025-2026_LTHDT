package tuan1.HinhTron;

public class HinhTron {
	private ToaDo tam;
	private double banKinh;
	private final double PI = 3.1416;

	public HinhTron() {

	}

	/**
	 * @param banKinh
	 * @param tam
	 */
	public HinhTron(ToaDo tam, double banKinh) {
		this.banKinh = banKinh;
		this.tam = tam;
	}

	public double getBanKinh() {
		return banKinh;
	}

	public void setBanKinh(double banKinh) {
		this.banKinh = banKinh;
	}

	public ToaDo getTam() {
		return tam;
	}

	public void setTam(ToaDo tam) {
		this.tam = tam;
	}

	public static void main(String[] args) {
		HinhTron h1 = new HinhTron(new ToaDo("O", 4, 7), 10);
		System.out.println("Thong tin hinh tron");
		System.out.println("Tam: " + h1.getTam().getTen() + "(" + h1.getTam().getX() + "," + h1.getTam().getY() + ")");
		System.out.println("Hinh tron co ban kinh: " + h1.getBanKinh());

	}

}
