package tuan3.CD;

import java.text.DecimalFormat;

public class CD {
	// Thuộc tính đúng chuẩn kiểu dữ liệu
	private int maCD;
	private String tuaCD;
	private int soBaiHat;
	private double giaThanh;

	// Constructor mặc định: Gán theo đúng quy chuẩn bang phái quy định
	public CD() {
		this(999999, "chưa xác định", 1, 1.0);
	}

	public CD(int maCD, String tuaCD, int soBaiHat, double giaThanh) {
		setMaCD(maCD);
		setTuaCD(tuaCD);
		setSoBaiHat(soBaiHat);
		setGiaThanh(giaThanh);
	}

	public int getMaCD() {
		return maCD;
	}

	public void setMaCD(int maCD) {
		if (maCD > 0) {
			this.maCD = maCD;
		} else {
			this.maCD = 999999;
		}
	}

	public String getTuaCD() {
		return tuaCD;
	}

	public void setTuaCD(String tuaCD) {
		if (tuaCD != null && !tuaCD.trim().isEmpty()) {
			this.tuaCD = tuaCD;
		} else {
			this.tuaCD = "chưa xác định";
		}
	}

	public int getSoBaiHat() {
		return soBaiHat;
	}

	// Số bài hát > 0
	public void setSoBaiHat(int soBaiHat) {
		if (soBaiHat > 0) {
			this.soBaiHat = soBaiHat;
		} else {
			this.soBaiHat = 1;
		}
	}

	public double getGiaThanh() {
		return giaThanh;
	}

	// Giá thành > 0
	public void setGiaThanh(double giaThanh) {
		if (giaThanh > 0) {
			this.giaThanh = giaThanh;
		} else {
			this.giaThanh = 1.0;
		}
	}

	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,##0.00 VNĐ");
		return String.format("%-10d %-25s %-15d %-15s", maCD, tuaCD, soBaiHat, df.format(giaThanh));
	}
}