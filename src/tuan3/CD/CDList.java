package tuan3.CD;

public class CDList {
	private CD[] listCD; // Mảng lưu trữ n phần tử
	private int count; // Số lượng CD thực tế hiện có

	public CDList(int n) {
		if (n <= 0) {
			this.listCD = new CD[10];
		} else {
			this.listCD = new CD[n];
		}
		this.count = 0;
	}

	public int timKiemViTri(int maCD) {
		for (int i = 0; i < count; i++) {
			if (listCD[i].getMaCD() == maCD) {
				return i;
			}
		}
		return -1;
	}

	public boolean themCD(CD diaCD) {
		if (diaCD == null)
			return false;

		if (count >= listCD.length) {
			System.out.println("Lỗi: Danh sách đã đầy, không thể nạp thêm!");
			return false;
		}
		if (timKiemViTri(diaCD.getMaCD()) != -1) {
			System.out.println("Lỗi: Mã CD " + diaCD.getMaCD() + " đã tồn tại trong danh sách!");
			return false;
		}

		listCD[count] = diaCD;
		count++;
		return true;
	}

	public int getSoLuongCD() {
		return count;
	}

	public double tinhTongGiaThanh() {
		double tong = 0;
		for (int i = 0; i < count; i++) {
			tong += listCD[i].getGiaThanh();
		}
		return tong;
	}

	public void sapXepGiamTheoGia() {
		for (int i = 0; i < count - 1; i++) {
			for (int j = i + 1; j < count; j++) {
				if (listCD[i].getGiaThanh() < listCD[j].getGiaThanh()) {
					CD temp = listCD[i];
					listCD[i] = listCD[j];
					listCD[j] = temp;
				}
			}
		}
	}

	public void sapXepTangTheoTua() {
		for (int i = 0; i < count - 1; i++) {
			for (int j = i + 1; j < count; j++) {
				if (listCD[i].getTuaCD().compareToIgnoreCase(listCD[j].getTuaCD()) > 0) {
					CD temp = listCD[i];
					listCD[i] = listCD[j];
					listCD[j] = temp;
				}
			}
		}
	}

	public String hienThiDanhSach() {
		if (count == 0) {
			return "Danh sách trống rỗng, chưa có đĩa nhạc nào!";
		}
		StringBuilder sb = new StringBuilder();
		sb.append(String.format("%-10s %-25s %-15s %-15s\n", "Mã CD", "Tựa CD", "Số bài hát", "Giá thành"));
		sb.append("----------------------------------------------------------------------\n");
		for (int i = 0; i < count; i++) {
			sb.append(listCD[i].toString()).append("\n");
		}
		return sb.toString();
	}
}