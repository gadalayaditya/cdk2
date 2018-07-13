package proj6;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

/**
 * Created by gadalaya on 7/19/2017.
 */
@WebServlet(name = "Servlet4")
public class Servlet4 extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session=request.getSession();
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();


            Long  t1 = (Long) session.getAttribute("time");
            session.setAttribute("time", Calendar.getInstance().getTimeInMillis());
            String k1 = (String)session.getAttribute("key");
            session.setAttribute("key", "page2");
        Long  t2 = (Long) session.getAttribute("time");

            RequestDispatcher rd = request.getRequestDispatcher("ServletMain");
            t1=t2-t1;
            request.setAttribute("time", t1);
            request.setAttribute("key", k1);
            rd.include(request, response);






        out.println("<br>This is page 2<br>");
        out.println(" <a href=\"Servlet3\" >page 1</a>");
        out.println(" <a href=\"Servlet5\" >page 3</a>");


        //index.html page is included in the output along with message from current servlet


    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
