package pl.coderslab.filters;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@WebFilter ("/*")

public class filter2 implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        HttpServletRequest httpRequest = (HttpServletRequest) servletRequest;
        String browserDetails = httpRequest.getHeader("User-Agent");
        System.out.println("User-Agent: " + browserDetails);

        filterChain.doFilter(servletRequest,servletResponse);
    }

}
