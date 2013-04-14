package controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class ControllerServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String temp = new String(request.getParameter("word").getBytes("ISO-8859-1"),"UTF-8");
        char[] word = temp.toCharArray();
//        System.out.println(new String(request.getParameter("word").getBytes("ISO-8859-1"),"UTF-8"));
        List<Character> vowels = Arrays.asList('а', 'у', 'о', 'ы', 'и', 'э', 'я', 'ю', 'ё', 'е');
        for (int i = 0; i < word.length-1; i++) {
            if (vowels.contains(word[i])){
                word[i] = 'i';
            }
        }
        System.out.println(word);
        request.setAttribute("wird", word);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/index.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }
}
