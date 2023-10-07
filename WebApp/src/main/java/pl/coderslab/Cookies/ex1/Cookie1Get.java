package pl.coderslab.Cookies.ex1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet (name = "Cookie1Get", urlPatterns = "/showCookie")

public class Cookie1Get extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie [] cookies = req.getCookies();
        if(cookies != null) {
            for (Cookie c : cookies) {
                if ("User".equals(c.getName())) {
                    resp.getWriter().println("Cookie User=" + c.getValue());
                    return;
                }
            }
        }

        resp.getWriter().println("brak ciasteczka User!");
    }
}
