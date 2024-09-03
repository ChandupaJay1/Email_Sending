
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Mail;

/**
 *
 * @author chand
 */
@WebServlet(name = "Email", urlPatterns = {"/Email"})
public class Email extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest requset, HttpServletResponse response) throws ServletException, IOException {
        
        Mail.sendMail("sent to email", "Hello", "Ai mokda?? Gahannada");
        
    }

    

}
