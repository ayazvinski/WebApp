package pl.coderslab.form;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.InputMismatchException;

@WebServlet("/getForm3")

public class Form3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String input = req.getParameter("page");

        try{
            int inputToInt = Integer.parseInt(input);
            for (int i = 1; i < inputToInt; i++) {
                if (inputToInt % i == 0){
                    resp.getWriter().print(i+", ");
                }
            }
        }catch (NumberFormatException me){
            resp.getWriter().println("wprowadzona wartość nie jest liczbą całkowitą!");
        }


    }
}
