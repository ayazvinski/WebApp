package pl.coderslab.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Servlet14", urlPatterns = "/servlet14")
public class Servlet14 extends HttpServlet {

        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            String browserDetails = req.getHeader("User-Agent");
            String ipAddress = req.getRemoteAddr();

            resp.getWriter().println("IP Address: " + ipAddress);
            resp.getWriter().println("Browser: " + browserDetails);

        }

    }