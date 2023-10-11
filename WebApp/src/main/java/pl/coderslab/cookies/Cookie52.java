package pl.coderslab.cookies;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;

@WebServlet ("/cookie52")

public class Cookie52 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String servlet51CookieName = "cookie51";
        Cookie[] cookies = req.getCookies();

        for(Cookie c: cookies) {
            if (servlet51CookieName.equals(c.getName())) {
                c.setMaxAge(0);
                resp.getWriter().println("Witamy na stronie Cookie52!");
                return;
            }
        }
                String message = "FirstVisitCookie51";
                resp.sendRedirect("cookie51?msg=" + URLEncoder.encode(message, "UTF-8"));
                return;

        }

    }
