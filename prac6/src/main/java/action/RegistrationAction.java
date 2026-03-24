package action;

import com.opensymphony.xwork2.ActionSupport;
import model.Student;
import validator.RegistrationValidator;

public class RegistrationAction extends ActionSupport {

    private Student student = new Student();

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String execute() {

        if (!RegistrationValidator.isValid(student)) {
            return INPUT;
        }

        return SUCCESS;
    }
}