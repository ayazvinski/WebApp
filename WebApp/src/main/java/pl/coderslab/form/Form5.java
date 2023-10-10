package pl.coderslab.form;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet ("/post5")

public class Form5 extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String degrees = req.getParameter("degrees");
        String conversionType = req.getParameter("conversionType");

        double degreeDouble = Double.parseDouble(degrees);

        if (conversionType.equals("celcToFahr")){
            double fahrTemp = (degreeDouble*9/5)+32;
            resp.getWriter().println(degrees + " (°C) = " + fahrTemp +" Fahrenheit (°F).");
        }else{
            double celsTemp = ((degreeDouble-32)*5/9);
            resp.getWriter().println(degrees + " (°F) = " + celsTemp +" Celsius (°C).");
        }

    }
}
