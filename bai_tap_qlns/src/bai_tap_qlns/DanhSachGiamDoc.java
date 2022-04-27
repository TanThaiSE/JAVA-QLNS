package bai_tap_qlns;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

public class DanhSachGiamDoc implements ActionNhapDanhSachImp{
	private ArrayList<GiamDoc> lstGiamDoc;

	

	@Override
	public void nhapThongTin() {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Nhap so luong giam doc:");
		int soLuong=sc.nextInt();
		for(int i=0;i<soLuong;i++) {
			GiamDoc giamDoc=new GiamDoc();
			giamDoc.nhapThongTinNhanVien();
			lstGiamDoc.add(giamDoc);
		}
		
	}
	
	@Override
	public int tinhLuong() {
		// TODO Auto-generated method stub
		int luong=0;
		for(GiamDoc giamDoc:lstGiamDoc) {
			luong+=giamDoc.tinhLuong();
		}
		return luong;
	}
	
	public DanhSachGiamDoc() {
		lstGiamDoc=new ArrayList<GiamDoc>();
	}
	
	public ArrayList<GiamDoc> getLstGiamDoc() {
		return lstGiamDoc;
	}

	public void setLstGiamDoc(ArrayList<GiamDoc> lstGiamDoc) {
		this.lstGiamDoc = lstGiamDoc;
	}

	@Override
	public void xuatThongTin() {
		// TODO Auto-generated method stub
		for(GiamDoc giamDoc:lstGiamDoc) {
			giamDoc.xuatThongTin();
		}
	}

	public String giamDocMaxCoPhan() {
		double max=lstGiamDoc.get(0).getCoPhanCongTy();
		int indexMax=0;
		for(int i=0;i<lstGiamDoc.size();i++) {
			BigDecimal b1=new BigDecimal(lstGiamDoc.get(i).getCoPhanCongTy()+"");
			BigDecimal b2=new BigDecimal(max+"");
			if(b1.compareTo(b2)==1) {
				max=lstGiamDoc.get(i).getCoPhanCongTy();
				indexMax=i;
			}
		}
		
		return lstGiamDoc.get(indexMax).hoTen;
	}
	public void xuatTongThuNhapGiamDoc(CongTy congTy,DanhSachNhanVienThuong lstNVThuong,DanhSachTruongPhong lstTPhong,DanhSachGiamDoc lstGD) {
		for(int i=0;i<lstGiamDoc.size();i++) {
			System.out.print("Giam doc ten: "+lstGiamDoc.get(i).hoTen+" co thu nhap la: "+lstGiamDoc.get(i).tongThuNhapGiamDoc(congTy, lstNVThuong, lstTPhong, lstGD));
			
		}
	}
	
}
