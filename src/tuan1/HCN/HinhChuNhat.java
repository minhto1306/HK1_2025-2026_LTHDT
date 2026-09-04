package tuan1.HCN;

public class HinhChuNhat {
	private double chieuDai, chieuRong;

	public HinhChuNhat() {

	}

	public HinhChuNhat(double chieuDai, double chieuRong) throws Exception {
		setChieuDai(chieuDai);
		setChieuRong(chieuRong);
	}

	public double getChieuDai() {
		return chieuDai;
	}

	public void setChieuDai(double chieuDai) throws Exception {
		if (chieuDai > 0) {
			this.chieuDai = chieuDai;

		} else {
			throw new Exception("Chieu dai lon hon 0!");
		}
	}

	public double getChieuRong() {
		return chieuRong;
	}

	public void setChieuRong(double chieuRong) throws Exception {
		if (chieuRong > 0) {
			this.chieuRong = chieuRong;

		} else {
			throw new Exception("Chieu rong lon hon 0!");
		}
	}

	public double tinhDienTich() {
		return chieuDai * chieuRong;
	}

	public double tinhChuVi() {
		return (chieuDai + chieuRong) * 2;
	}

	public static void main(String[] args) throws Exception {
		HinhChuNhat h1 = new HinhChuNhat(5, 5);
		System.out.println("Chieu rong h1: " + h1.getChieuRong());
		System.out.println("Chieu dai h1: " + h1.getChieuDai());
		System.out.println("Dien tich: " + h1.tinhDienTich());
		System.out.println("Chu vi: " + h1.tinhChuVi());
	}
}
