package pl.coderslab.cookies;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet ("/cookie51")

public class Cookie51 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie cookie = new Cookie("cookie51","przekierowanieDoCookie51");
        cookie.setMaxAge(3600);
        resp.addCookie(cookie);

        resp.setContentType("text/html");

        resp.getWriter().println("<html><body>");
        resp.getWriter().println("<a href=\"" + req.getContextPath() + "/cookie52\">Serwlet52</a>");
        resp.getWriter().println("</body></html>");
    }
    }

