package com.adolfo.usuariogestionarjsp.servlet;

import com.adolfo.usuariogestionarjsp.bean.User;

import com.adolfo.usuariogestionarjsp.dao.UserDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@WebServlet("/adduser")
public class AddUserServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String phone = req.getParameter("phone");
        String amigos = req.getParameter("friends");
        List<String> amigo = Arrays.asList(amigos.split(","));
        User u = new User(name, phone);
        UserDao ud = new UserDao();
        u.setFriends(amigo);
        ud.addUser(u);
        req.setAttribute("model", u);
        req.getRequestDispatcher("showuser.jsp").forward(req, resp);
    }
}

