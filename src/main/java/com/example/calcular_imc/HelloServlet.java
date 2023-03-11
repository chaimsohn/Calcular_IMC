package com.example.calcular_imc;

import java.io.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String temporario;
        float peso = 0;
        float altura = 0;
        float imc = 0;

        temporario = req.getParameter("peso");
        peso = Float.parseFloat(temporario.replaceAll(",","."));

        temporario = req.getParameter("altura");
        altura = Float.parseFloat(temporario.replaceAll(",","."));

        imc = peso / (altura * altura);

        req.setAttribute("imc", imc);
        req.getRequestDispatcher("index.jsp").forward(req, resp);
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("index.jsp").forward(req, resp);
    }
}