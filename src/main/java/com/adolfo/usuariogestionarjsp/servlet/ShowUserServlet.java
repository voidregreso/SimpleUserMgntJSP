package com.adolfo.usuariogestionarjsp.servlet;

import com.adolfo.usuariogestionarjsp.bean.User;
import com.adolfo.usuariogestionarjsp.dao.UserDao;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

// This servlet must be called: /showuser?id=<username>

@WebServlet("/showuser")
public class ShowUserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String usr = req.getParameter("id");
        UserDao ud = new UserDao();
        User u = ud.getUser(usr);
        req.setAttribute("model", u);
        req.getRequestDispatcher("showuser.jsp").forward(req, resp);
    }
}
