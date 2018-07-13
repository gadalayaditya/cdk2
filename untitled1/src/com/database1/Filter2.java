package com.database1;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * Created by gadalaya on 7/15/2017.
 */
@WebFilter(filterName = "Filter2")
public class Filter2 implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        System.out.println("before do filter...");
        chain.doFilter(req, resp);
        System.out.println("after do filter...");
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
