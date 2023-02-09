import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name ="DiscountServlet",value = "/calculator")
public class DiscountServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String product = request.getParameter("product");
        double price = Double.parseDouble(request.getParameter("price"));
        double discount = Double.parseDouble(request.getParameter("discount"));
        double amount = price * discount * 0.01;
        double disPrice = price - amount;

        request.setAttribute("product", product);
        request.setAttribute("price", price);
        request.setAttribute("discount", discount);
        request.setAttribute("amount", amount);
        request.setAttribute("disPrice", disPrice);

        request.getRequestDispatcher("/index.jsp").forward(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
