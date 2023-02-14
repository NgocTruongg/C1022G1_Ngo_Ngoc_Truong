import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "CalculatorServlet", value ="/calculator")


public class CalculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double a1 = Double.parseDouble(request.getParameter("a1"));
        double a2 = Double.parseDouble(request.getParameter("a2"));
        String operators = request.getParameter("operators");
        double result = 0;
        switch (operators) {
            case "cong":
                result =a1 + a2;
                break;
            case "tru":
                result= a1 - a2;
                break;
            case "nhan":
                result= a1 * a2;
                break;
            case "chia":
                if (a2 == 0) {
                    throw new ArithmeticException();
                } else {
                   result = a1 / a2;
                }
        }
        request.setAttribute("result",result);
        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
