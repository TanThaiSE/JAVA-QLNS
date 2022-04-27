package bai_tap_qlns;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DanhSachNhanSu {
	private ArrayList<NhanSu> lstNhanSu;

	
	public DanhSachNhanSu() {
		lstNhanSu=new ArrayList<>();
	}

	public void addAllNhanVien(ArrayList<GiamDoc> lstgd,ArrayList<NhanVienThuong>lstnvt,ArrayList<TruongPhong>lsttp) {
		if(lstgd!=null) {
			lstNhanSu.addAll(lstgd);
		}
		if(lstnvt!=null) {
			lstNhanSu.addAll(lstnvt);
		}
		if(lsttp!=null) {
			lstNhanSu.addAll(lsttp);
		}
	}
	public void sapXepABC() {
		Collections.sort(lstNhanSu, new Comparator<NhanSu>() {
			public int compare(NhanSu ns1,NhanSu ns2) {
				return ns1.hoTen.compareTo(ns2.hoTen);
			}
		});
	}
	public void luongGiamDan() {
		Collections.sort(lstNhanSu,new Comparator<NhanSu>() {
			public int compare(NhanSu ns1,NhanSu ns2) {
				return ns2.tinhLuong()-ns1.tinhLuong();
			}
		});
	}
	public void xoaNhanSu(String maSo) {
		int index=-1;
		for(int i=0;i<lstNhanSu.size();i++) {
			if(maSo.equals(lstNhanSu.get(i).maSo)) {
				index=i;
				break;
			}
		}
		if(index!=-1) {
			lstNhanSu.remove(index);
		}
		else {
			System.out.println("Khong ton tai nhan su");
		}
	}
	public void xuatThongTin() {
		for(int i=0;i<lstNhanSu.size();i++) {
			lstNhanSu.get(i).xuatThongTin();
		}
	}
	public ArrayList<NhanSu> getLstNhanSu() {
		return lstNhanSu;
	}

	public void setLstNhanSu(ArrayList<NhanSu> lstNhanSu) {
		this.lstNhanSu = lstNhanSu;
	}
	
}
