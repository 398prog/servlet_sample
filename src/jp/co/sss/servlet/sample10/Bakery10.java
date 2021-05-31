package jp.co.sss.servlet.sample10;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jp.co.sss.bean1.FoodData;

/**
 * Servlet implementation class Bakery10
 */
@WebServlet("/Bakery10")
public class Bakery10 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Bakery10() {
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
		FoodData food = new FoodData();

		switch (item) {
			case "A001":
				food.setFoodId("A001");
				food.setFoodName("みんなのマルゲリータ");
				food.setPrice(2380);
				break;
			case "A002":
				food.setFoodId("A002");
				food.setFoodName("ジューシーソーセージ");
				food.setPrice(1880);
				break;
			case "A003":
				food.setFoodId("A003");
				food.setFoodName("トロピカーナ");
				food.setPrice(1880);
				break;
			case "A004":
				food.setFoodId("A004");
				food.setFoodName("明太シーフード");
				food.setPrice(2280);
				break;
			case "A005":
				food.setFoodId("A005");
				food.setFoodName("冬のファンタジー");
				food.setPrice(1880);
				break;
			}

		request.setAttribute("food", food);
		request.getRequestDispatcher("/jsp/sample10/pizza.jsp").forward(request,response);

	}

}
