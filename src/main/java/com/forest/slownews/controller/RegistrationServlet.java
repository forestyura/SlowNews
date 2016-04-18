package com.forest.slownews.controller;

import com.forest.slownews.model.User;
import com.forest.slownews.model.UserDao;
import org.apache.commons.codec.digest.DigestUtils;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/view/registration")
public class RegistrationServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/Registration.jsp");
        dispatcher.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (req.getRequestURI().contains("registration")) {
            if (req.getParameter("password").equals(req.getParameter("confirm-password"))) {
                new UserDao().addUser(new User(
                        req.getParameter("username"),
                        req.getParameter("e-mail"),
                        DigestUtils.sha512Hex(req.getParameter("password"))));
                resp.sendRedirect("/view/registration");
            }
        }
    }
}
