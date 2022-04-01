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
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //  this.getInitParameter()    初始化参数 可以获取web.xml中的初始数据
        //  this.getServletConfig()    配置
        //  this.getServletContext()   连接

        // 每一个servlet都对应一个ServletContext对象管理   1. 数据共享
        ServletContext context = getServletContext();
        String userName = "你好";
        context.setAttribute("userName", userName);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
