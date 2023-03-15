package yuwenxu.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import yuwenxu.bean.Room;
import yuwenxu.dao.RoomDao;
import yuwenxu.dao.RoomDaoImpl;

/**
 * Servlet implementation class FindAllRooms
 */
public class FindAllRooms extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FindAllRooms() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RoomDao roomDao = new RoomDaoImpl();
		List<Room> rooms = roomDao.findAllRooms();
		request.setAttribute("rooms", rooms);
		RequestDispatcher rd = request.getRequestDispatcher("ShowRoom.jsp");
		rd.forward(request, response);				
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
