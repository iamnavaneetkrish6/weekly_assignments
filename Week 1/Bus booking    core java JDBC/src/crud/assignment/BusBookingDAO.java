 package crud.assignment;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class BusBookingDAO {
	
	Connection conn = DBUtil.getDBConnection();

	public int insertBookingDetails(BusBooking bb) {

		String insertQuery = "insert into BusBooking values(?,?,?)";
		// ? positional parameters

		int count = 0;

		try {

			PreparedStatement pstmt = conn.prepareStatement(insertQuery);

			pstmt.setInt(1, bb.getPnr() );
			pstmt.setString(2, bb.getName());
			pstmt.setInt(3, bb.getSeatNo());

			count = pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// insert query

		return count;

	}

	public int updateBookingDetails(BusBooking bb) {

		// update query
		int count = 0;

		String updateQuery = "update BusBooking set name = ? , seat_no = ?  where pnr = ?";

		try {

			PreparedStatement pstmt = conn.prepareStatement(updateQuery);

			pstmt.setString(1, bb.getName());
			pstmt.setDouble(2, bb.getSeatNo());
			pstmt.setInt(3, bb.getPnr());

			count = pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return count;

	}

	public int deleteTicketDetails(int pnr) {

		String deleteQuery = "delete from BusBooking where pnr = ?";
		int count = 0;

		try {
			PreparedStatement pstmt = conn.prepareStatement(deleteQuery);

			pstmt.setInt(1, pnr);
			count = pstmt.executeUpdate();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return count;

	}

	public BusBooking getTicketByPnr(int pnr) {

		String selectOne = "select * from BusBooking where pnr = ?";

		BusBooking bb = null;

		try {

			PreparedStatement pstmt = conn.prepareStatement(selectOne);
			pstmt.setInt(1, pnr);

			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {

				int pnr1 = rs.getInt("pnr");
				String name = rs.getString("name");
				int seat_no = rs.getInt("seat_no");

				bb = new BusBooking(pnr1, name, seat_no);

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return bb;
	}

	public List<BusBooking> getAllBookingDetails() {

		List<BusBooking> list = new ArrayList<BusBooking>();

		String selectAll = "select * from BusBooking";

		PreparedStatement pstmt;
		try {
			pstmt = conn.prepareStatement(selectAll);
			
			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {

				int pnr1 = rs.getInt("pnr");
				String name = rs.getString("name");
				int seat_no = rs.getInt("seat_no");

				 BusBooking bb = new BusBooking(pnr1, name, seat_no);

				list.add(bb);

			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		

		
		return list;
	}

}
