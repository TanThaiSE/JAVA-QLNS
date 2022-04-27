package bai_tap_qlns;

import java.util.Scanner;

public class NhanSu {
	protected String maSo;
	protected String hoTen;
	protected String soDienThoai;
	protected int soNgayLamViec;
	protected int luongThang;
	
	public void nhapThongTinNhanVien() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap ma so");
		maSo=sc.nextLine();
		System.out.println("Nhap ho ten");
		hoTen=sc.nextLine();
		System.out.println("Nhap so dien thoai");
		soDienThoai=sc.nextLine();
		System.out.println("Nhap so ngay lam viec");
		soNgayLamViec=sc.nextInt();
	}
	
	public NhanSu() {
		
	}

	public int tinhLuong() {
		// TODO Auto-generated method stub
		return luongThang;
	}
	public NhanSu(String maSo, String hoTen, String soDienThoai, int soNgayLamViec, int luongThang) {
		this.maSo = maSo;
		this.hoTen = hoTen;
		this.soDienThoai = soDienThoai;
		this.soNgayLamViec = soNgayLamViec;
		this.luongThang = luongThang;
	}
	
	public void xuatThongTin() {
		System.out.println("Ma so: "+ maSo);
		System.out.println("Ma ho ten: "+ hoTen);
		System.out.println("So dien thoai: "+soDienThoai);
		System.out.println("So ngay lam viec: "+soNgayLamViec);
	}
	
}
