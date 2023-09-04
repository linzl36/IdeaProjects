package org.lanqiao.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 此为 Servlet 结构示例模板，仅供参考使用， 请不要将考试中的业务在此 Servlet 中实现。
 * 此为 Servlet 结构示例模板，仅供参考使用， 请不要将考试中的业务在此 Servlet 中实现。
 * 此为 Servlet 结构示例模板，仅供参考使用， 请不要将考试中的业务在此 Servlet 中实现。
 */
public class DemoServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
