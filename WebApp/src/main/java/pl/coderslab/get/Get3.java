package pl.coderslab.get;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet (name = "Get3", urlPatterns = "/get3")

public class Get3 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String width = req.getParameter("width");
        String height = req.getParameter("height");

        if(width == null || height == null){
            width = "5";
            height = "10";
        }

        Integer widthInt = Integer.parseInt(width);
        Integer heightInt = Integer.parseInt(height);


        for(int i = 1; i<= heightInt; i++){
            for (int j = 1; j <=widthInt; j++) {
                resp.getWriter().print(i*j+" ");
            }
            resp.getWriter().println();
        }



    }
}

