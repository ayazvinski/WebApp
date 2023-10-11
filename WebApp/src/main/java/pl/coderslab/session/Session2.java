package pl.coderslab.session;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet ("/session2")

public class Session2 extends HttpServlet {

    private static String FORM_HTML_TEMPLATE = "" +
            "<html lang=\"en\">\n" +
            "<body>\n" +
            "    <form method=\"post\">\n" +
            "        Grade: <input type=\"number\" name=\"grade\">\n" +
            "        <input type=\"submit\">\n" +
            "    </form>\n" +
            "    <div>grades=$ALL_GRADES</div>\n" +
            "    <div>avg=$AVG_VALUE</div>\n" +
            "</body>\n" +
            "</html>";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println(FORM_HTML_TEMPLATE);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();

        List<Integer> allGrades = (List<Integer>) session.getAttribute("allGrades");
        if(allGrades == null) { // ... or create new list
            allGrades = new ArrayList<>();
        }

        String gradeStr = req.getParameter("grade");

        try {
            int grade = Integer.parseInt(gradeStr);
            allGrades.add(grade);
            session.setAttribute("allGrades", allGrades);
        } catch (NumberFormatException e) {
            System.out.println("log error on server: invalid data from client");
        }

        int sum = 0;
        for (int grade : allGrades) {
            sum += grade;
        }

        String html = FORM_HTML_TEMPLATE.replace("$ALL_GRADES", allGrades.toString());
        if(sum == 0) {
            html = html.replace("$AVG_VALUE", "undefined");
        } else {
            html = html.replace("$AVG_VALUE", String.valueOf((double)sum / allGrades.size()));
        }

        resp.getWriter().println(html);
    }

    }

