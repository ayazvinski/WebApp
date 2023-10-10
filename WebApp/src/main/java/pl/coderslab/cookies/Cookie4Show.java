package pl.coderslab.cookies;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URL;

@WebServlet ("/showAllCookies")

public class Cookie4Show extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //resp.setContentType("text/html");
        Cookie [] cookies = req.getCookies();
        String delUrl = req.getContextPath() + "/removeCookie?cookieName=";
        for (Cookie cookie:cookies){
            resp.getWriter().println(cookie.getName() + " " + cookie.getValue() + " " + delUrl+cookie.getName());
        }

        }

    }
