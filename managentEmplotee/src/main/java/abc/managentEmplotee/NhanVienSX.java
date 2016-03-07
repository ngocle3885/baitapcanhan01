package abc.managentEmplotee;

import java.util.Date;

public class NhanVienSX  extends NhanVien{
	
	private int soSanPham;
	
	public NhanVienSX() {		
	}
	
	public NhanVienSX(String maNV) {
		this.maNV = maNV;
	}
	
	public NhanVienSX(String maNV, String hoTen) {
		this.maNV = maNV;
		this.hoTen = hoTen;
	}
	
	public NhanVienSX(String maNV, String hoTen, Date ngaySinh, String diaChi) {
		this.maNV = maNV;
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.diaChi =  diaChi;
	}
	
	public NhanVienSX(String maNV, String hoTen, Date ngaySinh, String diaChi, int soShamPham) {
		this.maNV = maNV;
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.diaChi =  diaChi;
		this.soSanPham = soShamPham;
	}
	

	public int getSoSanPham() {
		return soSanPham;
	}

	public void setSoSanPham(int soSanPham) {
		this.soSanPham = soSanPham;
	}

	@Override
	public double tinhLuong() {
		return soSanPham * 20000;
	}

}
