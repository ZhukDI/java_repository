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
            // ��������� ���������
            double one = Double.valueOf(request.getParameter("one"));
            double two = Double.valueOf(request.getParameter("two"));
            String operation = String.valueOf(request.getParameter("operation"));

            // ����������� ��� �������� ������
            HttpSession session = request.getSession(true);

            // ��������� ���� ��������
            OperationType operationType = OperationType.valueOf(operation.toUpperCase());

            // �����������
            double result = calcResult(operationType, one, two);

            //��� ����� ������ ������ ����� ������
            if (session.isNew()) {
                listOperations.clear();
            }
//            else { // ����� �������� ������ �� ��������� ������
//                listOperations = (ArrayList<String>) session.getAttribute("formula");
//            }

            // ���������� ����� �������� � ������ � ������� ������
            listOperations.add(one + " " + operationType.getStringValue() + " " + two + " = " + result);
            session.setAttribute("formula", listOperations);

            // ����� ���� ��������
            out.println("<h1>ID ����� ����� �����: " + session.getId() + "</h1>");
            out.println("<h3>������ �������� (�����: " + session.getId() + ") </h3>");

            for (String oper : listOperations) {
                out.println("<h3>" + oper + "</h3>");
            }

        } catch (Exception e) {
            out.println("<h3>�������� ������ ��������� ���������!</h3>");
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
