package servlet.discount;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountCalculator", urlPatterns = "/calculator")
public class DiscountCalculator extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Float price = Float.parseFloat(request.getParameter("price"));

        Float percent = Float.parseFloat(request.getParameter("discount"));

        Float amount = (price * percent )/100;
        Float priceD = price - amount;
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("Gia san pham: " + price  +"$" + "<br>");
        writer.println("Giam gia: " + percent + "% , - " + amount+"$" + "<br>" );
        writer.println("Gia con: " +priceD + "$");
        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
