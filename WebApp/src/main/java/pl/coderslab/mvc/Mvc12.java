package pl.coderslab.mvc;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet ("/mvc12")

public class Mvc12 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            int startParam = Integer.parseInt(req.getParameter("start")) + 10;
            int endParam = Integer.parseInt(req.getParameter("end")) + 10;

            req.setAttribute("start", startParam);
            req.setAttribute("end", endParam);


        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        getServletContext().getRequestDispatcher("/jsp2.jsp").forward(req, resp);
    }
}
