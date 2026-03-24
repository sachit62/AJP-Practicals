package validator;

import model.Student;

public class RegistrationValidator {

    public static boolean isValid(Student student) {

        if (student.getName() == null || student.getName().trim().isEmpty())
            return false;

        if (student.getEmail() == null || !student.getEmail().contains("@"))
            return false;

        if (student.getCourse() == null || student.getCourse().isEmpty())
            return false;

        return true;
    }
}