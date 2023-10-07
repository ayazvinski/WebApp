package pl.coderslab.Cookies.ex1;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet (name = "Cookie1Del", urlPatterns = "/deleteCookie")

public class Cookie1Del extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie [] cookies = req.getCookies();
        if(cookies != null) {
            for (Cookie c : cookies) {
                if ("User".equals(c.getName())) {
                    c.setMaxAge(0);
                    resp.addCookie(c);
                    resp.getWriter().println("ciasteczno usunięto");
                    return;
                }
            }
        }
        resp.getWriter().println("Brak!");
    }
}
