package com.forest.slownews.controller;

import com.forest.slownews.model.ArchiveDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/view/archive")
public class ArchiveServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            req.setAttribute("ArchiveNews", new ArchiveDao().getArchiveList(req.getSession().getAttribute("LoginUsers").toString()));
        }
        catch (NullPointerException ex) {
            System.out.println(ex);
        }
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/Archive.jsp");
        dispatcher.forward(req,resp);

    }
}
