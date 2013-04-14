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
        String temp = new String(request.getParameter("word").getBytes("ISO-8859-1"), "UTF-8");
        char[] word = temp.toCharArray();
        List<Character> vowels = Arrays.asList('А', 'а', 'У', 'у', 'О', 'о', 'Ы', 'ы', 'И', 'и', 'Э', 'э', 'Я', 'я', 'Ю', 'ю', 'Ё', 'ё', 'Е', 'е');
        for (int i = 0; i < word.length - 1; i++) {
            if (vowels.contains(word[i])) {
                word[i] = 'i';
            }
        }
        System.out.println(word);
        request.setAttribute("wird", new String(word));
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
