package com.bjsxt.Servlet;
/*
*   Servlet生命周期:
*           1.从第一次调用到服务器关闭。
*           2.如果Servlet在web.xml中配置了load-on-startup,生命周期为从服务器启动到服务器关闭
*   注意:
*           init方法是对Servlet进行初始化的一个方法，会在Servlet第一次加载时进行存储时执行。
            destroy方法是在Servlet被销毁时执行,也就是服务器关闭时。
* * */
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ServletLife",urlPatterns = "/ServletLife")
public class ServletLife extends HttpServlet {
    //初始化方法

    @Override
    public void init() throws ServletException {
        System.out.println("Servlet初始化完成");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.service(req, resp);
    }

    @Override
    public void destroy() {
        System.out.println("我被销毁了...");
    }
}
