package com.adolfo.usuariogestionarjsp.servlet;

import com.adolfo.usuariogestionarjsp.bean.User;
import com.adolfo.usuariogestionarjsp.dao.UserDao;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collection;

@WebServlet("/deluser")
public class DelUserServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("name");
        UserDao ud = new UserDao();
        boolean res = ud.delUser(id);
        if(res) {
            Collection<User> todos = ud.getAllUsers();
            req.setAttribute("model", todos);
            req.getRequestDispatcher("users.jsp").forward(req, resp);
        } else {
            req.getRequestDispatcher("updatefail.jsp").forward(req, resp);
        }
    }
}

