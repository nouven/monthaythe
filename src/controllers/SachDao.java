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

import models.Sach;
public class SachDao {
	public boolean insert(Sach sach){
		String sql = "insert into tbl_sach(masach, nxb, madanhmuc, tensach, tacgia, soluong, ndtomtat)"
				  + " values(?, ?, ?, ?, ?, ?, ?)";
		try {
			Connection conn = foo.ConnMysql.openConnection();
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, sach.getMaSach());
			pstm.setString(2, sach.getNxb());
			pstm.setString(3, sach.getMaDanhMuc());
			pstm.setString(4, sach.getTenSach());
			pstm.setString(5, sach.getTacGia());
			pstm.setInt(6, sach.getSoluong());
			pstm.setString(7, sach.getNdTomTat());
			int x = pstm.executeUpdate();
			System.out.println(x);
			pstm.close();
			conn.close();
			return true;
		} catch (SQLException ex) {
			Logger.getLogger(SachDao.class.getName()).log(Level.SEVERE, null, ex);
		}
		return false;
	}
	public boolean update(Sach sach){
		String sql = "update tbl_sach " + 
				  " set nxb = ?, madanhmuc = ?, tensach = ?, tacgia = ?, soluong = ?, ndtomtat= ? "
				  + " where masach = ?";
		try {
			Connection conn = foo.ConnMysql.openConnection();
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, sach.getNxb());
			pstm.setString(2, sach.getMaDanhMuc());
			pstm.setString(3, sach.getTenSach());
			pstm.setString(4, sach.getTacGia());
			pstm.setInt(5, sach.getSoluong());
			pstm.setString(6, sach.getNdTomTat());
			pstm.setString(7, sach.getMaSach());
			pstm.executeUpdate();
			pstm.close();
			conn.close();
			return true;
		} catch (SQLException ex) {
			Logger.getLogger(SachDao.class.getName()).log(Level.SEVERE, null, ex);
		}
		return false;
	}
	public boolean delete(String id){
		String sql = "delete from tbl_sach where masach = ?";
		try {
			Connection conn = foo.ConnMysql.openConnection();
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, id);
			pstm.executeUpdate();
			pstm.close();
			conn.close();
			return true;
		} catch (SQLException ex) {
			Logger.getLogger(SachDao.class.getName()).log(Level.SEVERE, null, ex);
		}
		return false;
	}
	public ArrayList<Sach> selectAll(){
		String sql = "select * from tbl_sach";
		ArrayList<Sach> list = new ArrayList<>();
		try {
			Connection conn = foo.ConnMysql.openConnection();
			PreparedStatement pstm = conn.prepareStatement(sql);
			ResultSet rs = pstm.executeQuery();
			while(rs.next()){
				String maSach = rs.getString("masach");
				String nxb = rs.getString("nxb");
				String maDanhMuc = rs.getString("madanhmuc");
				String tenSach = rs.getString("tensach");
				String tacGia = rs.getString("tacgia");
				int soLuong = rs.getInt("soluong");
				String ndTomTat = rs.getString("ndtomtat");
				Sach sach = new Sach(maSach, nxb, maDanhMuc, tenSach, tacGia, soLuong, ndTomTat);
				list.add(sach);
			}
			pstm.close();
			conn.close();
			return list;
		} catch (SQLException ex) {
			Logger.getLogger(SachDao.class.getName()).log(Level.SEVERE, null, ex);
		}
		return null;
	}
	public ArrayList<Sach> findByName(String name){
		String sql = "select * from tbl_sach where tensach like ? or tensach like ? or tensach like ?";
		ArrayList<Sach> list = new ArrayList<>();
		try {
			Connection conn = foo.ConnMysql.openConnection();
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, name + "%");
			pstm.setString(2, "%" + name + "%");
			pstm.setString(3, "%" + name);
			ResultSet rs = pstm.executeQuery();
			while(rs.next()){
				String maSach = rs.getString("masach");
				String nxb = rs.getString("nxb");
				String maDanhMuc = rs.getString("madanhmuc");
				String tenSach = rs.getString("tensach");
				String tacGia = rs.getString("tacgia");
				int soLuong = rs.getInt("soluong");
				String ndTomTat = rs.getString("ndtomtat");
				Sach sach = new Sach(maSach, nxb, maDanhMuc, tenSach, tacGia, soLuong, ndTomTat);
				list.add(sach);
			}
			pstm.close();
			conn.close();
			return list;
		} catch (SQLException ex) {
			Logger.getLogger(SachDao.class.getName()).log(Level.SEVERE, null, ex);
		}
		return null;
	}
	public ArrayList<Sach> findByCategory(String category){
		String sql = "select * from tbl_sach where madanhmuc = ?";
		ArrayList<Sach> list = new ArrayList<>();
		try {
			Connection conn = foo.ConnMysql.openConnection();
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, category);
			ResultSet rs = pstm.executeQuery();
			while(rs.next()){
				String maSach = rs.getString("masach");
				String nxb = rs.getString("nxb");
				String maDanhMuc = rs.getString("madanhmuc");
				String tenSach = rs.getString("tensach");
				String tacGia = rs.getString("tacgia");
				int soLuong = rs.getInt("soluong");
				String ndTomTat = rs.getString("ndtomtat");
				Sach sach = new Sach(maSach, nxb, maDanhMuc, tenSach, tacGia, soLuong, ndTomTat);
				list.add(sach);
			}
			pstm.close();
			conn.close();
			return list;
		} catch (SQLException ex) {
			Logger.getLogger(SachDao.class.getName()).log(Level.SEVERE, null, ex);
		}
		return null;
	}
	public Sach findById(String id){
		String sql = "select * from tbl_Sach where masach = ?";
		try {
			Connection conn = foo.ConnMysql.openConnection();
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, id);
			ResultSet rs = pstm.executeQuery();
			Sach sach = null;
			if(rs.next()){
				String maSach = rs.getString("masach");
				String nxb = rs.getString("nxb");
				String maDanhMuc = rs.getString("madanhmuc");
				String tenSach = rs.getString("tensach");
				String tacGia = rs.getString("tacgia");
				int soLuong = rs.getInt("soluong");
				String ndTomTat = rs.getString("ndtomtat");
				sach = new Sach(maSach, nxb, maDanhMuc, tenSach, tacGia, soLuong, ndTomTat);
			}
			pstm.close();
			conn.close();
			return sach;
		} catch (SQLException ex) {
			Logger.getLogger(SachDao.class.getName()).log(Level.SEVERE, null, ex);
		}
		return null;
	}
	public static void main(String[] args) {
		SachDao dao = new SachDao();
		long miliS = System.currentTimeMillis();
		Date date = new Date(miliS);
		Sach sach = new Sach("MS003", "NXB 2", "DM002", "ten sach 3", "Do Quy Nguyen", 20, "noi dung tom tat");
	}
}
