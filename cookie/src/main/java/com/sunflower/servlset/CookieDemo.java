package com.sunflower.servlset;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.crypto.Data;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.util.Date;

/**
 * @author the sky
 */
public class CookieDemo extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");

        PrintWriter out = resp.getWriter();

        // cookie可能存在多个
        Cookie[] cookies = req.getCookies();
        if (cookies != null) {
            out.println("success");
            for (int i = 0; i < cookies.length; i++) {
                Cookie cookie = cookies[i];
                if (cookie.getName().equals("time")) {
                    long l = Long.parseLong(cookie.getValue());
                    Date date = new Date(l);
                    out.println(date.toLocaleString());
                }
            }
        }else {
            out.println("第一次访问");
        }

        // 服务器发给客户端cookies
        //value 只能为string     一个cookie只能保存一个信息
        // 这段代码始终执行
        // 请求头与响应头中含有cookie
        // 默认的cookie在会话结束后 浏览器会清理cookie   使用maxAge使cookie的存活时间变得更长
        // 每个站点最多给浏览器20个cookie
        Cookie cookie = new Cookie("time", System.currentTimeMillis() + "");
        // 秒为单位
        cookie.setMaxAge(24*60*60);
        resp.addCookie(cookie);


        /*
        * 删除cookie
        * 会话结束自动删除
        *  */

        // 编码 URLEncoder.encode(date.toLocaleString(), "utf-8")
        // 解码 URLDecoder.decode("", "utf-8")
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       doGet(req, resp);
    }
}
