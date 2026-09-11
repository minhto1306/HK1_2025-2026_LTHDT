package tuan3.CD;

import java.util.Scanner;

public class RunProgram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập sức chứa tối đa của danh sách CD: ");
		int n = sc.nextInt();
		sc.nextLine();

		CDList ds = new CDList(n);
		int chon = 0;

		do {
			System.out.println("\n========== QUẢN LÝ DANH SÁCH CD ==========");
			System.out.println("1. Thêm một đĩa CD");
			System.out.println("2. Xuất toàn bộ danh sách CD");
			System.out.println("3. Xem số lượng CD trong danh sách");
			System.out.println("4. Tính tổng giá thành các CD");
			System.out.println("5. Sắp xếp giảm dần theo giá thành");
			System.out.println("6. Sắp xếp tăng dần theo tựa CD");
			System.out.println("0. Thu kiếm quy ẩn (Thoát)");
			System.out.print("Mời huynh đài chọn thức thứ: ");
			chon = sc.nextInt();
			sc.nextLine();

			switch (chon) {
			case 1:
				System.out.print("Nhập mã CD (số nguyên > 0): ");
				int ma = sc.nextInt();
				sc.nextLine();
				System.out.print("Nhập tựa CD: ");
				String tua = sc.nextLine();
				System.out.print("Nhập số bài hát: ");
				int soBH = sc.nextInt();
				System.out.print("Nhập giá thành: ");
				double gia = sc.nextDouble();

				CD cdMoi = new CD(ma, tua, soBH, gia);
				if (ds.themCD(cdMoi)) {
					System.out.println("=> Nạp đĩa CD thành công!");
				} else {
					System.out.println("=> Nạp đĩa CD thất bại!");
				}
				break;

			case 2:
				System.out.println("\n" + ds.hienThiDanhSach());
				break;

			case 3:
				System.out.println("=> Số lượng CD hiện có: " + ds.getSoLuongCD());
				break;

			case 4:
				System.out.printf("=> Tổng giá thành toàn bộ CD: %,.2f VNĐ\n", ds.tinhTongGiaThanh());
				break;

			case 5:
				ds.sapXepGiamTheoGia();
				System.out.println("=> Đã xếp đặt danh sách giảm dần theo giá thành!");
				System.out.println(ds.hienThiDanhSach());
				break;

			case 6:
				ds.sapXepTangTheoTua();
				System.out.println("=> Đã xếp đặt danh sách tăng dần theo tựa CD!");
				System.out.println(ds.hienThiDanhSach());
				break;

			case 0:
				System.out.println("Hẹn gặp lại huynh đài trên giang hồ!");
				break;

			default:
				System.out.println("Chiêu thức không có trong danh bộ, vui lòng chọn lại!");
			}
		} while (chon != 0);

		sc.close();
	}
}