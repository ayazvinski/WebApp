package pl.coderslab.session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet (name = "Session1Get", urlPatterns = "/session1Get")

public class Session1Get extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        Integer counter = (Integer) session.getAttribute("counter");

        if(counter != null){
            resp.getWriter().println("counter= "+ counter);
            session.setAttribute("counter= ", counter + 1);
            return;
        }
        resp.getWriter().println("brak atrybutu w sesji");
    }
}
