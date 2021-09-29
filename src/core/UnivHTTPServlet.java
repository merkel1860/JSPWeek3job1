package core;

import core.model.DAO;
import core.model.Student;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet(description = "This servlet ensure registration and " +
        "then subsequent logins", urlPatterns = {"/"})

public class UnivHTTPServlet extends HttpServlet {
    public void init(ServletConfig conf) throws ServletException {
        super.init(conf);

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doPost(req, resp);
        Student aStudent;
        String do_this = req.getParameter("do_this");

        if (do_this == null) {
            resp.sendRedirect("/");
        } else if (do_this.compareToIgnoreCase("adduser") == 0) {
            // retrieve params from form and create a new student
            aStudent = extractStudentParams(req);
            // add new student to actual student list
            addingStudent2DB(aStudent);
            // passing recently created user as params for profile page
            String fullname = aStudent.getLname() + " " + aStudent.getFname();
            req.setAttribute("fname", fullname);
            req.setAttribute("email", aStudent.getEmail());
            // getServlet Context for the next redirection
            ServletContext sc = getServletContext();
            RequestDispatcher rd = sc.getRequestDispatcher("/profile.jsp");
            rd.forward(req, resp);
//            resp.sendRedirect("/JSPWeek3job1_war_exploded/profile.jsp");
        } else if (do_this.compareToIgnoreCase("addcourse") == 0) {
            String currentCourse = req.getParameter("course");
            req.setAttribute("course",currentCourse);
            DAO.getDAOInstance().getCourseList().add(currentCourse);
            // getServlet Context for the next redirection
            ServletContext sc = getServletContext();
            RequestDispatcher rd = sc.getRequestDispatcher("/");
            rd.forward(req, resp);
        } else {
            System.out.println("Verrückt");
        }


    }

    private void addingStudent2DB(Student aStudent) {
        DAO.getDAOInstance().getStudentList().add(aStudent);
    }

    private Student extractStudentParams(HttpServletRequest req) {
        Student aStudent;
        aStudent = new Student();
        aStudent.setFname(req.getParameter("fname"));
        aStudent.setLname(req.getParameter("lname"));
        aStudent.setEmail(req.getParameter("enail"));

        return aStudent;
    }
}
