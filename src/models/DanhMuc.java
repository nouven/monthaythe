/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author doquy
 */
public class DanhMuc {
	String maDanhMuc, tenDanhMuc;

	public DanhMuc(String maDanhMuc, String tenDanhMuc) {
		this.maDanhMuc = maDanhMuc;
		this.tenDanhMuc = tenDanhMuc;
	}

	public String getMaDanhMuc() {
		return maDanhMuc;
	}

	public void setMaDanhMuc(String maDanhMuc) {
		this.maDanhMuc = maDanhMuc;
	}

	public String getTenDanhMuc() {
		return tenDanhMuc;
	}

	public void setTenDanhMuc(String tenDanhMuc) {
		this.tenDanhMuc = tenDanhMuc;
	}

	@Override
	public String toString() {
		return "DanhMuc{" + "maDanhMuc=" + maDanhMuc + ", tenDanhMuc=" + tenDanhMuc + '}';
	}
	
}
