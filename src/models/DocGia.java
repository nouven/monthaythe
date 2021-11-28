/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author doquy
 */
import java.sql.Date;
public class DocGia {
	String maDocGia;
	String hoTen;
	Date ngaySinh;
	int goiTinh;
	String sdt;
	String email;
	String diaChi;

	public DocGia(String maDocGia, String hoTen, Date ngaySinh, int goiTinh, String sdt, String email, String diaChi) {
		this.maDocGia = maDocGia;
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.goiTinh = goiTinh;
		this.sdt = sdt;
		this.email = email;
		this.diaChi = diaChi;
	}

	public String getMaDocGia() {
		return maDocGia;
	}

	public void setMaDocGia(String maDocGia) {
		this.maDocGia = maDocGia;
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

	@Override
	public String toString() {
		return "DocGia{" + "maDocGia=" + maDocGia + ", hoTen=" + hoTen + ", ngaySinh=" + ngaySinh + ", goiTinh=" + goiTinh + ", sdt=" + sdt + ", email=" + email + ", diaChi=" + diaChi + '}';
	}

	public int getGoiTinh() {
		return goiTinh;
	}

	public void setGoiTinh(int goiTinh) {
		this.goiTinh = goiTinh;
	}

	public String getSdt() {
		return sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	
}
