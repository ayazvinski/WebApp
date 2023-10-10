package pl.coderslab.form;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet ("/post2")

public class Form2 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String[] badWords = {"cholera", "idiota","frajer"};

        String inputMessage = req.getParameter("userMessage");
        String userAcknowledge = req.getParameter("userAcknowledge");

        if(userAcknowledge != null){
            resp.getWriter().println(inputMessage);
        } else {
            for(String notAllowed : badWords){
                final String stars = "*".repeat(notAllowed.length());
                inputMessage = inputMessage.replaceAll(notAllowed, stars);
            }
            resp.getWriter().println(inputMessage);
        }





    }
}
