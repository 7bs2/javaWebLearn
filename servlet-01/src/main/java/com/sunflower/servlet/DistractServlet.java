package com.sunflower.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author the sky
 */

public class DistractServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext context = getServletContext();
        // 请求转发  路径不会发生变化 访问其他页面
        // 不同路径访问同一页面
        context.getRequestDispatcher("/test").forward(req, resp);
        resp.setContentType("text/html");
        resp.setCharacterEncoding("utf-8");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }

}