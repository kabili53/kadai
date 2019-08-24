package controllers.reports;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class ReportsCount
 */
@WebServlet("/reports/count")
public class ReportsCount extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public void init(ServletConfig config) throws ServletException{
        super.init(config);
        Integer count = 0;
        ServletContext application = config.getServletContext();
        application.setAttribute("count", count);
        System.out.println("ini()が実行されました");
    }
    public ReportsCount() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        ServletContext application = this.getServletContext();
        Integer count = (Integer)application.getAttribute("count");
        count++;
        application.setAttribute("count", count);


    }

}
