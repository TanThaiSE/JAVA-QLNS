package bai_tap_qlns;

import java.util.ArrayList;
import java.util.Scanner;

public class DanhSachNhanVienThuong {
	private ArrayList<NhanVienThuong> lstNhanVienThuong;

	

	public void nhapThongTin(ArrayList<TruongPhong> lstTruongPhong) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap so luong nhan vien:");
		int soLuong=sc.nextInt();
		for(int i=0;i<soLuong;i++) {
			NhanVienThuong nhanVienThuong=new NhanVienThuong();
			nhanVienThuong.nhapThongTinNhanVienThuong(lstTruongPhong);
			lstNhanVienThuong.add(nhanVienThuong);
		}
	}
	
	public void xuatThongTin() {
		// TODO Auto-generated method stub
		for(NhanVienThuong nhanVienThuong:lstNhanVienThuong) {
			nhanVienThuong.xuatThongTin();
		}
	}
	
	public int tinhLuong() {
		// TODO Auto-generated method stub
		int luong=0;
		for(NhanVienThuong nvThuong:lstNhanVienThuong) {
			luong+=nvThuong.tinhLuong();
		}
		return luong;
	}
	
	public void nhanVienThuongLuongCaoNhat() {
		int luongMax=lstNhanVienThuong.get(0).tinhLuong();
		int indexLuongMax=0;
		for(int i=0;i<lstNhanVienThuong.size();i++) {
			if(lstNhanVienThuong.get(i).tinhLuong()>luongMax) {
				luongMax=lstNhanVienThuong.get(i).tinhLuong();
				indexLuongMax=i;
			}
		}
		lstNhanVienThuong.get(indexLuongMax).xuatThongTin();
	}
	
	public void xoaNhanVienThuong(String maSo,ArrayList<TruongPhong>lsttp) {
		int index=-1;
		
		for(int i=0;i<lstNhanVienThuong.size();i++) {
			if(maSo.equals(lstNhanVienThuong.get(i).maSo)) {
				index=i;
				break;
			}
		}
		if(index!=-1) {
			String maSoTPQuanLy=lstNhanVienThuong.get(index).getTruongPhong().maSo;
			for(int i=0;i<lsttp.size();i++) {
				if(lsttp.get(i).maSo.equals(maSoTPQuanLy)) {
					lsttp.get(i).setSoLuongNhanVien(lsttp.get(i).getSoLuongNhanVien()-1);
				}
			}
			lstNhanVienThuong.remove(index);
		}
		else {
			System.out.println("Khong ton tai nhan vien thuong");
		}
	}
	public DanhSachNhanVienThuong() {
		lstNhanVienThuong=new ArrayList<NhanVienThuong>();
	}
	
	public DanhSachNhanVienThuong(ArrayList<NhanVienThuong> lstNhanVienThuong) {
		this.lstNhanVienThuong = lstNhanVienThuong;
	}

	public ArrayList<NhanVienThuong> getLstNhanVienThuong() {
		return lstNhanVienThuong;
	}

	public void setLstNhanVienThuong(ArrayList<NhanVienThuong> lstNhanVienThuong) {
		this.lstNhanVienThuong = lstNhanVienThuong;
	}


	
}
