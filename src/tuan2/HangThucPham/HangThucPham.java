package tuan2.HangThucPham;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HangThucPham {
	private final String maHang;
	private String tenHang;
	private double donGia;
	private LocalDate ngaySanXuat;
	private LocalDate ngayHetHan;

	public HangThucPham(String maHang) throws Exception {
		if (maHang == null || maHang.trim().isEmpty()) {
			throw new Exception("Lỗi: Mã hàng không được để rỗng!");
		}
		this.maHang = maHang.trim();
		this.tenHang = "xxx";
		this.donGia = 0;
		this.ngaySanXuat = LocalDate.now();
		this.ngayHetHan = this.ngaySanXuat;
	}

	public HangThucPham(String maHang, String tenHang, double donGia, LocalDate ngaySanXuat, LocalDate ngayHetHan)
			throws Exception {
		if (maHang == null || maHang.trim().isEmpty()) {
			throw new Exception("Lỗi: Mã hàng không được để rỗng!");
		}
		this.maHang = maHang.trim();

		setTenHang(tenHang);
		setDonGia(donGia);
		setNgaySanXuat(ngaySanXuat);
		setNgayHetHan(ngayHetHan);
	}

	public String getMaHang() {
		return maHang;
	}

	public String getTenHang() {
		return tenHang;
	}

	public void setTenHang(String tenHang) {
		if (tenHang != null && !tenHang.trim().isEmpty()) {
			this.tenHang = tenHang;
		} else {
			this.tenHang = "xxx";
		}
	}

	public double getDonGia() {
		return donGia;
	}

	public void setDonGia(double donGia) {
		if (donGia >= 0) {
			this.donGia = donGia;
		} else {
			this.donGia = 0;
		}
	}

	public LocalDate getNgaySanXuat() {
		return ngaySanXuat;
	}

	public void setNgaySanXuat(LocalDate ngaySanXuat) {
		if (ngaySanXuat != null && ngaySanXuat.isBefore(LocalDate.now())) {
			this.ngaySanXuat = ngaySanXuat;
		} else {
			this.ngaySanXuat = LocalDate.now();
		}
	}

	public LocalDate getNgayHetHan() {
		return ngayHetHan;
	}

	public void setNgayHetHan(LocalDate ngayHetHan) {
		if (ngayHetHan != null && ngayHetHan.isAfter(this.ngaySanXuat)) {
			this.ngayHetHan = ngayHetHan;
		} else {
			this.ngayHetHan = this.ngaySanXuat;
		}
	}

	public boolean daHetHan() {
		return this.ngayHetHan.isBefore(LocalDate.now());
	}

	// Kiểm tra hết hạn
	public boolean kiemTraHetHan() {
		return ngayHetHan.isBefore(LocalDate.now());
	}

	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#,##0.00VNĐ");
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		String status = daHetHan() ? "Đã hết hạn" : "Còn hạn sử dụng";

		return String.format("%-10s %-20s %-15s %-15s %-15s %-15s", maHang, tenHang, df.format(donGia),
				dtf.format(ngaySanXuat), dtf.format(ngayHetHan), status);
	}
}