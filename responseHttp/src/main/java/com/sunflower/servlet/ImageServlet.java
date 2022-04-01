package com.sunflower.servlet;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.Random;

/**
 * @author the sky
 */

public class ImageServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // 设置头部自动刷新
         resp.setHeader("refresh", "3");

        BufferedImage image = new BufferedImage(80, 20, BufferedImage.TYPE_INT_RGB);
        // 画笔
        Graphics2D g = (Graphics2D) image.getGraphics();
        g.setColor(Color.white);
        g.fillRect(0, 0, 80, 20);
        g.setColor(Color.RED);
        g.setFont(new Font(null, Font.BOLD, 20));
        g.drawString(makeNum(), 0, 20);


        resp.setContentType("image/png");

        // 不进行缓存
        resp.setDateHeader("expires", -1);
        resp.setHeader("Cache-Control", "no-cache");
        resp.setHeader("Pragma", "no-cache");

        // 专门用于写图片
        ImageIO.write(image, "png", resp.getOutputStream());
    }

    private String makeNum() {
        Random random = new Random();
        String num =  random.nextInt(9999999) + "";
        StringBuffer bf = new StringBuffer();
        for (int i = 0; i < 7 - num.length(); i++) {
            bf.append("0");
        }
        return num + bf.toString();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
