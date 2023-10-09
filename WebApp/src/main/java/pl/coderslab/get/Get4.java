package pl.coderslab.get;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet ("/get4")

public class Get4 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String company = req.getParameter("company");
        String [] languages = req.getParameterValues("learn");

        if(company == null || languages == null){
            resp.getWriter().println("Brak Parametrów!");
            return;
        }

        resp.getWriter().println("company: " + "\n" + " - " + company + "\n" + "learn: ");
        for(String language: languages){
            resp.getWriter().println(" - " + language);
        }

    }
}

