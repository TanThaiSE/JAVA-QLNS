package bai_tap_qlns;

import java.util.Scanner;

public class GiamDoc extends NhanSu implements ActionQlnsImp{
	private double coPhanCongTy;
	private int luongMotNgay=300;
	
	@Override
	public void nhapThongTinNhanVien() {
		// TODO Auto-generated method stub
		super.nhapThongTinNhanVien();
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap co phan trong cong ty");
		coPhanCongTy=sc.nextDouble();
	}
	
	@Override
	public int tinhLuong() {
		// TODO Auto-generated method stub
		luongThang=luongMotNgay*soNgayLamViec;
		return luongThang;
	}
	
	@Override
	public void xuatThongTin() {
		// TODO Auto-generated method stub
		super.xuatThongTin();
		System.out.println("Co phan cong ty: "+coPhanCongTy);
		tinhLuong();
		System.out.println("Luong mot thang: "+luongThang );
	}

	public double tongThuNhapGiamDoc(CongTy congTy,DanhSachNhanVienThuong lstNVThuong,DanhSachTruongPhong lstTPhong,DanhSachGiamDoc lstGD) {
		tinhLuong();
		double thuNhap=luongThang+coPhanCongTy*congTy.loiNhuanCongTy(lstNVThuong, lstTPhong, lstGD);
		return thuNhap;
	}
	public double getCoPhanCongTy() {
		return coPhanCongTy;
	}

	public void setCoPhanCongTy(double coPhanCongTy) {
		this.coPhanCongTy = coPhanCongTy;
	}
	
}
