package com.sunflower.servlet;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URLEncoder;

/**
 * @author the sky
 */
public class ReactServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // 重定向   路径会发生变化  状态码302
         resp.sendRedirect("/responseHttp_war/image");


         // resp.setStatus(HttpServletResponse.SC_MOVED_TEMPORARILY);
         // resp.setHeader("Location", "/responseHttp_war/image");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
