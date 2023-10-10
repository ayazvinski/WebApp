package pl.coderslab.cookies;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet ("/cookie3")

public class Cookie3 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String cookieKey = req.getParameter("key");
        String cookieValue = req.getParameter("value");
        String cookieTime = req.getParameter("time");

        Cookie cookie = new Cookie(cookieKey, cookieValue);
        int timeInt = Integer.parseInt(cookieTime);

        cookie.setMaxAge(timeInt*60*60);
        resp.addCookie(cookie);


        resp.getWriter().println("Ciasteczko " + cookieKey + " : " + cookieValue + " zostało dodane! Czas ważności ciasteczka to " + timeInt + " godzin(y).");

    }
}
