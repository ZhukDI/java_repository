package servlets;

import calc.CalcOperations;
import calc.OperationType;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet(name = "CalcServlet", urlPatterns = {"/calcservlet"})
public class CalcServlet extends HttpServlet {

    private ArrayList<String> listOperations = new ArrayList();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Calculate Servlet!</title>");
        out.println("</head>");
        out.println("<body>");

        try {
            // считываем параметры
            double one = Double.valueOf(request.getParameter("one"));
            double two = Double.valueOf(request.getParameter("two"));
            String operation = String.valueOf(request.getParameter("operation"));

            // определение или создание сессии
            HttpSession session = request.getSession(true);

            // получение типа операции
            OperationType operationType = OperationType.valueOf(operation.toUpperCase());

            // калькуляция
            double result = calcResult(operationType, one, two);

            //для новой сессии создаём новый список
            if (session.isNew()) {
                listOperations.clear();
            }
//            else { // иначе получаем список из атрибутов сессии
//                listOperations = (ArrayList<String>) session.getAttribute("formula");
//            }

            // добавление новой операции в список и атрибут сессии
            listOperations.add(one + " " + operationType.getStringValue() + " " + two + " = " + result);
            session.setAttribute("formula", listOperations);

            // вывод всех операций
            out.println("<h1>ID вашей сесии равен: " + session.getId() + "</h1>");
            out.println("<h3>Список операций (всего: " + session.getId() + ") </h3>");

            for (String oper : listOperations) {
                out.println("<h3>" + oper + "</h3>");
            }

        } catch (Exception e) {
            out.println("<h3>Возникла ошибка проверьте параметры!</h3>");
        } finally {
            out.println("</body>");
            out.println("</html>");
            out.close();
        }

        out.println("</body>");
        out.println("</html>");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    private double calcResult(OperationType operationType, double one, double two) {
        double result = 0;
        switch (operationType) {
            case ADD: {
                result = CalcOperations.add(one, two);
                break;
            }
            case SUBTRACT: {
                result = CalcOperations.subtract(one, two);
                break;
            }
            case DIVIDE: {
                result = CalcOperations.subtract(one, two);
                break;
            }
            case MULTIPLY: {
                result = CalcOperations.multiply(one, two);
                break;
            }
        }
        return result;
    }
}
