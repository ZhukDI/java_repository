package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet(name = "CheckOperationsServlet", urlPatterns = {"/checkoperationsservlet"})
public class CheckOperationsServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Check Servlet!</title>");
            out.println("</head>");
            out.println("<body>");

            HttpSession session = request.getSession();

            Object attr = session.getAttribute("formula");

            if (attr instanceof ArrayList) {
                ArrayList list = (ArrayList) attr;
                out.println("<h1>Список операций:</h1>");
                for (Object str : list) {
                    out.println("<h3>" + str + "</h3>");
                }
            }
            else {
                out.println("<h1>Операции не найдены</h1>");
            }
        } finally {
            out.println("</body>");
            out.println("</html>");
            out.close();
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
}
