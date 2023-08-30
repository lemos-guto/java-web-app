package com.example.javawebapp;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//1. criar uma classe em java
//2. tem que extender HttpServlet
//3. anotar a classe com @WebServlet definir name e value
@WebServlet(name = "contato", value = "/contato")
public class ContatoServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String nome = req.getParameter("nome");
        String email = req.getParameter("email");
        String mensagem = req.getParameter("msg");
        //ToDo: enviar para o banco de dados
        //ToDo: se matar!
        System.out.println(nome);
        System.out.println(email);
        System.out.println(mensagem);

        res.setStatus(404);
    }
    
}
