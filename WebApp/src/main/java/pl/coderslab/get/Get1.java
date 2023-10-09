package pl.coderslab.get;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet (name = "Get1", urlPatterns = "/get1")

public class Get1 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String start = req.getParameter("start");
        String end = req.getParameter("end");

        if( start == null || end == null) {
            resp.getWriter().print("BRAK");
            return;
        }

        Integer startInt = Integer.parseInt(start);
        Integer endInt = Integer.parseInt(end);

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = startInt; i <= endInt; i++) {
            stringBuilder.append(i).append(" ");
        }

        resp.getWriter().print(stringBuilder);

    }
}
