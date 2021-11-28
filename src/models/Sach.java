/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author doquy
 */
public class Sach {
	String maSach;
	String nxb;
	String maDanhMuc;
	String tenSach;
	String tacGia;
	int soluong;
	String ndTomTat;
	public Sach(){

	}

	public Sach(String maSach, String nxb, String maDanhMuc, String tenSach, String tacGia, int soluong, String ndTomTat) {
		this.maSach = maSach;
		this.nxb = nxb;
		this.maDanhMuc = maDanhMuc;
		this.tenSach = tenSach;
		this.tacGia = tacGia;
		this.soluong = soluong;
		this.ndTomTat = ndTomTat;
	}

	public String getMaSach() {
		return maSach;
	}

	public void setMaSach(String maSach) {
		this.maSach = maSach;
	}

	public String getNxb() {
		return nxb;
	}

	public void setNxb(String nxb) {
		this.nxb = nxb;
	}

	public String getMaDanhMuc() {
		return maDanhMuc;
	}

	public void setMaDanhMuc(String maDanhMuc) {
		this.maDanhMuc = maDanhMuc;
	}

	public String getTenSach() {
		return tenSach;
	}

	public void setTenSach(String tenSach) {
		this.tenSach = tenSach;
	}

	public String getTacGia() {
		return tacGia;
	}

	public void setTacGia(String tacGia) {
		this.tacGia = tacGia;
	}

	public int getSoluong() {
		return soluong;
	}

	public void setSoluong(int soluong) {
		this.soluong = soluong;
	}

	public String getNdTomTat() {
		return ndTomTat;
	}

	public void setNdTomTat(String ndTomTat) {
		this.ndTomTat = ndTomTat;
	}

	@Override
	public String toString() {
		return "Sach{" + "maSach=" + maSach + ", nxb=" + nxb + ", maDanhMuc=" + maDanhMuc + ", tenSach=" + tenSach + ", tacGia=" + tacGia + ", soluong=" + soluong + ", ndTomTat=" + ndTomTat + '}';
	}
	
}
