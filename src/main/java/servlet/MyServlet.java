package servlet;


import io.javalin.Javalin;
import io.javalin.http.servlet.JavalinServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class MyServlet extends HttpServlet {
    private final JavalinServlet javalinServlet = Javalin.createStandalone()
            .get("/test", ctx -> ctx.result("hello from javalin"))
            .get("/hello", ctx -> ctx.result("hi"))
            .javalinServlet();

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        javalinServlet.service(request, response);
    }
}
