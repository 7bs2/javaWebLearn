package com.sunflower.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

/**
 * @author the sky
 */
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 设置请求与响应的编码， 防止乱码的可能
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");

        String username = req.getParameter("username");
        String pwd = req.getParameter("pwd");
        String[] nums = req.getParameterValues("nums");

        System.out.println("--------------");
        System.out.println(Arrays.toString(nums));
        System.out.println(username);
        System.out.println(pwd);
        // 重定向路径问题注意   302
        resp.sendRedirect("success.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
