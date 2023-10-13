package pl.coderslab.mvc;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet ("/mvc13")

public class Mvc13 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            String bookTitle = req.getParameter("bookTitle");
            String authorName = req.getParameter("authorName");
            int isbn = Integer.parseInt(req.getParameter("isbn"));

            Book book = new Book(bookTitle,authorName,isbn);
            req.setAttribute("book",book);


        } catch (NumberFormatException e) {
            e.printStackTrace();
        }

        getServletContext().getRequestDispatcher("/result.jsp").forward(req, resp);
    }
}
