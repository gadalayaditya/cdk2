import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import java.io.IOException;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by gadalaya on 7/21/2017.
 */
@WebFilter(filterName = "Filter")
public class Filter implements javax.servlet.Filter {
    FilterConfig filterConfig;
    Map ParameterMap;
    public void destroy() {
        this.filterConfig = null;
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        if (req instanceof HttpServletRequest) {
            // Cast back to HttpServletRequest.
            HttpServletRequest httpRequest = (HttpServletRequest) req;

            // Parse HttpServletRequest.
            HttpServletRequest parsedRequest = parseRequest(httpRequest);

            // Continue with filter chain.
            chain.doFilter((ServletRequest) parsedRequest, resp);
        } else {
            // Not a HttpServletRequest.
            chain.doFilter(req, resp);
        }
    }

    public void init(FilterConfig config) throws ServletException {
        this.filterConfig = filterConfig;
    }
    public   HttpServletRequest parseRequest(ServletRequest request) throws ServletException {

        Map<String, String> parameterMap = new HashMap<String, String>();

        Enumeration<String> parameterNames = request.getParameterNames();

        while (parameterNames.hasMoreElements()) {
            String paramName = parameterNames.nextElement();
            String paramValue =request.getParameter(paramName);

            if (!paramValue.contains("java")) {

                parameterMap.put(paramName,paramValue);

            }
        }
        return new HttpServletRequestWrapper((HttpServletRequest) request) {

            public Enumeration<String> getParameterNames(){
                return Collections.enumeration(parameterMap.keySet());
            }
            public String getParameter(String s)
            {
                return parameterMap.get(s);
            }
        };
    }

}
