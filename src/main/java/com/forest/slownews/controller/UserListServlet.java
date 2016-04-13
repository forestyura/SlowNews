package com.forest.slownews.controller;

import com.forest.slownews.model.UsersList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/view/userlist")
public class UserListServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("Users", UsersList.getInstance().getUserList());
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/UserList.jsp");
        dispatcher.forward(req,resp);
    }
}
