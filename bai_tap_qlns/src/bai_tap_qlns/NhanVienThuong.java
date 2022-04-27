package bai_tap_qlns;

import java.util.ArrayList;
import java.util.Scanner;

public class NhanVienThuong extends NhanSu implements ActionQlnsImp {
	private TruongPhong truongPhong=null;



	private int luongMotNgay=100;
	
	
	@Override
	public int tinhLuong() {
		// TODO Auto-generated method stub
		luongThang=luongMotNgay*soNgayLamViec;
		return luongThang;
	}

	


	public void nhapThongTinNhanVienThuong(ArrayList<TruongPhong> lstTruongPhong) {
		// TODO Auto-generated method stub
		super.nhapThongTinNhanVien();
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhan vien nay co truong phong khong?");
		System.out.println("1. Co");
		System.out.println("2. Khong");
		System.out.println("Lua chon cua ban:");
		int choose=sc.nextInt();
		if(choose==1) {
			boolean flag=true;
			while(flag) {
				System.out.println("Nhap ma so truong phong");
				sc.nextLine();
				String maSoTruongPhong=sc.nextLine();
				
				for(TruongPhong tp:lstTruongPhong) {
					System.out.println("vua moi nhap ma so truong phong: "+maSoTruongPhong);
					if(tp.maSo.equals(maSoTruongPhong)) {
						truongPhong=tp;
						tp.setSoLuongNhanVien(tp.getSoLuongNhanVien()+1);
						flag=false;
						break;
					}
				}
				if(!flag) {
					break;
				}
				System.out.println("Ma so truong phong khong ton tai. Ban muon nhap tiep khong?");
				System.out.println("1. Co");
				System.out.println("2. Khong");
				int luaChonNhapTruongPhong=sc.nextInt();
				if(luaChonNhapTruongPhong==2) {
					flag=false;
				}
			}
		}
		else {
			truongPhong=null;
		}	
	}



	@Override
	public void xuatThongTin() {
		// TODO Auto-generated method stub
		super.xuatThongTin();
		tinhLuong();
		System.out.println("Luong mot thang: "+luongThang );
	}
	
	public TruongPhong getTruongPhong() {
		return truongPhong;
	}

	public void setTruongPhong(TruongPhong truongPhong) {
		this.truongPhong = truongPhong;
	}

}
