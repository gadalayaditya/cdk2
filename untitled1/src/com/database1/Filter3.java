package com.database1;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * Created by gadalaya on 7/15/2017.
 */
@WebFilter(filterName = "Filter3")
public class Filter3 implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
       System.out.println("second filter before do");
        chain.doFilter(req, resp);
        System.out.println("second filter after do");
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
