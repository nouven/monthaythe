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
public class DanhMucDao {
	public boolean insert(DanhMuc danhMuc){
		String sql = "insert into tbl_danhmuc(madanhmuc, ten) "
				  + " values(?, ?)";
		try {
			Connection conn = foo.ConnMysql.openConnection();
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, danhMuc.getMaDanhMuc());
			pstm.setString(2, danhMuc.getTenDanhMuc());
			int x = pstm.executeUpdate();
			System.out.println(x);
			pstm.close();
			conn.close();
			return true;
		} catch (SQLException ex) {
			Logger.getLogger(DanhMucDao.class.getName()).log(Level.SEVERE, null, ex);
		}
		return false;
	}
	public boolean update(DanhMuc danhMuc){
		String sql = "update tbl_danhmuc " + 
				  " set ten = ? "
				  + " where madanhmuc = ?";
		try {
			Connection conn = foo.ConnMysql.openConnection();
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, danhMuc.getTenDanhMuc());
			pstm.setString(2, danhMuc.getMaDanhMuc());
			pstm.executeUpdate();
			pstm.close();
			conn.close();
			return true;
		} catch (SQLException ex) {
			Logger.getLogger(DanhMucDao.class.getName()).log(Level.SEVERE, null, ex);
		}
		return false;
	}
	public boolean delete(String id){
		String sql = "delete from tbl_danhmuc where madanhmuc = ?";
		try {
			Connection conn = foo.ConnMysql.openConnection();
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, id);
			pstm.executeUpdate();
			pstm.close();
			conn.close();
			return true;
		} catch (SQLException ex) {
			Logger.getLogger(DanhMucDao.class.getName()).log(Level.SEVERE, null, ex);
		}
		return false;
	}
	public ArrayList<DanhMuc> selectAll(){
		String sql = "select * from tbl_danhmuc";
		ArrayList<DanhMuc> list = new ArrayList<>();
		try {
			Connection conn = foo.ConnMysql.openConnection();
			PreparedStatement pstm = conn.prepareStatement(sql);
			ResultSet rs = pstm.executeQuery();
			while(rs.next()){
				String maDanhMuc = rs.getString("madanhmuc");
				String tenDanhMuc = rs.getString("ten");
				DanhMuc danhMuc = new DanhMuc(maDanhMuc, tenDanhMuc);
				list.add(danhMuc);
			}
			pstm.close();
			conn.close();
			return list;
		} catch (SQLException ex) {
			Logger.getLogger(DanhMucDao.class.getName()).log(Level.SEVERE, null, ex);
		}
		return null;
	}
	public DanhMuc findByName(String name){
		String sql = "select * from tbl_danhmuc where madanhmuc = ?";
		try {
			Connection conn = foo.ConnMysql.openConnection();
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, name);
			ResultSet rs = pstm.executeQuery();
			DanhMuc danhMuc = null;
			if(rs.next()){
				String maDanhMuc = rs.getString("madanhmuc");
				String tenDanhMuc = rs.getString("ten");
				danhMuc = new DanhMuc(maDanhMuc, tenDanhMuc);
			}
			pstm.close();
			conn.close();
			return danhMuc;
		} catch (SQLException ex) {
			Logger.getLogger(DanhMucDao.class.getName()).log(Level.SEVERE, null, ex);
		}
		return null;
	}
	public DanhMuc findById(String id){
		String sql = "select * from tbl_danhmuc where madanhmuc = ?";
		try {
			Connection conn = foo.ConnMysql.openConnection();
			PreparedStatement pstm = conn.prepareStatement(sql);
			pstm.setString(1, id);
			ResultSet rs = pstm.executeQuery();
			DanhMuc danhMuc = null;
			if(rs.next()){
				String maDanhMuc = rs.getString("madanhmuc");
				String tenDanhMuc = rs.getString("ten");
				danhMuc = new DanhMuc(maDanhMuc, tenDanhMuc);
			}
			pstm.close();
			conn.close();
			return danhMuc;
		} catch (SQLException ex) {
			Logger.getLogger(DanhMucDao.class.getName()).log(Level.SEVERE, null, ex);
		}
		return null;
	}
	public static void main(String[] args) {
		DanhMucDao dao = new DanhMucDao();
		long miliS = System.currentTimeMillis();
		Date date = new Date(miliS);

		DanhMuc danhMuc = new DanhMuc("DM003", "DANH MUC 3");
		System.out.println(
			dao.insert(danhMuc)
		);
	}
}
