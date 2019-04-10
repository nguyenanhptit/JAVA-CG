package servlet.dictionary;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "ServletDictionary", urlPatterns = "/translate")
public class ServletDictionary extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("hello", "xin chao");
        dictionary.put("apple", "qua tao");
        dictionary.put("black", "den");
        dictionary.put("computer", "may tinh");
        dictionary.put("func" ,"method" );

        String search = request.getParameter("inserttext");

        PrintWriter writer = response.getWriter();

        writer.println("<html>");

        String result = dictionary.get(search);
        if (result != null) {
            writer.println("Word " + search);
            writer.println("Result " + result);
        } else {
            writer.println("not found!!!");
        }
        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
