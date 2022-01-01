/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

/**
 *
 * @author doquy
 */
import java.sql.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Date;
import java.util.ArrayList;
import models.DanhMuc;

import models.DocGia;
import models.MuonTra;
public class MuonTraDao {
	public boolean insert(MuonTra muonTra){
		String sql = "insert into tbl_muontra(masach, madocgia, mathuthu, ngaymuon, songaymuon) " 
				  + " values(?, ?, ?, ?, ?)";
		try {
			Connection conn = foo.ConnMysql.openConnection();
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, muonTra.getMaSach());
			pstm.setString(2, muonTra.getMaDocGia());
			pstm.setString(3, muonTra.getMaThuThu());
			pstm.setDate(4, muonTra.getNgayMuon());
			pstm.setInt(5, muonTra.getSoNgayMuon());
			int x = pstm.executeUpdate();
			System.out.println(x);
			pstm.close();
			conn.close();
			return true;
		} catch (SQLException ex) {
			Logger.getLogger(MuonTraDao.class.getName()).log(Level.SEVERE, null, ex);
		}
		return false;
	}
	public boolean update(String maSach, String maDocGia,  Date ngayThucTra){
		String sql = "update tbl_muontra " + 
				  " set ngaythuctra = ? "
				  + " where masach = ? and madocgia = ? ";
		try {
			Connection conn = foo.ConnMysql.openConnection();
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setDate(1, ngayThucTra);
			pstm.setString(2, maSach);
			pstm.setString(3, maDocGia);
			pstm.executeUpdate();
			pstm.close();
			conn.close();
			return true;
		} catch (SQLException ex) {
			Logger.getLogger(MuonTraDao.class.getName()).log(Level.SEVERE, null, ex);
		}
		return false;
	}
	public boolean delete(String maSach, String maDocGia){
		String sql = "delete from tbl_muontra where masach = ? and madocgia = ? ";
		try {
			Connection conn = foo.ConnMysql.openConnection();
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, maSach);
			pstm.setString(2, maDocGia);
			pstm.executeUpdate();
			pstm.close();
			conn.close();
			return true;
		} catch (SQLException ex) {
			Logger.getLogger(MuonTraDao.class.getName()).log(Level.SEVERE, null, ex);
		}
		return false;
	}
	public ArrayList<MuonTra> quaHanList(){
		String sql = "select * from tbl_muontra where ngaythuctra = ? and (curdate() - ngaymuon) > songaymuon";
		ArrayList<MuonTra> list = new ArrayList<>();
		try {
			Connection conn = foo.ConnMysql.openConnection();
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, "2000-02-02");
			ResultSet rs = pstm.executeQuery();
			while(rs.next()){
				String maSach = rs.getString("masach");
				String maDocGia = rs.getString("madocgia");
				String maThuThu = rs.getString("mathuthu");
				Date ngayMuon = rs.getDate("ngaymuon");
				int soNgayMuon = rs.getInt("songaymuon");
				Date ngayThucTra = rs.getDate("ngaythuctra");
				MuonTra muonTra = new MuonTra(maSach, maDocGia, maThuThu, ngayMuon, soNgayMuon, ngayThucTra);
				list.add(muonTra);
			}
			pstm.close();
			conn.close();
			return list;
		} catch (SQLException ex) {
			Logger.getLogger(MuonTraDao.class.getName()).log(Level.SEVERE, null, ex);
		}
		return null;
	}
	public ArrayList<String> banDocMuonSachQuaHan(){
		String sql = "select distinct madocgia from tbl_muontra where ngaythuctra = ? and (curdate() - ngaymuon) > songaymuon";
		ArrayList<String> list = new ArrayList<>();
		try {
			Connection conn = foo.ConnMysql.openConnection();
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, "2000-02-02");
			ResultSet rs = pstm.executeQuery();
			while(rs.next()){
				String maDocGia = rs.getString("madocgia");
				list.add(maDocGia);
			}
			pstm.close();
			conn.close();
			return list;
		} catch (SQLException ex) {
			Logger.getLogger(MuonTraDao.class.getName()).log(Level.SEVERE, null, ex);
		}
		return null;
	}
	public ArrayList<String> banDocChuaTraSach(){
		String sql = "select distinct madocgia from tbl_muontra where ngaythuctra = ?";
		ArrayList<String> list = new ArrayList<>();
		try {
			Connection conn = foo.ConnMysql.openConnection();
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, "2000-02-02");
			ResultSet rs = pstm.executeQuery();
			while(rs.next()){
				String maDocGia = rs.getString("madocgia");
				list.add(maDocGia);
			}
			pstm.close();
			conn.close();
			return list;
		} catch (SQLException ex) {
			Logger.getLogger(MuonTraDao.class.getName()).log(Level.SEVERE, null, ex);
		}
		return null;
	}
	public ArrayList<MuonTra> chuaTraList(){
		String sql = "select * from tbl_muontra where ngaythuctra = ?";
		ArrayList<MuonTra> list = new ArrayList<>();
		try {
			Connection conn = foo.ConnMysql.openConnection();
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, "2000-02-02");
			ResultSet rs = pstm.executeQuery();
			while(rs.next()){
				String maSach = rs.getString("masach");
				String maDocGia = rs.getString("madocgia");
				String maThuThu = rs.getString("mathuthu");
				Date ngayMuon = rs.getDate("ngaymuon");
				int soNgayMuon = rs.getInt("songaymuon");
				Date ngayThucTra = rs.getDate("ngaythuctra");
				MuonTra muonTra = new MuonTra(maSach, maDocGia, maThuThu, ngayMuon, soNgayMuon, ngayThucTra);
				list.add(muonTra);
			}
			pstm.close();
			conn.close();
			return list;
		} catch (SQLException ex) {
			Logger.getLogger(MuonTraDao.class.getName()).log(Level.SEVERE, null, ex);
		}
		return null;
	}
	public ArrayList<MuonTra> sachMuonNhieuList(){
		String sql = "select * from tbl_muontra where ngaythuctra = ?";
		ArrayList<MuonTra> list = new ArrayList<>();
		try {
			Connection conn = foo.ConnMysql.openConnection();
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, "2000-02-02");
			ResultSet rs = pstm.executeQuery();
			while(rs.next()){
				String maSach = rs.getString("masach");
				String maDocGia = rs.getString("madocgia");
				String maThuThu = rs.getString("mathuthu");
				Date ngayMuon = rs.getDate("ngaymuon");
				int soNgayMuon = rs.getInt("songaymuon");
				Date ngayThucTra = rs.getDate("ngaythuctra");
				MuonTra muonTra = new MuonTra(maSach, maDocGia, maThuThu, ngayMuon, soNgayMuon, ngayThucTra);
				list.add(muonTra);
			}
			pstm.close();
			conn.close();
			return list;
		} catch (SQLException ex) {
			Logger.getLogger(MuonTraDao.class.getName()).log(Level.SEVERE, null, ex);
		}
		return null;
	}
	public ArrayList<String> topSachMuonNhieu(){
		String sql = "select masach, count(masach) as x from tbl_muontra "
				  + " group by masach "
				  + " order by x desc"
				  + " limit 5";
		ArrayList<String> list = new ArrayList<>();
		try {
			Connection conn = foo.ConnMysql.openConnection();
			PreparedStatement pstm = conn.prepareStatement(sql);
			ResultSet rs = pstm.executeQuery();
			while(rs.next()){
				String maSach = rs.getString("masach");
				list.add(maSach);
			}
			pstm.close();
			conn.close();
			return list;
		} catch (SQLException ex) {
			Logger.getLogger(MuonTraDao.class.getName()).log(Level.SEVERE, null, ex);
		}
		return null;
	}
	public ArrayList<MuonTra> selectAll(){
		String sql = "select * from tbl_muontra ";
		ArrayList<MuonTra> list = new ArrayList<>();
		try {
			Connection conn = foo.ConnMysql.openConnection();
			PreparedStatement pstm = conn.prepareStatement(sql);
			ResultSet rs = pstm.executeQuery();
			while(rs.next()){
				String maSach = rs.getString("masach");
				String maDocGia = rs.getString("madocgia");
				String maThuThu = rs.getString("mathuthu");
				Date ngayMuon = rs.getDate("ngaymuon");
				int soNgayMuon = rs.getInt("songaymuon");
				Date ngayThucTra = rs.getDate("ngaythuctra");
				MuonTra muonTra = new MuonTra(maSach, maDocGia, maThuThu, ngayMuon, soNgayMuon, ngayThucTra);
				list.add(muonTra);
			}
			pstm.close();
			conn.close();
			return list;
		} catch (SQLException ex) {
			Logger.getLogger(MuonTraDao.class.getName()).log(Level.SEVERE, null, ex);
		}
		return null;
	}
	public ArrayList<MuonTra> findByIdDocGia(String maDocGia){
		String sql = "select * from tbl_muontra where madocgia = ?";
		ArrayList<MuonTra> list = new ArrayList<>();
		try {
			Connection conn = foo.ConnMysql.openConnection();
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, maDocGia);
			ResultSet rs = pstm.executeQuery();
			while(rs.next()){
				Date ngayMuon = rs.getDate("ngaymuon");
				int soNgayMuon = rs.getInt("songaymuon");
				Date	ngayThucTra = rs.getDate("ngaythuctra");
				String maSach = rs.getString("masach");
				String maThuThu = rs.getString("mathuthu");
				MuonTra muonTra = new MuonTra(maSach, maDocGia, maThuThu, ngayMuon, soNgayMuon, ngayThucTra);
				list.add(muonTra);
			}
			pstm.close();
			conn.close();
			return list;
		} catch (SQLException ex) {
			Logger.getLogger(MuonTraDao.class.getName()).log(Level.SEVERE, null, ex);
		}
		return null;
	}
	public int  countDaMuon(String maDocGia){
		String sql = "select  count(*) as soLuong from tbl_muontra where "
				  + " madocgia = ?";
		try {
			Connection conn = foo.ConnMysql.openConnection();
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, maDocGia);
			ResultSet rs = pstm.executeQuery();
			if(rs.next()){
				int soLuong = rs.getInt("soLuong");
				return soLuong;
			}
			pstm.close();
			conn.close();
			return 0;
		} catch (SQLException ex) {
			Logger.getLogger(MuonTraDao.class.getName()).log(Level.SEVERE, null, ex);
		}
		return 0;
	}
	public int  countDaTra(String maDocGia){
		String sql = "select  count(*) as soLuong from tbl_muontra where "
				  + " madocgia = ? and ngaythuctra != ?";
		try {
			Connection conn = foo.ConnMysql.openConnection();
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, maDocGia);
			pstm.setString(2, "2000-02-02");
			ResultSet rs = pstm.executeQuery();
			if(rs.next()){
				int soLuong = rs.getInt("soLuong");
				return soLuong;
			}
			pstm.close();
			conn.close();
			return 0;
		} catch (SQLException ex) {
			Logger.getLogger(MuonTraDao.class.getName()).log(Level.SEVERE, null, ex);
		}
		return 0;
	}
	public int  countSachDuocMuon(String maSach){
		String sql = "select  count(*) as soLuong from tbl_muontra where "
				  + " masach = ?";
		try {
			Connection conn = foo.ConnMysql.openConnection();
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, maSach);
			ResultSet rs = pstm.executeQuery();
			if(rs.next()){
				int soLuong = rs.getInt("soLuong");
				return soLuong;
			}
			pstm.close();
			conn.close();
			return 0;
		} catch (SQLException ex) {
			Logger.getLogger(MuonTraDao.class.getName()).log(Level.SEVERE, null, ex);
		}
		return 0;
	}
	public MuonTra findById(String maSach, String maDocGia ){
		String sql = "select * from tbl_muontra where masach = ? and madocgia = ? ";
		try {
			Connection conn = foo.ConnMysql.openConnection();
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, maSach);
			pstm.setString(2, maDocGia);
			ResultSet rs = pstm.executeQuery();
			MuonTra muonTra = null;
			if(rs.next()){
				Date ngayMuon = rs.getDate("ngaymuon");
				int soNgayMuon = rs.getInt("songaymuon");
				Date	ngayThucTra = rs.getDate("ngaythuctra");
				String maThuThu = rs.getString("mathuthu");
				muonTra = new MuonTra(maSach, maDocGia, maThuThu, ngayMuon, soNgayMuon, ngayThucTra);
			}
			pstm.close();
			conn.close();
			return muonTra;
		} catch (SQLException ex) {
			Logger.getLogger(MuonTraDao.class.getName()).log(Level.SEVERE, null, ex);
		}
		return null;
	}
	public static void main(String[] args) {
		MuonTraDao dao = new MuonTraDao();
		long miliS = System.currentTimeMillis();
		Date date = new Date(miliS);
		MuonTra muonTra = new MuonTra("MS001", "DG002", "TT001", date, 5);
		System.out.println(dao.insert(muonTra));
	}
	
}
