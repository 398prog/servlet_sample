package jp.co.sss.servlet.sample12;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Search12
 */
@WebServlet("/Search12")
public class Search12 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Search12() {
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

		String type = request.getParameter("type");
		List<String> foodList = new ArrayList<String>();
		String typeName = null;

		switch (type) {
		case "001":
			typeName = "pizza";
			foodList.add("みんなのマルゲリータ");
			foodList.add("ジューシーソーセージ");
			foodList.add("トロピカーナ");
			break;
		case "002":
			typeName = "pasta";
			foodList.add("みんなのナポリタン");
			foodList.add("下町のミートソース");
			foodList.add("コクうまカルボナーラ");
			foodList.add("バター薫るたらこパスタ");
		break;
			case "003":
			typeName = "side";
			foodList.add("シェフ自慢のシーザーサラダ");
			foodList.add("ジューシーフライドチキン");
			break;
		case "004":
			typeName = "drink";
			foodList.add("昔ながらのコーラ");
			foodList.add("小笠山山麓の茶");
			foodList.add("トロピカルドリンク");
			break;
		}

		request.setAttribute("typeName", typeName);
		request.setAttribute("foodList", foodList);
		request.getRequestDispatcher("/jsp/sample12/pizza_result.jsp").forward(request,response);

	}

}
