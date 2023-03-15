package wangchengtao.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import wangchengtao.bean.Academy;
import wangchengtao.dao.AcademyDao;
import wangchengtao.dao.AcademyDaoImpl;

/**
 * Servlet implementation class FindAllAcademysServlet
 */
public class FindAllAcademysServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FindAllAcademysServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		AcademyDao academyDao = new AcademyDaoImpl();
		List<Academy> academys = academyDao.findAllAcademys();
		request.setAttribute("academys", academys);
		RequestDispatcher rd = request.getRequestDispatcher("ShowAcademys.jsp");
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
