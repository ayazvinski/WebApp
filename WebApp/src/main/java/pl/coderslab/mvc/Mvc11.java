//package pl.coderslab.mvc;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
//@WebServlet ("/mvc11")
//
//public class Mvc11 extends HttpServlet {
//
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        String role = req.getParameter("role");
//        if(role == null){
//            req.setAttribute("userRole", "ROLE_" + role.toUpperCase());
//        }
//
//        getServletContext().getRequestDispatcher("/jsp1.jsp").forward(req,resp);
//    }
//}
