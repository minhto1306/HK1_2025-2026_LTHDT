package tuan2.SinhVien;

import java.util.ArrayList;
import java.util.Scanner;

public class RunProgram {
	public static void main(String[] args) throws Exception {
		int choice = 0;
		Scanner sc = new Scanner(System.in);
		SinhVien sv = null;
		ArrayList<SinhVien> listSV = new ArrayList<SinhVien>();

		SinhVien sv1 = new SinhVien(1111, "Nguyen Thi Binh An", 6.50, 8.50);
		SinhVien sv2 = new SinhVien(2222, "Le Thi Bong", 7.50, 8.00);
		SinhVien sv3 = new SinhVien(3333, "Nguyen Hoang Anh", 5.00, 9.00);
		listSV.add(sv3);
		listSV.add(sv1);
		listSV.add(sv2);

		while (true) {
			System.out.println("\n-- MENU -- ");
			System.out.println("[0]. Thoat chuong trinh");
			System.out.println("[1]. Nhap thong tin sinh vien");
			System.out.println("[2]. In danh sach sinh vien");
			System.out.print("Lua chon cua ban: ");
			choice = sc.nextInt();

			switch (choice) {
			case 0:
				System.out.println("Cao tu!");
				sc.close();
				return;
			case 1:
				try {
					System.out.print("Nhap ma sv: ");
					int maSV = sc.nextInt();
					sc.nextLine();

					System.out.print("Nhap ho ten: ");
					String hoTen = sc.nextLine();

					System.out.print("Nhap diem LT: ");
					double diemLT = sc.nextDouble();

					System.out.print("Nhap diem TH: ");
					double diemTH = sc.nextDouble();

					sv = new SinhVien(maSV, hoTen, diemLT, diemTH);
					listSV.add(sv);
					System.out.println("-> Nhap thanh cong!");
				} catch (Exception e) {
					System.out.println("Loi: " + e.getMessage());
				}
				break;
			case 2:
				if (listSV.isEmpty()) {
					System.out.println("Chua co du lieu sinh vien!");
				} else {
					System.out.println(SinhVien.inTieuDe());
					for (SinhVien sinhVien : listSV) {
						System.out.println(sinhVien);
					}
				}
				break;
			default:
				System.out.println("Lua chon khong hop le, moi chon lai!");
				break;
			}
		}
	}
}