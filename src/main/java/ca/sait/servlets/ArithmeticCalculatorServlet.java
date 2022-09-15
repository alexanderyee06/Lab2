package ca.sait.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author alexa
 */
public class ArithmeticCalculatorServlet extends HttpServlet {
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        this.getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String firstInput = request.getParameter("firstNum");
        String secondInput = request.getParameter("secNum");
        String operation = request.getParameter("operation");

        double first = Double.parseDouble(firstInput);
        double second = Double.parseDouble(secondInput);

        Double result;

        switch (operation) {
            case "+": {
                result = first + second;
                break;
            }
            case "-": {
                result = second - first;
                break;
            }
            case "%": {
                result = first % second;
                break;
            }
            case "*": {
                result = first * second;
                break;
            }
            default: {
                result = Double.NaN;
                break;
            }
        }
        String message;

        if (Double.isNaN(result)) { 
            message = "Result is not a number";
        } else {
            message = String.format("%.4f", result);
            message = result + "";
        }
        request.setAttribute("message", message);

        this.getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request, response);
    }

}
