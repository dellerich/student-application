package edu.javacourse.studentorder.domain.other;

import edu.javacourse.studentorder.domain.Person;

import java.time.LocalDate;

public class Adult extends Person {

    private String passportSeria;
    private String passportNumber;
    private LocalDate issueDate;  //дата выдачи
    private String issueDepartment; //место выдачи
    private String university;
    private String studentId;

    //Переопределение метода из класса родителя Person. Дополнен добавление passportNumber
    public String getPersonString(){
        return surName + " " + givenName + ":" + passportNumber;
    }
    //Гетеры нужны для возвращения измененного значения, а сетеры, что устанавливать эти самые значения
    public String getPassportSeria() {
        return passportSeria;
    }

    public void setPassportSeria(String passportSeria) {
        this.passportSeria = passportSeria;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    public String getIssueDepartment() {
        return issueDepartment;
    }

    public void setIssueDepartment(String issueDepartment) {
        this.issueDepartment = issueDepartment;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
}
