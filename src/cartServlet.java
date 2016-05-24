
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class cartServlet i looked up this class in the
 * Internet
 */
@WebServlet("/cartServlet")
public class cartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public cartServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String itemId = request.getParameter("itemID");
		cart shopCart;
		if (itemId == null) {
			shopCart = new cart();
			Enumeration<String> names = request.getParameterNames();
			while (names.hasMoreElements()) {
				itemId = names.nextElement();
				shopCart.addItem(itemId, request.getParameter(itemId));
			}
		} else {
			shopCart = (cart) request.getSession().getAttribute("cart");
			shopCart.addItem(itemId, "1");
		}
		updateAttribute(request, shopCart);
		RequestDispatcher dispatcher = request.getRequestDispatcher("storeCart.jsp");
		dispatcher.forward(request, response);
	}

	private void updateAttribute(HttpServletRequest request, cart shopCart) {
		request.getSession().setAttribute("cart", shopCart);

	}

}
