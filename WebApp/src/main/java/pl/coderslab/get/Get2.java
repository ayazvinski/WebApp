package pl.coderslab.get;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Map;

@WebServlet(name = "Get2", urlPatterns = "/get2")

public class Get2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Map<String, String[]> parameterMap = req.getParameterMap();

        StringBuilder stringBuilder = new StringBuilder();
        for(String key: parameterMap.keySet()){
            stringBuilder.append(key).append(": [");
            for (String value: parameterMap.get(key)){
                stringBuilder.append(value).append(" ");
            }
            stringBuilder.append(" ]");
        }
        resp.getWriter().print(stringBuilder);

    }
}
