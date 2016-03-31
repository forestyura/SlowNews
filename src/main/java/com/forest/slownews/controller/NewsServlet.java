package com.forest.slownews.controller;

import com.forest.slownews.model.InitNews;
import com.forest.slownews.model.News;
import com.forest.slownews.model.ArchiveNewsList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet({"/news",""})
public class NewsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("News", new InitNews().getNews());
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/News.jsp");
        dispatcher.forward(req,resp);
        resp.setContentLengthLong(10000);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if(req.getSession().getAttribute("LoginUsers")!=null) {
                ArchiveNewsList.getInstance().addArchiveNews(
                        req.getSession().getAttribute("LoginUsers").toString(),
                        new News(req.getParameter("name"), req.getParameter("data"), req.getParameter("image")));
            }
        System.out.println(req.getParameter("name") + req.getParameter("data") + req.getParameter("image"));
        resp.sendRedirect("/");
    }
}
