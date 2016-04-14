package com.forest.slownews.controller;

import com.forest.slownews.model.News;
import com.forest.slownews.model.ArchiveNewsList;
import com.forest.slownews.model.NewsList;
import com.forest.slownews.service.NewsProvider;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet({"/view/news"})
public class NewsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (req.getRequestURI().contains("news") || req.getRequestURI().equals("/")) {
            req.getSession().setAttribute("News", new NewsProvider().readNews().getNewsList());
            RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/News.jsp");
            dispatcher.forward(req, resp);
            resp.setContentLengthLong(10000);
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<News> listNews = (List<News>) req.getSession(true).getAttribute("News");
        NewsList newsList = new NewsList(listNews);
        if(req.getSession().getAttribute("LoginUsers")!=null) {
                ArchiveNewsList.getInstance().addArchiveNews(
                        req.getSession().getAttribute("LoginUsers").toString(),
                       newsList.getNewsByTile(req.getParameter("title")));
            }
    }

}
