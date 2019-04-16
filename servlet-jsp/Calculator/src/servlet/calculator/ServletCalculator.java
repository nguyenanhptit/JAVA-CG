package servlet.calculator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ServletCalculator", urlPatterns = "/calculator")
public class ServletCalculator extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float num1 = Float.parseFloat(request.getParameter("number1"));
        float num2 = Float.parseFloat(request.getParameter("number2"));
        float add = num1+num2;
        float sub = num1-num2;
        float multi = num1*num2;
        float div = num1/num2;
        String opt = request.getParameter("operator");

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        if(opt.equals("add")){
        writer.println("Tong: " +  num1 +" + " +num2 + " la: " + add);
        }else if (opt.equals("sub")){
            writer.println("Hieu: " +  num1 +" + " +num2 + " la: " + sub);
        }else if (opt.equals("multi")){
            writer.println("Tich: " +  num1 +" + " +num2 + " la: " + multi);
        }else if(opt.equals("div")){
            if(num2 == 0){
            writer.println("number 2 = " + num2 +"Khong chia duoc!!!");
            }else {
                writer.println("Thuong: " +  num1 +" + " +num2 + " la: " + div);
            }
        }
        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
