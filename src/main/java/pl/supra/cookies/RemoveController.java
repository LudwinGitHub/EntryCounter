package pl.supra.cookies;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet("/remove")
public class RemoveController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Cookie removeCookie = new Cookie("visits","");
        removeCookie.setMaxAge(0);
        response.addCookie(removeCookie);
        request.getRequestDispatcher("/removeConfirm.jsp").forward(request, response);
    }
}
