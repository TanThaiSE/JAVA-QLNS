package bai_tap_qlns;

import java.util.ArrayList;
import java.util.Scanner;

public class TruongPhong extends NhanSu implements ActionQlnsImp{

	private int soLuongNhanVien=0;
	private int luongMotNgay=200;
	
	@Override
	public void nhapThongTinNhanVien() {
		// TODO Auto-generated method stub
		super.nhapThongTinNhanVien();
		
	}
	@Override
	public int tinhLuong() {
		// TODO Auto-generated method stub
		luongThang=luongMotNgay*soNgayLamViec+100*soLuongNhanVien;
		return luongThang;
	}
	public int getSoLuongNhanVien() {
		return soLuongNhanVien;
	}
	public void setSoLuongNhanVien(int soLuongNhanVien) {
		this.soLuongNhanVien = soLuongNhanVien;
	}
	
	@Override
	public void xuatThongTin() {
		// TODO Auto-generated method stub
		super.xuatThongTin();
		System.out.println("So luong nhan vien: "+soLuongNhanVien);
		tinhLuong();
		System.out.println("Luong mot thang: "+luongThang );
	}
}
