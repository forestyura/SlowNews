package com.forest.slownews.controller;

import com.forest.slownews.model.News;
import com.forest.slownews.model.User;
import com.forest.slownews.model.UsersList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet({"/news",""})
public class NewsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("News", new InitNews().getNews());
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/News.jsp");
        dispatcher.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if(req.getSession().getAttribute("LoginUsers")!=null) {
                UsersList.getInstance().addArchiveNews(
                        req.getSession().getAttribute("LoginUsers").toString(),
                        new News(req.getParameter("name"), req.getParameter("data"), req.getParameter("img")));
            }
        resp.sendRedirect("/");
    }
}
