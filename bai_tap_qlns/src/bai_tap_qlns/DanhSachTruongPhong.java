package bai_tap_qlns;

import java.util.ArrayList;
import java.util.Scanner;

public class DanhSachTruongPhong implements ActionNhapDanhSachImp {
	private ArrayList<TruongPhong> lstTruongPhong;

	
	@Override
	public void nhapThongTin() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap so luong truong phong:");
		int soLuong=sc.nextInt();
		for(int i=0;i<soLuong;i++) {
			TruongPhong truongPhong=new TruongPhong();
			truongPhong.nhapThongTinNhanVien();
			lstTruongPhong.add(truongPhong);
		}
	}
	
	@Override
	public int tinhLuong() {
		// TODO Auto-generated method stub
		int luong=0;
		for(TruongPhong truongPhong:lstTruongPhong) {
			luong+=truongPhong.tinhLuong();
		}

		return luong;
	}
	
	@Override
	public void xuatThongTin() {
		// TODO Auto-generated method stub
		for(TruongPhong truongPhong:lstTruongPhong) {
			truongPhong.xuatThongTin();
		}
	}
	
	public void truongPhongCoNhieuNhanVien() {
		int soLuongMax=lstTruongPhong.get(0).getSoLuongNhanVien();
		int indexLuongMax=0;
		for(int i=0;i<lstTruongPhong.size();i++) {
			if(lstTruongPhong.get(i).getSoLuongNhanVien()>soLuongMax) {
				soLuongMax=lstTruongPhong.get(i).tinhLuong();
				indexLuongMax=i;
			}
		}
		lstTruongPhong.get(indexLuongMax).xuatThongTin();
	}
	
	public void xoaTruongPhong(String maSo,ArrayList<NhanVienThuong>lstnvt) {
		int index=-1;
		for(int i=0;i<lstTruongPhong.size();i++) {
			if(maSo.equals(lstTruongPhong.get(i).maSo)) {
				index=i;
				break;
			}
		}
		if(index!=-1) {
			for(int i=0;i<lstnvt.size();i++) {
				if(lstnvt.get(i).getTruongPhong()!=null) {
					if(maSo.equals(lstnvt.get(i).getTruongPhong().maSo)) {
						lstnvt.get(i).setTruongPhong(null);
					}
				}
			}
			lstTruongPhong.remove(index);
		}
		else {
			System.out.println("Khong ton tai truong phong");
		}
	}
	
	
	
	public DanhSachTruongPhong() {
		lstTruongPhong=new ArrayList<TruongPhong>();
	}
	
	public DanhSachTruongPhong(ArrayList<TruongPhong> lstTruongPhong) {
		this.lstTruongPhong = lstTruongPhong;
	}

	public ArrayList<TruongPhong> getLstTruongPhong() {
		return lstTruongPhong;
	}

	public void setLstTruongPhong(ArrayList<TruongPhong> lstTruongPhong) {
		this.lstTruongPhong = lstTruongPhong;
	}






	
}
