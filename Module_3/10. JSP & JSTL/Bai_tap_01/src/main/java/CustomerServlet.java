import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CustomerServlet", value = "/customer")
public class CustomerServlet extends HttpServlet {
    private List<Customer> customerList = new ArrayList<>();

    public void init() {
        customerList.add(new Customer("Ngô Ngọc Trường", "1998-09-10", "Quảng Trị", "https://scontent.fsgn2-8.fna.fbcdn.net/v/t39.30808-6/295773736_3261861890751489_4342884028620398811_n.jpg?stp=dst-jpg_p526x296&_nc_cat=102&ccb=1-7&_nc_sid=8bfeb9&_nc_ohc=JDnu8mYen84AX9C9Go2&_nc_ht=scontent.fsgn2-8.fna&oh=00_AfCnANwVluB0YABF6CsnbV64sfnf2ioV6J5TROuu5AOtfA&oe=63EAFF92"));
        customerList.add(new Customer("Phan Nguyễn Sông Huế", "1999-03-04","Đà Nẵng", "https://scontent.fsgn2-5.fna.fbcdn.net/v/t1.15752-9/325816254_585302160127679_7039815583114934377_n.jpg?_nc_cat=106&ccb=1-7&_nc_sid=ae9488&_nc_ohc=jZzKjKKppLsAX_U73zN&_nc_ht=scontent.fsgn2-5.fna&oh=03_AdScC-TV6Rf29hc0M5TOXMABpR5ZH6LFL6A9Wh-NdLoabA&oe=640D3CE1"));
        customerList.add(new Customer("Nguyễn Văn Nam", "1983-08-21","Sài Gòn", "https://scontent.fsgn2-5.fna.fbcdn.net/v/t1.15752-9/321148035_560557412810154_7908709642134926373_n.jpg?_nc_cat=106&ccb=1-7&_nc_sid=ae9488&_nc_ohc=Fn820XSS8W0AX8zRxjo&_nc_ht=scontent.fsgn2-5.fna&oh=03_AdRWTcR1UZQGd1h_TTHKwjoEg3xQ4gAmj6D-zTMvp0Dqbw&oe=640D544B"));
        customerList.add(new Customer("Nguyễn Thái Hòa", "1995-05-04","Huế", "https://scontent.fsgn2-5.fna.fbcdn.net/v/t31.18172-8/15326268_1816226141990948_3564166672928073271_o.jpg?_nc_cat=104&ccb=1-7&_nc_sid=8bfeb9&_nc_ohc=aNqztMe6OzkAX_os7iR&tn=1oqwERuHMXqCiusA&_nc_ht=scontent.fsgn2-5.fna&oh=00_AfBD1IyB9_dOHJIcXvcBrE2DNmPFjW70S9Vumdui_bXlRQ&oe=640D4804"));
        customerList.add(new Customer("Trần Đăng Khoa", "1995-11-20","Nha Trang", "https://ca.slack-edge.com/TEBPXS5HQ-U04MYC8SX6U-42fa24b834d5-512"));

    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("customerList", customerList);
        request.getRequestDispatcher("customer.jsp").forward(request,response);

    }
}
