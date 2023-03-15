package yuwenxu.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import yuwenxu.bean.Room;
import yuwenxu.utils.JDBCUtils;
import yuwenxu.dao.RoomDao;

public class RoomDaoImpl extends Room implements RoomDao {

	@Override
	public List<Room> findAllRooms() {
		// TODO Auto-generated method stub
		String sql = "select * from room";
		Connection connection = JDBCUtils.getConnection();
		try {
			PreparedStatement pstmt = connection.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			List<Room> Rooms = new ArrayList<Room>();
			while(rs.next()){
				Room Room = new Room();
				Room.setRid(rs.getInt(1));
				Room.setName(rs.getString(2));
				Room.setAddress(rs.getString(3));
				Room.setIntent(rs.getString(4));
				Room.setLastModify(rs.getDate(5));
				Rooms.add(Room);
			}
			return Rooms;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
