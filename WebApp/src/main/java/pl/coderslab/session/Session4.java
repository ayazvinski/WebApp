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

@WebServlet ("/session4")

public class Session4 extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession session = req.getSession();
        List<CartItem> cart = (List<CartItem>) session.getAttribute("cart");
        if(cart == null){
            cart = new ArrayList<>();
        }

        String productName = req.getParameter("productName");
        String quantity = req.getParameter("quantity");
        String price = req.getParameter("price");

        CartItem item = new CartItem(productName, Double.parseDouble(quantity),Double.parseDouble(price));
        cart.add(item);
        session.setAttribute("cart",cart);



    }
}
