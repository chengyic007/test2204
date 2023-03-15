package wangchengtao.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import wangchengtao.bean.Academy;
import wangchengtao.utils.JDBCUtils;

public class AcademyDaoImpl extends Academy implements AcademyDao {

	@Override
	public List<Academy> findAllAcademys() {
		// TODO Auto-generated method stub
		String sql = "select * from academy";
		Connection connection = JDBCUtils.getConnection();
		try {
			PreparedStatement pstmt = connection.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			List<Academy> academys = new ArrayList<Academy>();
			while(rs.next()){
				Academy academy = new Academy();
				academy.setAid(rs.getInt(1));
				academy.setAname(rs.getString(2));
				academy.setAdesc(rs.getString(3));
				academy.setContact(rs.getString(4));
				academy.setConphone(rs.getString(5));
				academy.setAstate(rs.getInt(6));
				academys.add(academy);
			}
			return academys;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
