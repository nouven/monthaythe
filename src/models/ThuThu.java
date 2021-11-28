/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author doquy
 */
public class ThuThu {
	String maThuThu, hoTen, email, sdt, username, password;
	String diachi;

	public ThuThu(String maThuThu, String hoTen) {
		this.maThuThu = maThuThu;
		this.hoTen = hoTen;
	}

	public ThuThu(String maThuThu, String hoTen, String email, String sdt, String username, String password, String diachi) {
		this.maThuThu = maThuThu;
		this.hoTen = hoTen;
		this.email = email;
		this.sdt = sdt;
		this.username = username;
		this.password = password;
		this.diachi = diachi;
	}

	@Override
	public String toString() {
		return "ThuThu{" + "maThuThu=" + maThuThu + ", hoTen=" + hoTen + ", email=" + email + ", sdt=" + sdt + ", username=" + username + ", password=" + password + ", diachi=" + diachi + '}';
	}
	

	public String getMaThuThu() {
		return maThuThu;
	}

	public void setMaThuThu(String maThuThu) {
		this.maThuThu = maThuThu;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSdt() {
		return sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDiachi() {
		return diachi;
	}

	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}
	
}
