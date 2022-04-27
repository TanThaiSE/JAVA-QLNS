package bai_tap_qlns;

import java.util.ArrayList;
import java.util.Scanner;

public class CongTy {
	private String tenCongTy;
	private String maSoThue;
	private int doanhThuThang;
	
	
	
	public void nhapThongTinCongTy() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap ten cong ty");
		tenCongTy=sc.nextLine();
		System.out.println("Nhap ma so thue");
		maSoThue=sc.nextLine();
		System.out.println("Nhap doanh thu thang");
		doanhThuThang=sc.nextInt();
	}
	
	public int tongLuongToanCongTy(DanhSachNhanVienThuong lstNVThuong,DanhSachTruongPhong lstTPhong,DanhSachGiamDoc lstGD) {
		return lstNVThuong.tinhLuong()+lstTPhong.tinhLuong()+lstGD.tinhLuong();	
	}
	public CongTy() {

	}
	public int loiNhuanCongTy(DanhSachNhanVienThuong lstNVThuong,DanhSachTruongPhong lstTPhong,DanhSachGiamDoc lstGD) {
		return doanhThuThang-tongLuongToanCongTy(lstNVThuong,lstTPhong,lstGD);
	}
	
	public CongTy(String tenCongTy, String maSoThue, int doanhThuThang) {
		this.tenCongTy = tenCongTy;
		this.maSoThue = maSoThue;
		this.doanhThuThang = doanhThuThang;
	}
	public String getTenCongTy() {
		return tenCongTy;
	}
	public void setTenCongTy(String tenCongTy) {
		this.tenCongTy = tenCongTy;
	}
	public String getMaSoThue() {
		return maSoThue;
	}
	public void setMaSoThue(String maSoThue) {
		this.maSoThue = maSoThue;
	}
	public int getDoanhThuThang() {
		return doanhThuThang;
	}
	public void setDoanhThuThang(int doanhThuThang) {
		this.doanhThuThang = doanhThuThang;
	}
	
	
	
}
