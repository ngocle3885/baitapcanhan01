package abc.managentEmplotee;

import java.util.Date;

public class NhanVienCongNhat extends NhanVien {

	
	
	private int soNgay;
	
	public NhanVienCongNhat() {
		
	}
	
	public NhanVienCongNhat(String maNV) {
		super(maNV);		
	}
	
	public NhanVienCongNhat(String maNV, String hoTen) {
		super(maNV, hoTen);		
	}
	
	public NhanVienCongNhat(String maNV, String hoTen, Date ngaySinh, String diaChi) {
		super(maNV, hoTen, ngaySinh, diaChi);
	}
	
	
	public NhanVienCongNhat(String maNV, String hoTen, Date ngaySinh, String diaChi, int soNgay) {
		super(maNV, hoTen, ngaySinh, diaChi);
		this.soNgay = soNgay;
	}
	
	public int getSoNgay() {
		return soNgay;
	}

	public void setSoNgay(int soNgay) {
		this.soNgay = soNgay;
	}

	@Override
	public double tinhLuong() {
		return soNgay * 55000;
	}
	
	

}
