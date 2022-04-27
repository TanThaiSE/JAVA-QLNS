package bai_tap_qlns;

import java.util.Scanner;

public class Menu {
	private int luaChon;
	
	public Menu() {
		
	}

	public void xuatMenu() {
		Scanner sc=new Scanner(System.in);
		CongTy cty=new CongTy();
		DanhSachGiamDoc danhSachGiamDoc=new DanhSachGiamDoc();
		DanhSachTruongPhong danhSachTruongPhong=new DanhSachTruongPhong();
		DanhSachNhanVienThuong danhSachNhanVienThuong=new DanhSachNhanVienThuong();
		DanhSachNhanSu danhSachNhanSu=new DanhSachNhanSu();
		while(true) {
			System.out.println("1.Nhap thong tin cong ty");
			System.out.println("2.Phan bo nhan vien vao truong phong");
			System.out.println("3.Them nhan su");
			System.out.println("4.Xoa nhan su");
			System.out.println("5.Xuat thong tin toan bo nguoi trong cong ty");
			System.out.println("6.Xuat tong luong toan cong ty");
			System.out.println("7.Nhan vien thuong co luong cao nhat");
			System.out.println("8.Truong phong co so luong nhan vien duoi quyen nhieu nhat");
			System.out.println("9.Sap xep nhan vien toan cong ty theo thu tu abc");
			System.out.println("10.Sap xep nhan vien toan cong ty theo thu tu luong giam dan");
			System.out.println("11.Giam doc co so luong co phan nhieu nhat");
			System.out.println("12.Tong thu nhap cua tung giam doc");
			System.out.println("13.Thoat");
			System.out.println("Ban chon");
			luaChon=sc.nextInt();
			if(luaChon==1) {
				System.out.println("Cong Ty");
				cty.nhapThongTinCongTy();
				System.out.println("Giam doc");
				danhSachGiamDoc.nhapThongTin();
				System.out.println("Truong phong");
				danhSachTruongPhong.nhapThongTin();
				danhSachNhanSu.addAllNhanVien(danhSachGiamDoc.getLstGiamDoc(),null, danhSachTruongPhong.getLstTruongPhong());
			}
			else if(luaChon==2) {
				System.out.println("Nhan vien thuong");
				danhSachNhanVienThuong.nhapThongTin(danhSachTruongPhong.getLstTruongPhong());
				danhSachNhanSu.addAllNhanVien(null, danhSachNhanVienThuong.getLstNhanVienThuong(), null);
			}
			else if(luaChon==3) {
				System.out.println("1.Them Giam Doc");
				System.out.println("2.Them Truong Phong");
				System.out.println("3.Them Nhan Vien Thuong ");
				System.out.println("Ban Chon");
				int chooseThem=sc.nextInt();
				if(chooseThem==1) {
					GiamDoc gd=new GiamDoc();
					gd.nhapThongTinNhanVien();
					danhSachGiamDoc.getLstGiamDoc().add(gd);
					danhSachNhanSu.getLstNhanSu().add(gd);
				}
				else if(chooseThem==2) {
					TruongPhong tp=new TruongPhong();
					tp.nhapThongTinNhanVien();
					danhSachTruongPhong.getLstTruongPhong().add(tp);
					danhSachNhanSu.getLstNhanSu().add(tp);
				}
				else if(chooseThem==3) {
					NhanVienThuong nvth=new NhanVienThuong();
					nvth.nhapThongTinNhanVienThuong(danhSachTruongPhong.getLstTruongPhong());
					danhSachNhanVienThuong.getLstNhanVienThuong().add(nvth);
					danhSachNhanSu.getLstNhanSu().add(nvth);
				}
				else {
					break;
				}
			}
			else if(luaChon==4) {
				System.out.println("1.Xoa Giam Doc");
				System.out.println("2.Xoa Truong Phong");
				System.out.println("3.Xoa Nhan Vien Thuong ");
				System.out.println("Ban Chon");
				int chooseThem=sc.nextInt();
				if(chooseThem==1) {
					System.out.println("Nhap ma so giam doc");
					int index=-1;
					String maSoGD=sc.next();
					
					for(int i=0;i<danhSachGiamDoc.getLstGiamDoc().size();i++) {
						if(maSoGD.equals(danhSachGiamDoc.getLstGiamDoc().get(i).maSo)) {
							index=i;
							break;
						}
					}
					if(index!=-1) {
						danhSachGiamDoc.getLstGiamDoc().remove(index);	
						danhSachNhanSu.xoaNhanSu(maSoGD);
					}
					else {
						System.out.println("Khong ton tai giam doc");
					}
					
				}
				else if(chooseThem==2) {
					System.out.println("Nhap ma so truong phong");
					String maSoTp=sc.next();
					danhSachTruongPhong.xoaTruongPhong(maSoTp, danhSachNhanVienThuong.getLstNhanVienThuong());
					danhSachNhanSu.xoaNhanSu(maSoTp);
				}
				else if(chooseThem==3) {
					System.out.println("Nhap ma so nhan vien thuong");
					String maSoNvt=sc.next();
					danhSachNhanVienThuong.xoaNhanVienThuong(maSoNvt, danhSachTruongPhong.getLstTruongPhong());
					danhSachNhanSu.xoaNhanSu(maSoNvt);
				}
				else {
					break;
				}
			}
			else if(luaChon==5) {
				System.out.println("Thong tin giam doc");
				danhSachGiamDoc.xuatThongTin();
				System.out.println("Thong tin truong phong");
				danhSachTruongPhong.xuatThongTin();
				System.out.println("Thong tin nhan vien thuong");
				danhSachNhanVienThuong.xuatThongTin();
			}
			else if(luaChon==6) {
				System.out.print("Tong luong toan cong ty: ");
				System.out.println(cty.tongLuongToanCongTy(danhSachNhanVienThuong, danhSachTruongPhong, danhSachGiamDoc));
			}
			else if(luaChon==7) {
				System.out.print("Nhan vien thuong co luong cao nhat: ");
				danhSachNhanVienThuong.nhanVienThuongLuongCaoNhat();
				
			}
			else if(luaChon==8) {
				System.out.println("Truong phong co so luong nhan vien duoi quyen nhieu nhat");
				danhSachTruongPhong.truongPhongCoNhieuNhanVien();
			}
			else if(luaChon==9) {
				System.out.println("Nhan vien theo thu tu abc");
				danhSachNhanSu.sapXepABC();
				danhSachNhanSu.xuatThongTin();
			}
			else if(luaChon==10) {
				System.out.println("Nhan vien theo thu tu luong giam dan");
				danhSachNhanSu.luongGiamDan();
				danhSachNhanSu.xuatThongTin();
			}
			else if(luaChon==11) {
				System.out.println("Giam doc co so luong co phan nhieu nhat "+danhSachGiamDoc.giamDocMaxCoPhan());
			}
			else if(luaChon==12) {
				System.out.println("Tong thu nhap cua tung giam doc");
				danhSachGiamDoc.xuatTongThuNhapGiamDoc(cty, danhSachNhanVienThuong, danhSachTruongPhong, danhSachGiamDoc);
			}
			else if(luaChon==13) {
				break;
			}
		}

	}
}
