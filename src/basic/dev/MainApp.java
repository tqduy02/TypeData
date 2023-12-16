package basic.dev;

public class MainApp {
	public static void main(String[] args) {
		// KBSinhVien
		String studentName = "Tran Quoc Duy";
		int studentCode = 2360219;
		long Card = 1234567890;
		String nameClass = "23CD";
		String nameSchool = "HueIC";
		float DTB = 8f;
		// KBCongNhan
		String workerName = "Le A";
		String Address = "56 Nguyen Hue";
		long Phone = 010203023;
		float Wage = 5f;
		// KBXe
		String carName = "BMW iX3";
		String CarCompany = "BMW";
		String valueCar = "3 bilion";
		String Color = "Black";
		// SV
		System.out.println("Ho va ten SV: " + studentName);
		System.out.println("Ma SV: " + studentCode);
		System.out.println("CCCD: " + Card);
		System.out.println("Lop: " + nameClass);
		System.out.println("Truong: " + nameSchool);
		System.out.println("DTB: " + DTB);
		// CD
		System.out.println("Ho ten Cong nhan: " + workerName);
		System.out.println("Dia chi: " + Address);
		System.out.println("So dien thoai: " + Phone);
		System.out.println("He so luong: " + Wage);
		// Xe
		System.out.println("Ten Xe: " + carName);
		System.out.println("Hang Xe: " + CarCompany);
		System.out.println("Gia xe: " + valueCar);
		System.out.println("Mau xe: " + Color);

	}
}