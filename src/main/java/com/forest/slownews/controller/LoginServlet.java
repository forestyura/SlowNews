package com.forest.slownews.controller;

import com.forest.slownews.model.User;
import com.forest.slownews.model.UserDao;
import com.forest.slownews.model.UsersList;
import org.apache.commons.codec.digest.DigestUtils;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/view/login")
public class LogInServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/Login.jsp");
        dispatcher.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (req.getRequestURI().contains("login")) {
            for (User user : new UserDao().getUserList()) {
                if (req.getParameter("username").equals(user.getUsername()) && DigestUtils.sha512Hex(req.getParameter("password")).equals(user.getPassword())) {
                    req.getSession().setAttribute("LoginUsers", user.getUsername());
                }
            }
            resp.sendRedirect("/view/login");
        }

    }
}
