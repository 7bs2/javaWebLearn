package com.sunflower.servlet;

import javax.servlet.ServletContext;
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

public class FileServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String path = "D:\\javaProject\\javaWeb-01\\responseHttp\\target\\responseHttp\\WEB-INF\\classes\\data.md";
        //文件名
        String name = path.substring(path.lastIndexOf("\\") + 1);
        // 浏览器头信息支持下载
        resp.setHeader("Content-Disposition", "attachment;filename=" + URLEncoder.encode(name, "UTF-8"));
        FileInputStream inputStream = new FileInputStream(path);

        // 缓存区
        int len = 0;
        byte[] buffer = new byte[1024];
        ServletOutputStream outputStream = resp.getOutputStream();
        while ((len = inputStream.read(buffer)) > 0) {
            outputStream.write(buffer, 0 ,len);
        }
        inputStream.close();
        outputStream.close();

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
