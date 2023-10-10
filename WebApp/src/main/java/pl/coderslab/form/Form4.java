package pl.coderslab.form;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet ("/post4")

public class Form4 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String a = req.getParameter("a");
        String b = req.getParameter("b");
        String c = req.getParameter("c");

        double  aDouble = Double.parseDouble(a);
        double  bDouble = Double.parseDouble(b);
        double  cDouble = Double.parseDouble(c);

        double delta = ((bDouble*bDouble)-(4*aDouble*cDouble));
        double x1;
        double x2;

        if(delta<0){
            resp.getWriter().println("delta < 0");
        }else if (delta == 0){
            double x= -bDouble/(2*aDouble);
            resp.getWriter().println("x= "+ x);
        }else {
            x1 =(-bDouble-Math.sqrt(delta))/(2*aDouble);
            x2 =(-bDouble+Math.sqrt(delta))/(2*aDouble);
            resp.getWriter().println("x1= " + x1 + "\n" + "x2= " + x2);
        }

    }
}
