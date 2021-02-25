package controllers.titles;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.Title;

/**
 * Servlet implementation class TitlesShowServlet
 */
@WebServlet("/titles/new")
public class TitlesNewServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public TitlesNewServlet() {
        super();
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("_token", request.getSession().getId());

        Title t = new Title();
        request.setAttribute("titles", t);

        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/views/titles/new.jsp");
        rd.forward(request, response);
    }

}
