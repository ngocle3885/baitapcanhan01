package abc.managentEmplotee;

import java.util.Date;

public class NhanVienQuanLy extends NhanVien {

	
	
	private float heSoLuong;
	
	private float luongCanBan;
	
	

	public NhanVienQuanLy() {
		
	}
	
	public NhanVienQuanLy(String maNV) {
		super(maNV);		
	}
	
	public NhanVienQuanLy(String maNV, String hoTen) {
		super(maNV, hoTen);		
	}
	
	public NhanVienQuanLy(String maNV, String hoTen, Date ngaySinh, String diaChi) {
		super(maNV, hoTen, ngaySinh, diaChi);
	}
	
	
	public NhanVienQuanLy(String maNV, String hoTen, Date ngaySinh, String diaChi, float heSoLuong) {
		super(maNV, hoTen, ngaySinh, diaChi);
		this.heSoLuong = heSoLuong;
	}
	
	

	public float getHeSoLuong() {
		return heSoLuong;
	}

	public void setHeSoLuong(float heSoLuong) {
		this.heSoLuong = heSoLuong;
	}
	
	public float getLuongCanBan() {
		return luongCanBan;
	}

	public void setLuongCanBan(float luongCanBan) {
		this.luongCanBan = luongCanBan;
	}

	@Override
	public double tinhLuong() {
		return heSoLuong * luongCanBan;
	}
	
	

}
