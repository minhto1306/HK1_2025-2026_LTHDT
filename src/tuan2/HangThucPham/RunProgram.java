package tuan2.HangThucPham;

import java.time.LocalDate;

public class RunProgram {
	public static void main(String[] args) throws Exception {
		HangThucPham htp1 = new HangThucPham("001", "Gạo", 100000, LocalDate.of(2018, 7, 10),
				LocalDate.of(2027, 7, 10));

		HangThucPham htp2 = new HangThucPham("002", "Mì", 5000, LocalDate.of(2018, 3, 1), LocalDate.of(2027, 9, 1));

		HangThucPham htp3 = new HangThucPham("003", "Nước", 10000, LocalDate.of(2017, 3, 1), LocalDate.of(2018, 3, 1));

		System.out.println(String.format("%-10s | %-15s | %-15s | %-15s | %-15s | %-15s", "Mã_Hàng", "Tên_Hàng",
				"Đơn_Giá", "Ngày_Sản_Xuất", "Ngày_Hết_Hạn", "Ghi_Chú"));
		System.out.println(
				"--------------------------------------------------------------------------------------------------");
		System.out.println(htp1);
		System.out.println(htp2);
		System.out.println(htp3);
	}
}
