package jp.co.sss.servlet.sample06;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Bakery06
 */
@WebServlet("/Bakery06")
public class Bakery06 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Bakery06() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String item = request.getParameter("item");
			String pizza = null;
			switch (item) {
				case "A001":
					pizza = "みんなのマルゲリータ";
					break;
				case "A002":
					pizza = "ジューシーソーセージ";
					break;
				case "A003":
					pizza = "トロピカーナ";
					break;
				case "A004":
					pizza = "明太シーフード";
					break;
				case "A005":
					pizza = "冬のファンタジー";
					break;
			}

		request.setAttribute("pizza", pizza);
		request.getRequestDispatcher("/jsp/sample06/pizza.jsp").forward(request,response);
		}



}
