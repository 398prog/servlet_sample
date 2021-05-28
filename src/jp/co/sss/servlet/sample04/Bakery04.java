package jp.co.sss.servlet.sample04;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Bakery04
 */
@WebServlet("/Bakery04")
public class Bakery04 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Bakery04() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String item = request.getParameter("item");
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		switch (item) {
		case "A001":
		out.println("みんなのマルゲリータ");
		break;
		case "A002":
		out.println("ジューシーソーセージ");
		break;
		case "A003":
		out.println("トロピカーナ");
		break;
		case "A004":
		out.println("明太シーフード");
		break;
		case "A005":
		out.println("冬のファンタジー");
		break;
		}
		out.println("が注文されました。");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
