package pl.coderslab.jsp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet ("/ciachoJSP")

public class ciachoDlaJSP extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie cookie = new Cookie("foo","bar");
        cookie.setMaxAge(3600);

        resp.addCookie(cookie);
        resp.getWriter().println("Ciasteczno ustawiono!");
    }
}
