package com.forest.slownews.controller;

import com.forest.slownews.model.News;

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
}
