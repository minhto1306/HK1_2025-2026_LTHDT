package tuan2.SinhVien;

public class SinhVien {
	private int maSV;
	private String hoTen;
	private double diemLT, diemTH;

	public SinhVien() {
		this.maSV = 1;
		this.hoTen = "Chua co!";
		this.diemLT = 0.0;
		this.diemTH = 0.0;
	}

	public SinhVien(int maSV, String hoTen, double diemLT, double diemTH) throws Exception {
		setMaSV(maSV);
		setHoTen(hoTen);
		setDiemLT(diemLT);
		setDiemTH(diemTH);
	}

	public int getMaSV() {
		return maSV;
	}

	public void setMaSV(int maSV) throws Exception {
		if (maSV <= 0) {
			throw new Exception("Ma sinh vien lon hon 0 (maSV > 0)!");
		}
		this.maSV = maSV;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) throws Exception {
		if (hoTen == null || hoTen.trim().isEmpty()) {
			throw new Exception("Ho ten khong duoc de trong!");
		}
		this.hoTen = hoTen;
	}

	public double getDiemLT() {
		return diemLT;
	}

	public void setDiemLT(double diemLT) throws Exception {
		if (diemLT < 0 || diemLT > 10) {
			throw new Exception("Diem ly thuyet nam trong khoang [0,10]!");
		}
		this.diemLT = diemLT;
	}

	public double getDiemTH() {
		return diemTH;
	}

	public void setDiemTH(double diemTH) throws Exception {
		if (diemTH < 0 || diemTH > 10) {
			throw new Exception("Diem thuc hanh nam trong khoang [0,10]!");
		}
		this.diemTH = diemTH;
	}

	public double tinhTB() {
		return (getDiemLT() + getDiemTH()) / 2;
	}

	public static String inTieuDe() {
		return String.format("|%15s|%20s|%10s|%10s|%10s|", "Ma sinh vien", "Ho ten", "Diem LT", "Diem TH", "Diem TB");
	}

	@Override
	public String toString() {
		return String.format("|%15d|%20s|%10.2f|%10.2f|%10.2f|", maSV, hoTen, diemLT, diemTH, tinhTB());
	}
}