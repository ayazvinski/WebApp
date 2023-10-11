package pl.coderslab.session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet ("/addToSession")



public class Session3Add extends HttpServlet {

    private static String FORM_HTML = "" +
            "<html lang=\"en\">\n" +
            "<body>\n" +
            "    <form action=\"\" method=\"POST\">\n" +
            "    <label>\n" +
            "        Klucz:\n" +
            "        <input type=\"text\" name=\"key\">\n" +
            "    </label>\n" +
            "    <label>\n" +
            "        Wartość:\n" +
            "        <input type=\"text\" name=\"value\">\n" +
            "    </label>\n" +
            "    <input type=\"submit\">\n" +
            "</form>\n" +
            "</body>\n" +
            "</html>";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println(FORM_HTML);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String key = req.getParameter("key");
        String value = req.getParameter("value");

        HttpSession session = req.getSession();
        session.setAttribute(key,value);

    }
}
