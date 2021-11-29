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
public class MuonTra {
	String maSach, maDocGia, maThuThu;
	Date ngayMuon;
	int soNgayMuon;
	Date ngayThucTra;

	public MuonTra(String maSach, String maDocGia, String maThuThu, Date ngayMuon, int soNgayMuon) {
		this.maSach = maSach;
		this.maDocGia = maDocGia;
		this.maThuThu = maThuThu;
		this.ngayMuon = ngayMuon;
		this.soNgayMuon = soNgayMuon;
	}

	@Override
	public String toString() {
		return "MuonTra{" + "maSach=" + maSach + ", maDocGia=" + maDocGia + ", maThuThu=" + maThuThu + ", ngayMuon=" + ngayMuon + ", soNgayMuon=" + soNgayMuon + ", ngayThucTra=" + ngayThucTra + '}';
	}

	public String getMaSach() {
		return maSach;
	}

	public void setMaSach(String maSach) {
		this.maSach = maSach;
	}

	public String getMaDocGia() {
		return maDocGia;
	}

	public void setMaDocGia(String maDocGia) {
		this.maDocGia = maDocGia;
	}

	public String getMaThuThu() {
		return maThuThu;
	}

	public void setMaThuThu(String maThuThu) {
		this.maThuThu = maThuThu;
	}

	public Date getNgayMuon() {
		return ngayMuon;
	}

	public void setNgayMuon(Date ngayMuon) {
		this.ngayMuon = ngayMuon;
	}

	public int getSoNgayMuon() {
		return soNgayMuon;
	}

	public void setSoNgayMuon(int soNgayMuon) {
		this.soNgayMuon = soNgayMuon;
	}

	public Date getNgayThucTra() {
		return ngayThucTra;
	}

	public void setNgayThucTra(Date ngayThucTra) {
		this.ngayThucTra = ngayThucTra;
	}

	public MuonTra(String maSach, String maDocGia, String maThuThu, Date ngayMuon, int soNgayMuon, Date ngayThucTra) {
		this.maSach = maSach;
		this.maDocGia = maDocGia;
		this.maThuThu = maThuThu;
		this.ngayMuon = ngayMuon;
		this.soNgayMuon = soNgayMuon;
		this.ngayThucTra = ngayThucTra;
	}
}
