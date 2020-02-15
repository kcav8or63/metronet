package com.silversky.metronet.servlet;

import com.silversky.metronet.service.DataService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(
        name = "dataservlet",
        urlPatterns = "/EnterData"
)
public class DataServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("name");
        String funFact = req.getParameter("funFact");

        System.out.println("Processing name \"" + name + "\" funFact \"" + funFact + "\"");
        DataService dataService = new DataService();
        RequestDispatcher view;
       if (dataService.isValid(name, funFact)) {
           req.setAttribute("name", name);
           req.setAttribute("funFact", funFact);
           req.setAttribute("success", "true");
       } else {
           req.setAttribute("error", "All information is required.");
           req.setAttribute("success", "false");
       }
        view = req.getRequestDispatcher("index.jsp");
        view.forward(req, resp);

    }
}
