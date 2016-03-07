package abc.managentEmplotee;

import java.util.Date;

public abstract class NhanVien {
	
	protected String maNV;
	protected String hoTen;
	protected Date ngaySinh;
	protected String diaChi;
	
	public NhanVien() {		
	}
	
	public NhanVien(String maNV, String hoTen, Date ngaySinh, String diaChi) {
		this.maNV = maNV;
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.diaChi = diaChi;
	}

	public NhanVien(String maNV) {
		super();
		this.maNV = maNV;
	}

	public NhanVien(String maNV, String hoTen) {
		super();
		this.maNV = maNV;
		this.hoTen = hoTen;
	}

	public NhanVien(String maNV, String hoTen, Date ngaySinh) {
		super();
		this.maNV = maNV;
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
	}

	public String getMaNV() {
		return maNV;
	}

	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public Date getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(Date ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	
	public abstract double tinhLuong();
	
	
	
	
	
	
	

}
