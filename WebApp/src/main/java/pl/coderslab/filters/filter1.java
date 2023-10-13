package pl.coderslab.filters;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

@WebFilter ("/*")

public class filter1 implements Filter {
    @Override
    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("request incoming. setting request encoding.");
        req.setCharacterEncoding("utf-8");
        filterChain.doFilter(req,resp);
        System.out.println("request incoming. setting request encoding.");
        resp.setContentType("text/html;charset=utf-8");
    }
}
